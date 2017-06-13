package webapp2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavigazionePagine extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String attribute = request.getParameter("attribute");
		try {
			int valore = Integer.parseInt(attribute);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/new.jsp");
			double quadrato = Math.pow(valore, 2);
			request.setAttribute("quadrato", quadrato);
			dispatcher.forward(request, response);
		} catch (NumberFormatException e) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/altra.jsp");
			request.setAttribute("stringa", attribute.toUpperCase());
			dispatcher.forward(request, response);
		}
	}
}
