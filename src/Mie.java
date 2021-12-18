import java.util.Scanner;
public class Mie {
	public static void main (String[] args) {
		boolean mie=true;
		int waktu=14;

		if (mie==true) {
			if(waktu==3) {
				System.out.println("Mie Matang Sempurna");
			}if (waktu<=2) {
				System.out.println("Mie Belum Matang");
			}if (waktu>=4) {
				System.out.println("Mie Terlalu Lembek");
			}if (waktu>=10) {
				System.out.println("Mie Sudah Menjadi Bubur");
			}
		} else {
			System.out.println("Tidak ada kondisi ");
		}
	}

}
