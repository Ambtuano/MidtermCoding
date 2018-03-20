package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		this.SectionID = sectionID;
		this.StudentID = studentID;
		
		this.EnrollmentID = UUID.randomUUID();;
	}

	public void SetGrade(double grade) {
		Grade = grade;
	}

	
	

}
