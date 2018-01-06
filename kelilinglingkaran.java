import java.util.Scanner;
public class kelilinglingkaran
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int jarijari;
		double keliling;
		double phi = 3.14;
		System.out.print("Masukkan Jari-jari : ");
		jarijari = masuk.nextInt();
		System.out.println("Phi = 3.14");
		keliling = 2*3.14*jarijari;
		System.out.println("Keliling = " + keliling);
    }
}