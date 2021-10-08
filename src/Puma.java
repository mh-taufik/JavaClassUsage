
public class Puma extends Animals {
	private int maxSpeed;
	
	Puma(String name, String food, boolean claws, int size, int maxSpeed) {
		super(name, food, claws, size);
		this.maxSpeed = maxSpeed;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Max Speed = "+this.maxSpeed+" km/h");
	}

}
