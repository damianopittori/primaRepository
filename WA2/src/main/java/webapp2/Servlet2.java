package webapp2;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String attribute = (String) request.getParameter("a");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(attribute!=null){
						try{
				int parseInt= Integer.parseInt(attribute);
				out.print("<html><body>");
				out.print("<h1>hai inserito il numero "+parseInt+"</h1>");
				out.print("</body></html>");
				System.out.println("hai inserito il numero : "+parseInt);
			} catch(NumberFormatException exp){
				out.print("<html><body>");
				out.print("<h1>hai inserito la stringa "+attribute+"</h1>");
				out.print("</body></html>");
				System.out.println("hai inserito la stringa : "+attribute);
				
			}	
		}else{
			out.print("<html><body>");
			out.print("<h1>niente</h1>");
			out.print("</body></html>");
			System.out.println("niente");
		}
		
	}

}

