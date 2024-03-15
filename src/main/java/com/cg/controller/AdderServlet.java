package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.dto.CD;
import com.cg.service.CDService;

/**
 * Servlet implementation class AdderServlet
 */
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdderServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String date=request.getParameter("date");
		int year=Integer.parseInt(request.getParameter("year"));
		double price=Double.parseDouble(request.getParameter("price"));
		
		CD cd=new CD(id, name, date, year, price);
		CDService cdService=new CDService();
		String msg="";
		if(cdService.addCD(cd)){
			msg="CD Added Successfully.";
		}else {
			msg="Failed to Add CD.";
		}
		request.setAttribute("msg",msg);
//		RequestDispatcher rd=request.getRequestDispatcher("MessageViewer.jsp");
//		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
