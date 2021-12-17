import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Bioskop {
	public static void main(String[] args)
			throws Exception{
		String kode, judul;
		int tiket;
		double total, harga;
		
		BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
		System.out.println(" BIOSKOP KAMU CINEMA XXI \n ");
		System.out.println(" KODE |       JUDUL FILM ");
		System.out.println(" 101  | SPIDER-MAN: NO WAY HOME (SU)\n 102  | YOWIS BEN: FINALE (R)\n 103  | PAW PATROL: THE MOVIE (SU)\n");
		System.out.print("Masukkan Kode Nomer Judul Film [Hanya Angka Sesuai List Diatas] : ");
		
		kode=x.readLine();
		System.out.print("Masukkan Banyak Tiket yang dibeli : ");
		tiket=Integer.parseInt(x.readLine());
		
		if (kode.equalsIgnoreCase("101")){
			if (tiket >=4){
				judul = "Spider-Man :No Way Home";
				harga=48000;
				total=harga*tiket;
			}
			else {
				judul="Spider-Man:No Way Home";
				harga=50000;
				total=harga*tiket;
			}
		}
		else if (kode.equalsIgnoreCase("102")){
			if (tiket >=4){
				judul="Yowis Ben:Final";
				harga=38000;
				total=harga*tiket;
			}
			else{
				judul="Yowis Ben:Final";
				harga=40000;
				total=harga*tiket;
			}
		}
		else if (kode.equalsIgnoreCase("103")){
			if (tiket >=4){
				judul="Paw Patrol:The Movie";
				harga=28000;
				total=harga*tiket;
			}
			else {
				judul="Paw Patrol:The Movie";
				harga=30000;
				total=harga*tiket;
			}
		}
		else {
			judul="-";
			harga=total=0;
		}
		System.out.println("Judul Film : "+judul);
		System.out.println("Harga Tiket : Rp."+harga);
		System.out.println("Total Yang Harus Dibayar : Rp."+total);
	}
}
