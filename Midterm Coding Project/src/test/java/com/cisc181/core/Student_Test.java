package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	private static ArrayList<Course> course;
	private static ArrayList<Semester> semester;
	private static ArrayList<Section> section;
	private static ArrayList<Student> student;
	private static Date date;
	
	@BeforeClass
	public static void setup() {
		for(int i=0; i<3;i++){
			course.add(i,new Course());
		}
		semester.add(new Semester());
		semester.add(new Semester());
		
		for(int i=0; i<6;i++){
			section.add(new Section());
		}
		
		for (int i=0; i<10; i++){
			student.add(new Student("FName", "MName", "LName", date,
					eMajor.CHEM, "Address", "(123)-123-1234", "Email"));
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	@Test
	public void testGPA(){
		double k=70;
		double sum=0;
		for (int i=0; i<10;i++){
			ArrayList GradePointAv=null;
			for (int j=0; j<6;j++){
				while(j<6){
				k=k+2;
				Student a =student.get(i);
				Section b=section.get(j);
				//Enroll Student in Section
				new Enrollment(a.getStudentID(),b.getSectionID());
				//Grade of Student Enrolled
				Enrollment.SetGrade(k);}
				sum=sum+k;
				GradePointAv.add(k);
			}
			//Each Student's GPA
			double x=0;
			for(int j=0; j<6;j++){
				double grade=(Double) GradePointAv.get(j);
				x+=grade;
			double GPA=x/6;
			assertEquals(0.0,GPA,75);
			}
		}
		}
	
	@Test
	public void testCourseGrade(){
		double sum=0;
		int k=70;
		for (int i=0; i<3;i++){
			while (i<3){
				k=+5;
			Course a=course.get(i);
			a.GradePoints=k;
			sum+=a.GradePoints;
		}}
		double average=sum/3;
		assertEquals(0.0,average,80 );
	}
		
		 
	@Test 
	public void MajorChange(){
		Student a =student.get(0);
		a.Major=eMajor.BUSINESS;
	}
}