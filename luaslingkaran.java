import java.util.Scanner;
public class luaslingkaran
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int jarijari;
		double luas;
		double phi = 3.14;
		System.out.print("Masukkan Jari-jari : ");
		jarijari = masuk.nextInt();
		System.out.println("Phi = 3.14");
		luas = 3.14*jarijari*jarijari;
		System.out.println("Luas = " + luas);
    }
}