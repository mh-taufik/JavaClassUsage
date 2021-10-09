package Animal;

public class BodySize {
	public static String getBodySize(int size) {	
	// size adalah variabel untuk menentukan size dengan angka 
	// skalanya 1 adalah terkecil dan 5 adalah yang terbesar
		switch(size) {
			case 1:
				return "Very Small";
			case 2:
				return "Small";
			case 3:
				return "Normal";
			case 4:
				return "Big";
			case 5:
				return "Very Big";
			default:
				return "Wrong Input";
		}
	}

}
