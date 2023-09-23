package com.springBootMongoDB.service.impl;

import java.util.List;

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

	@Override
	public List<Person> getPersonStartWith(String name) {
		// TODO Auto-generated method stub
		return personRepository.findByFirstNameStartsWith(name);
	}

	@Override
	public String deletePerson(String id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
		return "person with " + id + " deleted;";
	}

	@Override
	public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return personRepository.findByAgeBetween(minAge, maxAge);
	}

}
