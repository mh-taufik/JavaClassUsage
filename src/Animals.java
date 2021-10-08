
public class Animals {
	private String name;
	private String food;
	private boolean claws;
	private String bodySize;
	
	Animals(String name, String food, boolean claws, int size){
		this.name = name;
		this.food = food;
		this.claws = claws;
		this.bodySize = BodySize.getBodySize(size);
	}

	public void printData() {
		System.out.println("name  = "+this.name );
		System.out.println("food  = "+this.food);
		if(this.claws==true)
			System.out.println("claws = Yes");
		else
			System.out.println("claws = No");
		System.out.println("size = "+this.bodySize);
	}
	
	
}
