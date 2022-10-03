package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.ejb.EmployeeDao;
import com.example.ejb.EmployeeDaoImpl2;
import com.example.ejb.EmployeeException;
import com.example.model.Employee;

/*
 * 
 */
public class EmployeeServlet extends HttpServlet{
	@EJB(beanName="b2")
	private EmployeeDao dao;
	private static final long serialVersionUID = 1L;
	/*
	 * 
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		        HttpSession s=req.getSession();
				
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
			
				req.getRequestDispatcher("empdetails.jsp").forward(req, res);
				
	}

}
