package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first02") //response.addHead를 통한 페이지 이동
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//GET방식
		System.out.println("요청 확인");
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
	//	resp.sendRedirect("second"); //서블릿을 요청시 다른 서블릿으로 이동
	
	//	resp.sendRedirect("index.jsp"); //서블릿을 요청시 jsp 페이지로 이동
		
	//	resp.addHeader("Refresh", "5;url=second02");
		
		resp.addHeader("Refresh", "5;url=index.jsp");
	}
	
}
