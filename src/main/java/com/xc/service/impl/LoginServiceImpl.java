package com.xc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xc.common.Constants;
import com.xc.dao.PersonCustomDao;
import com.xc.dto.PersonCustom;
import com.xc.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	private PersonCustomDao personCustomDao;

	public String checkLoginInfo(String name, String pw) {
		
		List<PersonCustom> PersonCustomList = personCustomDao.getPersonAll();

		for (PersonCustom personCustom : PersonCustomList) {
			if (personCustom.getName().equals(name)
					& personCustom.getPassword().equals(pw))
				return Constants.SUCCESS;
		}
		
		return Constants.ERROR;
	}
}
