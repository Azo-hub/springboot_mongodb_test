package com.springBootMongoDB.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootMongoDB.domain.Person;
import com.springBootMongoDB.repository.PersonRepository;
import com.springBootMongoDB.service.PersonService;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public String save(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person).getPersonId();
	}

}
