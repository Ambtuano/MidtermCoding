package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	/*public String getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (String Major)
    {
        this.Major = Major;    
    }*/

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String FirstName, String MiddleName, String LastName, Date DOB, eMajor major, String Address, String Phone_number,
			String Email) throws PersonException  
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = major;
	}


	public void setMajor(eMajor major) {
		Major = major;
	}
	
	public eMajor getMajor() {
		return Major;
	}
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	/*public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}*/
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}