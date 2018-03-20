package com.cisc181.core;

import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private date StartDate;
	private date EndDate;
	
	
	
	public Semester(UUID semesterID, date startDate, date endDate) {
		super();
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public date getStartDate() {
		return StartDate;
	}
	public void setStartDate(date startDate) {
		StartDate = startDate;
	}
	public date getEndDate() {
		return EndDate;
	}
	public void setEndDate(date endDate) {
		EndDate = endDate;
	}
}
