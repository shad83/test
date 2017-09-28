package com.xc.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

	public String checkLoginInfo(String name, String pw);
}
