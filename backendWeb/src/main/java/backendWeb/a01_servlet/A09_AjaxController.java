package backendWeb.a01_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import backendWeb.z01_vo.Product;

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
		if(pname==null) pname="";
		String priceS = request.getParameter("price");
		int price = 0;
		if(priceS!=null&&!priceS.equals("")) 
			price = Integer.parseInt(priceS);
		String cntS = request.getParameter("cnt");
		int cnt = 0;
		if(cntS!=null&&!cntS.equals(""))
			cnt = Integer.parseInt(cntS);
			

		
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;utf-8");
		/* 요청값을 객체로 만들어서 전송*/
		Product p = new Product(pname,price,cnt);
		Gson g = new Gson();		
		
		response.getWriter().print( g.toJson(p) );
		// A10_AjaxController.java
		//    mname=행복한노래&singer=홍길동&pubyear=2001
		//    Music 
		///   private String mname;
		///   private String singer;
		///   private int  pubyear;
		//    Json데이터로  위 내용을 json 객체로 출력하게 처리.
		
		
	}

}
