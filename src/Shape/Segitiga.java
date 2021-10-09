package Shape;

public class Segitiga extends Shapes{
	Formula formula;
	
	Segitiga(String nama, int sisi, int sudut){
		super(nama,sisi,sudut);
		formula = new Formula(sisi);
	}
	
	public void printData() {
		super.printData();
		System.out.println("Keliling = " + formula.keliling());
	}
	
}
