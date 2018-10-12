package com.events.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Userlogin
 */
@WebServlet("/Userlogin")
public class Userlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html; charset=UTF-8");
		
		
		 try (PrintWriter out = response.getWriter()) {
	           
	        
	           String user = request.getParameter("user");
	           String pass = request.getParameter("psw");
	           
	           MyDb db = new MyDb();
	           Connection con =db.getCon();
	           Statement stmt = con.createStatement();
	           ResultSet rs=stmt.executeQuery("select username,password from adduser where username='"+user+"' AND password='"+pass+"' ");
	          while(rs.next())
				{
	           
					if((user.equals(rs.getString("username")))&& (pass.equals(rs.getString("password")))){
						
						/*response.sendRedirect("adminOptions.html");*/
						
						/* String page = "";
						    try {

						    } catch (Exception e) {
						      page = "error.jsp";
						    } finally {
						      page = "adminOptions.html";
						    }

						RequestDispatcher dd=request.getRequestDispatcher(page);
						dd.forward(request, response);*/
						request.getRequestDispatcher("/adminOptions.html").forward(request, response);
					 
						//response.sendRedirect("adminOptions.html");
					}
					else{
						response.sendRedirect("userlogin.html");
					}
					
						
					
	        
			
				}  
	        } catch (SQLException ex) {
	            Logger.getLogger(Userlogin.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
