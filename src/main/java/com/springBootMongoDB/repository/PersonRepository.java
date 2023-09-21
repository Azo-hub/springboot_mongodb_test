package com.springBootMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springBootMongoDB.domain.Person;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */


public interface PersonRepository extends MongoRepository<Person, String> {

}
