import java.util.InputMismatchException;
import java.util.Scanner;
public class Ifnestedexample_input {
	public static void main (String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int umur=0;
		String hamil;
		System.out.println("Berapa Umur Anda (Hanya Angka) : ");
		try {
			umur = scan1.nextInt();
			if(umur>=18) {
				Scanner scan2 = new Scanner(System.in);
				System.out.print("Apakah Sedang Hamil? (Ya/Tidak) :");
				hamil = scan2.nextLine();
				
				if (hamil.toLowerCase().equals("tidak")) {
					System.out.println("Vaksin AstraZeneca");
				}else if (hamil.toLowerCase().equals("ya")) {
					System.out.println("Vaksin Sinovac");
					System.out.println("Vaksin Pfizer");
					System.out.println("Vaksin Moderna");
				}else {
					System.out.println("Input Anda Tidak Sesuai");
				}
			}else {
				System.out.println("Vaksin Jenis Sinovac");
			}
		}catch (InputMismatchException a) {
			System.out.print("Anda tidak memasukkan angka");
		}
	}
}
