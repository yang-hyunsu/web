package backendWeb.a01_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A09_AjaxController
 */
@WebServlet(name = "buyProduct.do", urlPatterns = { "/buyProduct.do" })
public class A09_AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A09_AjaxController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String pname = request.getParameter("pname");
		if(pname==null) pname="물건이 없습니다.";
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		response.getWriter().print("구매한 물건:"+pname);
		
		
	}

}
