package com.springBootMongoDB.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springBootMongoDB.domain.Person;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */


public interface PersonRepository extends MongoRepository<Person, String> {

	List<Person> findByFirstNameStartsWith(String name);
	
	List<Person> findByAgeBetween(Integer minAge, Integer maxAge);

}
