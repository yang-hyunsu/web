package backendWeb.a02_mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.a01_dao.A04_PreparedDao;
import backendWeb.z01_vo.Emp;

/**
 * Servlet implementation class A01_EmpController
 */
@WebServlet(name = "empList.do", urlPatterns = { "/empList.do" })
public class A01_EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** 16:05~
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청값 한글 encoding 처리
		request.setCharacterEncoding("utf-8");
		
		// TODO Auto-generated method stub
		// 1. 요청값 처리
		String ename = request.getParameter("ename");
		if(ename==null) ename="";
		String job = request.getParameter("job");
		if(job==null) job="";
		String div = request.getParameter("div");
		if(div==null) div="";
		
		// 2. 모델 데이터 
		A04_PreparedDao dao = new A04_PreparedDao();
		List<Emp> empList = dao.getEmpList(ename, job);
		request.setAttribute("empList", empList);
		
		// 3. view단(jsp)호출
		if(div.equals("")) {
			String page = "a06_el_jstl\\a10_empListSch.jsp";
			RequestDispatcher rd = 
					request.getRequestDispatcher(page);
			rd.forward(request, response);
		}else {
			Gson g = new Gson();
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/plain;utf-8");
			response.getWriter().print(g.toJson(empList));
			
			
		}
		
		
	}

}
