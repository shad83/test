package com.xc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.xc.dao.PersonCustomDao;
import com.xc.dto.PersonCustom;
import com.xc.entity.Person;
import com.xc.entity.PersonExample;
import com.xc.mapper.PersonMapper;

@Repository
public class PersonCustomDaoImpl implements PersonCustomDao {

	@Resource
	private PersonMapper personMapper;
	
	public List<PersonCustom> getPersonAll() {
		
		List<PersonCustom> personCustomList = new ArrayList<PersonCustom>();
		
		PersonExample example = new PersonExample();
		List<Person> personList = personMapper.selectByExample(example);
		
		for (Person person:personList) {
			PersonCustom personCustom = new PersonCustom();
			BeanUtils.copyProperties(person, personCustom);
			
			personCustomList.add(personCustom);
		}
		
		return personCustomList; 
	}

}
