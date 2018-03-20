package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import junit.framework.Assert;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void test1() throws PersonException {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		Staff staff1 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 10000.00,  Date(2001, 1, 1), eTitle.MR);
		Staff staff2 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 20000.00,  Date(2001, 1, 1), eTitle.MR);
		Staff staff3 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 30000.00,  Date(2001, 1, 1), eTitle.MR);
		Staff staff4 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 40000.00,  Date(2001, 1, 1), eTitle.MR);
		Staff staff5 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 50000.00,  Date(2001, 1, 1), eTitle.MR);
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		
		double total = 0;
		for(Staff s: staff) {
			total += s.getSalary();
		}
		
		Assert.assertEquals(30000.0, total/5); //compares average salary with expected



		try {		// invalid birthday, valid phone number
			Staff staff6 = new Staff("firstName", "middleName" , "lastName" , Date(3001, 1, 1) , "address", "(123) 456 7890", "email", "officeHours" , 10, 10000.00,  Date(2001, 1, 1), eTitle.MR);
		} catch (PersonException e) {
			e.printStackTrace();
		} 

		try {		// invalid phone number, valid birthday
			Staff staff7 = new Staff("firstName", "middleName" , "lastName" , Date(2001, 1, 1) , "address", "123456 7890", "email", "officeHours" , 10, 10000.00,  Date(2001, 1, 1), eTitle.MR);
		} catch (PersonException e) {
			e.printStackTrace();
		}

		try {		// invalid birthday and phone number
			Staff staff8 = new Staff("firstName", "middleName" , "lastName" , Date(3001, 1, 1) , "address", "123456 7890", "email", "officeHours" , 10, 10000.00,  Date(2001, 1, 1), eTitle.MR);
		} catch (PersonException e) {
			e.printStackTrace();
		}
	}

		

	private Date Date(int i, int j, int k) { // just to create a date object for testing salary
		return null;
	}
}

