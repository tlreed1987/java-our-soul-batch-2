package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeException;
import com.example.dao.EmployeeFactory;
import com.example.pojos.Employee;

public class EmployeeServlet extends HttpServlet{
	private EmployeeDao dao;
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
				dao=EmployeeFactory.get();
				System.out.println("Nitin1");
				res.setContentType("text/html");
				int id=Integer.parseInt(req.getParameter("id"));
				Employee e=null;
				try {
					e=dao.findById(id);
					
				} catch (EmployeeException ex) {
					// TODO Auto-generated catch block
					System.out.println(e);
					ex.printStackTrace();
				}
				//print the response in HTML
				PrintWriter pw=res.getWriter();
				pw.println("<html>");
				pw.println("<body>");
				if(e!=null) {
					pw.println("<p><b>Employee Id : </b>"+e.getId());
					pw.println("<p><b>Name        : </b>"+e.getName());
					pw.println("<p><b>Salary      : </b>"+e.getSalary());
					pw.println("<p><b>Dept Id : </b>"+e.getDeptId());
				}else {
					pw.println("<p><b> Employee with Id "+ id+" doesnt exist");
				}
				pw.println("</body>");
				pw.println("</html>");
				pw.close();
	}

}
