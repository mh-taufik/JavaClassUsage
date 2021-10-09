package Shape;

public class Formula {
	public int panjang = 5;
	private int sisi;
	
	Formula(int sisi){
		this.sisi = sisi;
	}
	
	public int keliling(){
		return panjang * this.sisi;
	}
}
