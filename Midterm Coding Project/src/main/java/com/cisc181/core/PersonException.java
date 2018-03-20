package com.cisc181.core;

public class PersonException extends Exception{

	private Person Person;

	public PersonException(String arg0, Person person) {
		super(arg0);
		this.Person = person;
	}

	public Person getPerson() {
		return Person;
	} 
	
}
