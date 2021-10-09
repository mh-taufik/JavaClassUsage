package Animal;

public class Elephant extends Animals {
	private boolean tusk;
	
	Elephant(String name, String food, boolean claws, int size, boolean tusk) {	//tusk = gading
		super(name, food, claws, size);
		this.tusk = tusk;
	}
	
	@Override
	public void printData() {
		super.printData();
		if(this.tusk==true)
			System.out.println("tusk = Yes");
		else
			System.out.println("tusk = No");
	}
}
