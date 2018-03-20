package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> course = new ArrayList<Course>();
		ArrayList<Semester> semester = new ArrayList<Semester>();
		ArrayList<Section> section = new ArrayList<Section>();
		ArrayList<Student> student = new ArrayList<Student>();
		
		course.add(new Course(UUID.randomUUID(), "Course 1" , 3, eMajor.NURSING));
		course.add(new Course(UUID.randomUUID(), "Course 2" , 4, eMajor.PHYSICS));
		course.add(new Course(UUID.randomUUID(), "Course 3" , 1, eMajor.BUSINESS));
		
		semester.add(new Semester(UUID.randomUUID(), Date(2001, 1, 1), Date(2001, 6, 6)))//spring
		semester.add(new Semester(UUID.randomUUID(), Date(2001, 9, 9), Date(2001, 12, 12))) // fall
		
		
		
	}

	private static date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}