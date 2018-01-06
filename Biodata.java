import java.util.Scanner;
public class Biodata{
    public static void main (String args[]) {
   
        Scanner masuk=new Scanner(System.in);
      
        String NamaDepan, NamaBelakang, tmpt, Tgl, Alamat;
      
        System.out.println("--------------------------------------");
        System.out.println("Menampilkan Biodata Anda");
        System.out.println("--------------------------------------");
        System.out.println();
        	System.out.print("Nama Depan     :");
        	NamaDepan=masuk.nextLine();
        	System.out.print("Nama Belakanng :");
       		NamaBelakang=masuk.nextLine();
		System.out.print("Tempat Lahir    :");
		tmpt=masuk.nextLine();
        	System.out.print("Tanggal Lahir  :");
        	Tgl=masuk.nextLine();
		System.out.print("Alamat          :");
		Alamat=masuk.nextLine();
       
        System.out.println("======================================");
        System.out.println("          Biodata           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap   : "+NamaDepan+" "+NamaBelakang);
        System.out.println("Alamat         :"+Alamat);
        System.out.println("Tmpat/Tgl      :"+tmpt+", "+Tgl);
        System.out.println("======================================");
            
      
    }
} 