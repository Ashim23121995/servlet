package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	
		public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.println("<h2>Welcome to Register form </h2>");
			
			String name=req.getParameter("user_name");
			String password=req.getParameter("password_name");
			String email=req.getParameter("email_name");
			String gender=req.getParameter("user_gender");
			String course=req.getParameter("user_course");
			String cond=req.getParameter("condition");
			
			if(cond!=null)
			{
				if(cond.equals("checked")) {
					out.println("<h2>Name: "+name+" ,<h2>");
					out.println("<h2>Email: "+email+" ,<h2>");
					out.println("<h2>Password: "+password+" ,<h2>");
					out.println("<h2>Gender: "+gender+" ,<h2>");
					out.println("<h2>Course: "+course+" ,<h2>");
				}
				else
				{
					System.out.println("<h2>You have not accepted terms and condition<h2>");
				}
			}
			else
			{
				out.println("<h2>You have not accepted terms and condition<h2>");
				
				RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
				rd.include(req, res);
			}
		}
		
}