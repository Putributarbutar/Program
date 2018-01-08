import java.util.Scanner;
public class nilaiMax 
{

	public static void main(String args[]) 
	{
		Scanner masuk = new Scanner(System.in);
		int data;
		int i=1;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int x=0;
	System.out.print("Banyak data : ");
	data = masuk.nextInt();
	while (i<=data) {
	System.out.print("Data ke "+i+ " : ");
	x = masuk.nextInt();
		if(x>max) 
		max = x;
		if(x<min)
		min = x;
	i++;
}

System.out.println("Nilai Minimum : "+min);
System.out.println("Nilai Maksimum : "+max);
}
}
	