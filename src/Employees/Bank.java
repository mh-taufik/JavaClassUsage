package Employees;

import java.util.*;

public class Bank {
	private String name;
	private List<Employee> employee;
	
	Bank(String name, List<Employee> employee){
		this.name = name;
		employee = new ArrayList<Employee>(10);
	}
	
	public void printData(List<Employee> employee) {
		System.out.println("Data Club " + this.name);
		for(Employee partOf:employee ) {
			System.out.println("--------------------");
			System.out.println("Name   		   = " + partOf.getName());
			System.out.println("Overall Status = " + partOf.getOverallStat());
			System.out.println("Salary 		   = " + partOf.getSalary());
		}
		System.out.println("--------------------");
	}
}
