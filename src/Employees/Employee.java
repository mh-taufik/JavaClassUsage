package Employees;

public class Employee {
	private String name;
	private int performance;
	private Salary salary;
	
	Employee(String name, int performance){
		this.name = name;
		this.performance = performance;
	}
	
	Employee(String name, int performance, int salary){
		this.name = name;
		this.performance = performance;
	}

	public String getName() {
		return name;
	}

	public int getOverallStat() {
		return performance;
	}
	
	public int getSalary() {
		return salary.getSalary(performance);
	}
}
