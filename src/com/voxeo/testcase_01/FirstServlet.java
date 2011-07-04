package com.voxeo.testcase_01;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.sip.SipServlet;
import javax.servlet.sip.SipServletRequest;
import javax.servlet.sip.SipServletResponse;

@javax.servlet.sip.annotation.SipServlet
public class FirstServlet extends SipServlet {
	private static final long serialVersionUID = 1056098786739520713L;

	public void init() throws ServletException {
		log("init");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		log("destory");
	}

	protected void doRequest(SipServletRequest req) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		log("doRequest");
	}

	protected void doResponse(SipServletResponse res) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		log("doResponse");
	}

	@PostConstruct
	protected void postConstruct() {
		System.out.println("Company Name: " + getInitParameter("companyName"));
	}

	@PreDestroy
	protected void preDestroy() {

	}

}
