package Shape;

public class Shapes {
	private String nama;
	private int sisi;
	private int sudut;
	Formula formula;
	
	Shapes (String nama, int sisi, int sudut){
		this.nama = nama;
		this.sisi = sisi;
		this.sudut = sudut;
		formula = new Formula(sisi);
	}
	
	public void printData() {
		System.out.println("Nama = " + this.nama);
		System.out.println("Jumlah Sisi  = " + this.sisi);
		System.out.println("Jumlah Sudut = " + this.sudut);
		System.out.println("Keliling = " + formula.keliling());
		System.out.println("Luas = " + formula.luas());
	}
}
