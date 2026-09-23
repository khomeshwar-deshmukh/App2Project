package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/fs1")
public class FirstServlet extends GenericServlet{
 
	@Override
  	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
  	{
	  PrintWriter pw = res.getWriter();
	  res.setContentType("text/html");
	  
	  String user_name= req.getParameter("vname"); 
	  String user_dob= req.getParameter("dob");
	  String user_city= req.getParameter("city");
	  
	  //System.out.println("UserName : "+ user_name);
	  //System.out.println("UserMail : "+ user_mail);
	  //System.out.println("UserDOB : "+ user_dob);
	  
	  int year = Integer.parseInt(user_dob.substring(6));
	  
	  pw.print("<center><h1>");
	  //pw.print("UserName : "+user_name+"<br><br>"); 
	  //pw.print("UserDOB : "+user_dob+"<br><br>");
	  //pw.print("UserCity : "+user_city+"<br><br>");
	  pw.print("Year : "+year+"<br><br>");
	  pw.print("</center></h1>");
	  
	  if((2026-year)>=18)
	  {
		  pw.print("<center><h1>");
		  pw.print(user_name+" you can Vote"+"<br><br><br>");
		  pw.print("</center></h1>");  
	  }
	  else
	  {
		  pw.print("<center><h1>");
		  pw.print(user_name+" you are NOT Eligible to vote"+"<br><br><br>");
		  pw.print("</center></h1>");
		  
	  }
	  
	  
	  
  	}
}
