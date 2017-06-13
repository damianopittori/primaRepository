package webapp2;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Country extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/world?useSSL=false","root","root");
		    Statement createStatement = connection.createStatement();
		    
		    ResultSet resultSet =createStatement.executeQuery("select code from country");
		    ArrayList<String> listaCode= new ArrayList<String>();
		    while(resultSet.next()){
			    String code=resultSet.getString("code");
			    listaCode.add(code);
		       
			
		    }
		    request.setAttribute("listaCode", listaCode);
		    RequestDispatcher dispatcher= request.getRequestDispatcher("/combo.jsp");
		    dispatcher.forward(request, response);
		  
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		
	
			
		}
	}
