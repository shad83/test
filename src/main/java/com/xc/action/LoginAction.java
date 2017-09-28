package com.xc.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import com.xc.service.LoginService;

@Controller
@Namespaces(value = { @Namespace("/User"), @Namespace("/") })
public class LoginAction {
	
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	// Java Bean to hold the form parameters
	// getter:jsp →　java bean
	// setter：java bean → jsp 
	private String name;
	private String pwd;
	
	@Resource
	LoginService loginService;

	// @Action的value与jsp里要提交的form的action相对应
	@Action(value = "login", results = {
			@Result(name = "SUCCESS", location = "/welcome.jsp"),
			@Result(name = "ERROR", location = "/error.jsp") })
	public String doLogin() throws Exception {
		
		logger.info("check user info");
		
		return loginService.checkLoginInfo(getName(), getPwd());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
