package Exceptions;

public class PersonException extends Exception{
	
	private Object Person;

	//this.Person=Person;
	
	public PersonException(String Message){
		super(Message);
		this.Person=Person;
	}
	
}
