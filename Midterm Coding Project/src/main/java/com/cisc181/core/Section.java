package com.cisc181.core;

import java.util.UUID;

public class Section {
	UUID CourseID;
	UUID SemesterID; 
	UUID SectionID;
	int RoomID;
	
	public UUID getSectionID(){
		return SectionID;
	}
}
