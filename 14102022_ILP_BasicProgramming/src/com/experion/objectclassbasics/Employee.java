package com.experion.objectclassbasics;

public class Employee {
	
	String employeeName = "Suresh";
	int employeeAge = 36;
	char employeeGender = 'M';
	double employeeCgpa = 7.5;
	
	public void displayEmployeeDetails() {
		System.out.println( "*********Welcome to ILP Program*********");
		System.out.println("Name" + "		" + "Age" + " 		" + "Gender" + "	 " + "CGPA");
		System.out.println(employeeName + "		" + employeeAge + "		" +  employeeGender + "	 " + employeeCgpa);

	}

}
