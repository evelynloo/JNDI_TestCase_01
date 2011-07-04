package com.voxeo.testcase_01;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServlet
 */
public class HttpServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see javax.servlet.http.HttpServlet#javax.servlet.http.HttpServlet()
	 */
	public HttpServlet() {
		super();

		// System.out.println(getServletContext().getInitParameter("companyName"));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		// String companyName = getInitParameter("companyName");
		if (sc == null) {
			System.out.println("null......");
		} else {
			System.out.println("Company Name: "
					+ sc.getInitParameter("companyName"));
		}
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			Object obj = envCtx.lookup("maxExemptions");
			if (obj instanceof Integer) {
				System.out.println((Integer)obj);
			} else if (obj instanceof String) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
