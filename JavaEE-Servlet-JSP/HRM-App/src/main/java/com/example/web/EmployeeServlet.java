package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.dao.EmployeeFactory;
import com.example.pojos.Employee;
/*
 * 
 */
public class EmployeeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	/*
	 * 
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		        HttpSession s=req.getSession();
				EmployeeDao dao=EmployeeFactory.get();
				res.setContentType("text/html");
				int id=0;
				id=Integer.parseInt(req.getParameter("id"));
				Employee e=null;
				try {
					e=dao.findById(id);
					
				} catch (EmployeeException ex) {
					// TODO Auto-generated catch block
					System.out.println(e);
					ex.printStackTrace();
				}
				//req.setAttribute("empid", id);
				//req.setAttribute("emp", e);
				
				s.setAttribute("empid", id);
				s.setAttribute("emp", e);
				req.getRequestDispatcher("emp-ui").forward(req, res);
				
	}

}
