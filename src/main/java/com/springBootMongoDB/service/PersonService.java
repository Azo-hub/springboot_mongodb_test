package com.springBootMongoDB.service;

import java.util.List;

import com.springBootMongoDB.domain.Person;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */
public interface PersonService {


	String save(Person person);

	List<Person> getPersonStartWith(String name);

	String deletePerson(String id);

	List<Person> getByPersonAge(Integer minAge, Integer maxAge);

}
