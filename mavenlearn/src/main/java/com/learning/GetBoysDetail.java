package com.learning;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.learning.data.Database;

@WebServlet("/getBoys")
   public class GetBoysDetail extends HttpServlet {
	public GetBoysDetail()
	{
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int aid=Integer.parseInt(request.getParameter("aid"));
		request.getSession().setAttribute("aid", aid);
		Database data=new Database();
		Boys boy=data.getBoys(aid);
		request.setAttribute("boysdata", boy);
		RequestDispatcher rd=request.getRequestDispatcher("showData.jsp");
		rd.forward(request, response);
	}
	
}
