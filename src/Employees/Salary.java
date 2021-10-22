package Employees;

public class Salary {
	private int defaultSalary;
	
	public Salary(){
		this.defaultSalary = 500;
	}
	
	public Salary(int salary) {
		this.defaultSalary = salary;
	}
	
	public int getSalary(int overallStat) {
		switch(overallStat) {
		case 1 : return defaultSalary + 500;
		case 2 : return defaultSalary + 250;
		case 3 : return defaultSalary + 100;
		case 4 : return defaultSalary + 50;
		case 5 : return defaultSalary;
		default: return 0;
		}
	}
	
	
	
//	public int getSalary(int overallStat) {
//		switch(overallStat) {
//			case 1:
//				return 500;
//			case 2:
//				return 10;
//			case 3:
//				return 5;
//			default:
//				return 0;
//		}
//	}
}
