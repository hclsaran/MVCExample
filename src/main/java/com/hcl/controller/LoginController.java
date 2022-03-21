package com.hcl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.hcl.model2.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws
	ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("uname");
		String pwd=req.getParameter("pwd");		
		User u1=new User();
		u1.setUsername(name);
		u1.setPassword(pwd);
		req.setAttribute("abc", u1);		
		   boolean status=u1.checkUnamePwd();
		   if(status) {
			   RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			   rd.forward(req, res);
		   }
		   else{
			   RequestDispatcher rd=req.getRequestDispatcher("failure.jsp");
			   rd.forward(req, res);
		   }
	}		
		protected void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
			doPost(req,res);	
		
	}

}
