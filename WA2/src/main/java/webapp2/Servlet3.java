package webapp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String attribute = request.getParameter("attribute");
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("il tasto selezionato è "+attribute);
			
		
	}
}
