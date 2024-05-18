package study2.mapping;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do5")
public class Test5Controller extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Test5Interface command = null;
		String viewPage = "/WEB-INF/study2/mapping/";
		
		String uri = request.getRequestURI();
		
		String com = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));
		
		if(com.equals("test5")) {
			viewPage += "test5.jsp";
		}
		else if(com.equals("t5input")) {
			viewPage = "/WEB-INF/0507/t5input.jsp";
		}
		else if(com.equals("t5inputOk")) {
			command = new Test5InputOkCommand();
			command.execute(request, response);
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("t5update")) {
			viewPage = "/WEB-INF/0507/t5update.jsp";
		}
		else if(com.equals("t5updateOk")) {
			command = new Test5UpdateOkCommand();
			command.execute(request, response);
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("t5delete")) {
			viewPage = "/WEB-INF/0507/t5delete.jsp";
		}
		else if(com.equals("t5deleteOk")) {
			command = new Test5DeleteOkCommand();
			command.execute(request, response);
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("t5search")) {
			viewPage = "/WEB-INF/0507/t5search.jsp";
		}
		else if(com.equals("t5searchOK")) {
			command = new Test5searchOkCommand();
			command.execute(request, response);
			viewPage = "/include/message.jsp";
		}
		else if(com.equals("t5allsearch")) {
			viewPage += "test5.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
