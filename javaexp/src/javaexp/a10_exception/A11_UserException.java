package javaexp.a10_exception;

public class A11_UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("# 프로그램 시작 #");
		int num01 = (int)(Math.random()*2+1);
		System.out.println("나온 수:"+num01);
		try {
			if(num01==1) {
				throw new User02Exception();
			}
		}catch(User02Exception e) {
			System.out.println("예외 메시지 내용:"+e.getMessage());
		}
		System.out.println("# 프로그램 종료 #");
	}
}
// ex) User02Exception으로 예외 클래스를 사용자 정의로 선언하고
//     main()에서 임의의 수((int)(Math.random()*2+1)- 1~2)가 발생할 때,
//     1일 나오면 예외 객체를 던져 처리되게 하세요..
class User02Exception extends Exception{
	User02Exception(){
		super("1이 나왔습니다!![예외]");
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "[재정의된 메서드 호출]"+super.getMessage();
	}
}




