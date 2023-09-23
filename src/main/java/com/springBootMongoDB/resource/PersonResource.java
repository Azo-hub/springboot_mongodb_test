package com.springBootMongoDB.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@GetMapping
	public List<Person> getPersonStartWith(@RequestParam("name") String name) {
		return personService.getPersonStartWith(name);
	}
	
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam("id") String id) {
		return personService.deletePerson(id);
	}
	
	
	@GetMapping("/age")
	public List<Person> getByPersonAge(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
		
		return personService.getByPersonAge(minAge, maxAge);
	}

}
