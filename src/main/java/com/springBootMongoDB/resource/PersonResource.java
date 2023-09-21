package com.springBootMongoDB.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootMongoDB.domain.Person;
import com.springBootMongoDB.service.PersonService;

/**
 * @author Azo-hub
 * @github (https://github.com/Azo-hub)
 * @since 2020
 */

@RestController
@RequestMapping("/person")
public class PersonResource {
	
	@Autowired
	private PersonService personService;
	
	
	@PostMapping
	public String save(@RequestBody Person person) {
		return personService.save(person);
	}

}
