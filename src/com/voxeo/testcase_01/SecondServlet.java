package com.voxeo.testcase_01;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.sip.SipServlet;
import javax.servlet.sip.SipServletRequest;
import javax.servlet.sip.SipServletResponse;

@javax.servlet.sip.annotation.SipServlet
public class SecondServlet extends SipServlet {

	/**
	 * Constructor of the object.
	 */
	public SecondServlet() {
		super();
		System.out.println("Testing......Testing......");
	}

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		log("init");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		log("destory");
	}

	protected void doInvite(SipServletRequest req) throws ServletException,
			IOException {
		// TODO Auto-generated method stub
		log("doInvite");
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
		// TODO Auto-generated method stub
	}

	@PreDestroy
	protected void preDestroy() {
		// TODO Auto-generated method stub
	}

}
