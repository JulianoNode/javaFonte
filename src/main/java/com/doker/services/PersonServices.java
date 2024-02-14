package com.doker.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.doker.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());

	public Person findById(String id) {
		
		logger.info("Finding one person!");
		Person person = new Person();
						
		person.setId(counter.incrementAndGet());
		person.setFirstName("Juliano");
		person.setLastName("Rocha");
		person.setAddress("Alfenas - Minas Gerais - Brasil");
		person.setGender("Male");
		
		logger.info("Finding ID: " +person.getId());
		logger.info("Finding Nome: " +person.getFirstName());
		logger.info("Finding Sobrenome: " +person.getLastName());
		logger.info("Finding Endereço: " +person.getAddress());
		logger.info("Finding Gender: " +person.getGender());
		
		return person;
	}
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		
		logger.info("Finding ID: " +person.getId());
		logger.info("Finding Nome: " +person.getFirstName());
		logger.info("Finding Sobrenome: " +person.getLastName());
		logger.info("Finding Endereço: " +person.getAddress());
		logger.info("Finding Gender: " +person.getGender());
		return person;
	}
	
	public Person update(Person person) {		
		logger.info("Updating one person!");	
		
		logger.info("Finding ID: " +person.getId());
		logger.info("Finding Nome: " +person.getFirstName());
		logger.info("Finding Sobrenome: " +person.getLastName());
		logger.info("Finding Endereço: " +person.getAddress());
		logger.info("Finding Gender: " +person.getGender());
		return person;
	}
	
	public void delete(String id) {		
		logger.info("Deleting one person!");
	}
	
	public List<Person> findAll() {

		logger.info("Finding all people! ");
		
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;
	}	
	private Person mockPerson(int i) {		
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAddress("Some address in Brasil " + i);
		person.setGender("Male");
		
		return person;
	}
}
