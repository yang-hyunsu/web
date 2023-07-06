package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Code;

/**
 * Servlet implementation class A06_CodeUpdate
 */
@WebServlet(name = "codeupdate.do", urlPatterns = { "/codeupdate.do" })
public class A06_CodeUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A06_CodeUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		// 1. 요청값  title refno ordno val no
		String title = request.getParameter("title"); 
		if(title==null) title="";
		System.out.println("title:"+title);
		String refnoS = request.getParameter("refno");
		int refno = 0;
		if(refnoS!=null&&!refnoS.equals("")) 
			refno = Integer.parseInt(refnoS);
		String ordnoS = request.getParameter("ordno");
		int ordno = 0;
		if(ordnoS!=null&&!ordnoS.equals("")) 
			ordno = Integer.parseInt(ordnoS);
		String val = request.getParameter("val"); 
		if(val==null) val="";
		String noS = request.getParameter("no"); 
		System.out.println("수정할 번호:"+noS);
		int no = 0;
		if(noS!=null&&!noS.equals("")) 
			no = Integer.parseInt(noS);
		// key에 대한 요청값이 있을 때 처리..
		Code code = new Code(0,"","",0,0);
		
		if(no!=0) {
			
			//Code(int no, String title, String val, int refno, int ordno)
			// 2. 수정처리
			Code upt = new Code(no,title,val,refno,ordno);
			A04_PreparedDao dao = new A04_PreparedDao();
			dao.updateCode(upt);
			// 3. 상세데이터가져오기
			code = dao.getCode(no);
		}
		// 4. json데이터 처리
		Gson g = new Gson();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		response.getWriter().print(g.toJson(code));
	}

}
