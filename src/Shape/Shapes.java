package Shape;

public class Shapes {
	private String nama;
	private int sisi;
	private int sudut;
	
	Shapes (String nama, int sisi, int sudut){
		this.nama = nama;
		this.sisi = sisi;
		this.sudut = sudut;
	}
	
	public void printData() {
		System.out.println("Nama = " + this.nama);
		System.out.println("Jumlah Sisi  = " + this.sisi);
		System.out.println("Jumlah Sudut = " + this.sudut);
	}
}
