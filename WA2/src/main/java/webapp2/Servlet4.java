package webapp2;

import java.awt.geom.Area;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] attribute = request.getParameterValues("attribute");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int x = 0;
		for (String s : attribute) {
			x++;
			out.print(s);
			out.print("<br>");
		}
		out.print("il numero di tasti selezionati è " + x);
	}
}
