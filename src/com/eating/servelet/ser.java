package com.eating.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eating.impl.eatingimpl;
import com.eating.pojo.merchant;
import com.eating.pojo.users;

public class ser extends HttpServlet {

	
	public ser() {
		super();
	}

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action=request.getParameter("action");
		eatingimpl impl=new eatingimpl();
		
		
		if(action.equals("login")){
			
			impl.login(request.getParameter("name"));
			System.out.println(merchant.getMerchant_number());
			if(request.getParameter("name").equals(merchant.getMerchant_number())&&request.getParameter("password").equals(merchant.getMerchant_password())){
				request.setAttribute("store",merchant.getMerchant_store());
				request.setAttribute("name",merchant.getMerchant_name());
				request.setAttribute("phone",merchant.getMerchant_phone());
				request.setAttribute("address",merchant.getMerchant_address());
				request.setAttribute("email",merchant.getMerchant_email());
				request.setAttribute("school",merchant.getMerchant_school());
				request.getRequestDispatcher("/users/MyJsp.jsp").forward(request,response);
			}
		}
		
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
