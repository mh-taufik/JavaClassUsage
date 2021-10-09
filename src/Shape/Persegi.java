package Shape;

public class Persegi extends Shapes{
	Formula formula;
	private int keliling;
	
	Persegi(String nama, int sisi, int sudut){
		super(nama,sisi,sudut);
		formula = new Formula(sisi);
	}
	
	public void printData() {
		super.printData();
		System.out.println("Keliling = " + formula.keliling());
	}
}
