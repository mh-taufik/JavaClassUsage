package Employees;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>(10);
		Bank club = new Bank("Leverkusen", employee);
		Employee p1 = new Employee("Jajang",2,1000);
		Employee p2 = new Employee("Maman",3);
		Employee p3 = new Employee("Asep",5);
		Employee p4 = new Employee("Bambang",1,1500);
		Employee p5 = new Employee("Budi",4,750);
		
		//add to list
		employee.add(p1);
		employee.add(p2);
		employee.add(p3);
		employee.add(p4);
		employee.add(p5);
		
		club.printData(employee);
	}
}
