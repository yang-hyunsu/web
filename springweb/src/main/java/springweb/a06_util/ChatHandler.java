package springweb.a06_util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
// chatHandler
@Component
public class ChatHandler extends TextWebSocketHandler{
	// 접속한 채팅 소켓세션설정(접속자 저장)
	private Map<String, WebSocketSession> 
		users = new ConcurrentHashMap();
	// 입력한 접속자 아이디 리스트 저장
	// socket server에서 제공하는 고유 id : 0, 1,2,....a,b...
	// 입력한 himan 같이 저장...
	private Map<String, String> ids = new ConcurrentHashMap();

	// 접속시
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		// TODO Auto-generated method stub
		super.afterConnectionEstablished(session);
		System.out.println(session.getId()+"님 접속했습니다.");
		// 접속한 사용자 id와 session을 누적해서 추가 처리.
		users.put(session.getId(),session);
	}
	// 메시지 전달(특정한 접속자가 보낸 메시지를 socket서버에 접속한 
	// 모든 사용자에게 전송)
	// push방식으로 각 사용자들에 웹으로 메시지를 전달 처리..
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// TODO Auto-generated method stub
		super.handleTextMessage(session, message);
		// message.getPayload()
		// 를 통해서 전송메시지가 온다. @@@ : 메시지...
		// 받은 메시지
		String msg = (String)message.getPayload();
		// 홍길동:접속했습니다.
		// 홍길동:안녕하세요...
		/*
		// :연결을 종료하였습니다.
		// :접속하셨습니다.
		*/
		// {"홍길동","접속했습니다."}
		System.out.println("메시지내용-"+msg);
		System.out.println("고유 session 아이디:"+session.getId());
		String []msgArry = msg.split(":");
		System.out.println("등록할 전송 아이디:"+msgArry[0]);
		if(msgArry[1].trim().equals("접속했습니다.")) {
			// 전역변수에, web socket session 고유 id와 함께 접속자 등록.
			ids.put(session.getId(), msgArry[0]);
		}	
		System.out.println(session.getId()+"님이 보낸메시지:"+message.getPayload());
		for(WebSocketSession ws:users.values()) {
			ws.sendMessage(message);
		}		
	}
	// 종료시
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		// TODO Auto-generated method stub
		super.afterConnectionClosed(session, status);
		System.out.println(session.getId()+"님 접속 종료되었습니다.");
		// 전역변수로 되어있는 사용자 명단에서 삭제 처리..
		users.remove(session.getId());
		ids.remove(session.getId());
	}
	// 에러발생시
	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		// TODO Auto-generated method stub
		super.handleTransportError(session, exception);
		System.out.println(session.getId()+"님 에러가 발생했습니다!"+
				exception.getMessage());

	}
	// 현재 접속중에 사용자를 리스트를 전달하기 위해 선언.
	// controller 단에서 ajax로 호출하여 가져올 수 있게 처리..
	public List<String> getIds(){
		List<String> idList = new ArrayList<String>();
		for(String id:ids.keySet()) {
			// socket session에 연결된 실제 입력된 아이디를
			// list에 할당..
			idList.add(ids.get(id));
		}
		return idList;
	}
	
	
	
}
