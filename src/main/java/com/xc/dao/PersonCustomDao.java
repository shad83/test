package com.xc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xc.dto.PersonCustom;

@Repository
public interface PersonCustomDao {
	public List<PersonCustom> getPersonAll();
}
