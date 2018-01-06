import java.util.Scanner;
public class LuasSegitiga
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int alas;
		int tinggi;
		double luas;
		System.out.print("Masukkan nilai alas : ");
		alas = masuk.nextInt();
		System.out.print("Masukkan nilai tinggi : ");
		tinggi = masuk.nextInt();
		luas = alas*tinggi/2;
		System.out.println("Luas = " + luas);
    }
}
