package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment(){
	}
	Enrollment(UUID StudentID,UUID SectionID){
		this.EnrollmentID=EnrollmentID;
	}
	static void SetGrade(double grade){
		new Enrollment().Grade=grade;
	}
	
}
