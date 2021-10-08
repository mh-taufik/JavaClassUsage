
public class Cat extends Animals {
	private String breed;	//ras kucing
	
	Cat(String name, String food, boolean claws, int size, String breed) {
		super(name, food, claws, size);
		this.breed = breed;
	}
	
	public void printData() {
		super.printData();
		System.out.println("Breed = "+this.breed);
	}
}
