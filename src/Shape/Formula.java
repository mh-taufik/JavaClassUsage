package Shape;

public class Formula {
	int panjang = 7;
	int tinggi = 5;
	
	private int sisi;
	
	Formula(int sisi){
		this.sisi = sisi;
	}
	
	public int keliling(){
		return panjang * this.sisi;
	}
	
	public double luas() {
		if(this.sisi==3) {
			return panjang*tinggi/2;
		}else if (this.sisi==4) {
			return panjang*panjang;
		}else {
			return 0;
		}
	}
}
