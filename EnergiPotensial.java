import java.util.Scanner;
public class EnergiPotensial {
	
	public static void main(String[] args) {
		int massa;
		int gravitasi = 10;
		int ketinggian;
		int EnergiPotensial;

	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan nilai massa : ");
	massa = input.nextInt();
	System.out.print("Masukkan nilai ketinggian : ");
	ketinggian = input.nextInt();
	System.out.println("gravitasi = 10");

	EnergiPotensial = (massa*gravitasi*ketinggian);
	System.out.println("Energi Potensial = m*g*h= "+EnergiPotensial+" Joule");
	}
	}

