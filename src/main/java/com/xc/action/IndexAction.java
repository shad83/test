package com.xc.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespaces(value={@Namespace("/User"),@Namespace("/")})
@Result(location="/login.jsp")
@Actions(value={@Action(""),@Action("index")})
// 在浏览器里输入以下URL都可以进入本action
//http://localhost:8080/ssm/
//http://localhost:8080/ssm/index
//http://localhost:8080/ssm/User
//http://localhost:8080/ssm/User/index
public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 5162866421046830752L;
}
