package com.cognizant.controller;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.model.FeedbackModel;
 @WebServlet("/feedbackByuser")
public class Feedbackcontroller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public Feedbackcontroller() {
	  super();
	}
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}
	  protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
		  
		  String username = request.getParameter("username");
		  String message = request.getParameter("message");
		  FeedbackModel fm = new FeedbackModel();
		  fm.setEmail(username);
		  fm.setMessage(message);
		  try {
		  if(fm.insertFeedbackData()){
				System.out.println(username+"::thank you feedback\nAuto login into dashboard");
				
	  }
		  }
		  catch(Exception e) {
			  
		  }
	  }
}
