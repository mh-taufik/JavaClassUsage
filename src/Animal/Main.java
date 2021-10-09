package Animal;

public class Main {
	public static void main(String[] args) {
		Puma animal1 = new Puma("puma","meat",true,3,80);
		Cat animal2 = new Cat("cat","meat",true,2,"persian");
		Elephant animal3 = new Elephant("elephant","plant",false,4,true);
		
		System.out.println("---- ANIMAL DATA ----");
		animal1.printData();
		System.out.println("---------------------");
		animal2.printData();
		System.out.println("---------------------");
		animal3.printData();
		System.out.println("---------------------");
	}
	
}
