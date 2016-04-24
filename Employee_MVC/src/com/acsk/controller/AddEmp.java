package com.acsk.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acsk.dao.EmpDao;
import com.acsk.model.Employee;


@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpDao empdao;
       

    public AddEmp() {
        super();
       empdao = new EmpDao();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Employee e = new Employee();
		e.setEname("Chandrakant");
		e.setSalary(10000);
		e.setDesig("Engineer");
		empdao.addEmp(e);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
