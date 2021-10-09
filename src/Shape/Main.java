package Shape;

public class Main {
	public static void main(String[] args) {
		Segitiga segitiga = new Segitiga("segitiga", 3, 180);
		Persegi persegi = new Persegi("persegi", 4, 360);
		
		System.out.println("---Bangun Datar---");
		segitiga.printData();
		System.out.println("------------------");
		persegi.printData();
		System.out.println("------------------");
	}
}
