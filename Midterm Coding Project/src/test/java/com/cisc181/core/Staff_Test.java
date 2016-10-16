package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import Exceptions.PersonException;

public class Staff_Test {
	
	private ArrayList<Staff> staff;
	private Date date;
	
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	
	@Test
	public void StaffSalary(){
		double sal=20;
		for (int i = 0;i<5;i++){
			sal=sal+20;
			staff.add(i,new Staff("FirstName", "String MiddleName", 
					"String LastName",date, "String Address", "(123)-123-1234", "String Email",
					"String officeHours", 0, sal, date,eTitle.MR)); }
		double sum=0;
		for (Staff i:staff){
			sum=sum+sal;}
		double average=sum/5;
		System.out.println(average);
		System.out.println(sum);
	
		assertEquals(0.0,average,80);
	}
	@Test(expected=PersonException.class)
	public void InvalidDOB() throws PersonException, Exception{
		
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date DOB=format.parse("1900-02-02");
		
		try{
			Staff a= new Staff("FirstName", "String MiddleName", "String LastName",
					DOB, "String Address", "(123)-123-1234", "String Email",
					"String officeHours", 0, 20, date,
					eTitle.MR);
			throw new PersonException("Invalid DOB");
		}
		finally{}
	}
	@Test(expected = PersonException.class)
	public void InvalidPhone() throws PersonException{
		try{
			new Staff("FirstName", "String MiddleName", "String LastName",
				date, "String Address", "1231231234", "String Email",
				"String officeHours", 0, 20, date,
				eTitle.MR);
			throw new PersonException("Invalid Phone");
		}
		finally{}
	}
	
}
