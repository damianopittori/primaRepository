package webapp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String attribute = (String) request.getParameter("a");
		String b = "true";
		String b1 = "false";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(attribute!=null){
			
		
		if (attribute.equalsIgnoreCase(b)){
			

			out.print("<html><body>");
			out.print("<h1>"+b+"</h1>");
			out.print("</body></html>");
			System.out.println(b);
			
		}else if (attribute.equalsIgnoreCase(b1)){
		
			out.print("<html><body>");
			out.print("<h1>"+b1+"</h1>");
			out.print("</body></html>");
			System.out.println(b1);
		}else{
			out.print("<html><body>");
			out.print("<h1>non hai inserito un valore booleano ma "+attribute+"</h1>");
			out.print("</body></html>");
			System.out.println(attribute);
		}

		}else{
			out.print("<html><body>");
			out.print("<h1>niente</h1>");
			out.print("</body></html>");
			System.out.println("niente");
		}
		
	}

}


