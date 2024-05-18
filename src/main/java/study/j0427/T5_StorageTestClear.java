package study.j0427;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/j0427/T5_StorageTestClear")
public class T5_StorageTestClear extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mid = request.getParameter("mid"); 
		
		HttpSession session = request.getSession(); //세션 사용하기 위해 필요
		session.invalidate();//세션다지우기
		
		ServletContext application = session.getServletContext();
		application.removeAttribute("aMid");
		
		response.sendRedirect(request.getContextPath()+"/study/0427_storage/t5_StorageTest.jsp");
		
	}
}
