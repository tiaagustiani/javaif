import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Bioskop {
	public static void main(String[] args)
			throws Exception{
		String pes, pesawat, kapal;
		int tik;
		double dis, total, harga;
		
		BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
		System.out.println(" BIOSKOP KAMU CINEMA XXI \n ");
		System.out.println(" KODE |       JUDUL FILM ");
		System.out.println(" 101  | SPIDER-MAN: NO WAY HOME (SU)\n 102  | YOWIS BEN: FINALE (R)\n 103  | PAW PATROL: THE MOVIE (SU)\n");
		System.out.print("Masukkan Kode Nomer Judul Film [Hanya Angka Sesuai List Diatas] : ");
		
		pes=x.readLine();
		System.out.print("Masukkan Banyak Tiket yang dibeli : ");
		tik=Integer.parseInt(x.readLine());
		
		if (pes.equalsIgnoreCase("101")){
			if (tik >=4){
				pesawat = "Spider-Man :No Way Home";
				harga=48000;
				total=harga*tik;
			}
			else {
				pesawat="Spider-Man:No Way Home";
				harga=50000;
				total=harga*tik;
			}
		}
		else if (pes.equalsIgnoreCase("102")){
			if (tik >=4){
				pesawat="Yowis Ben:Final";
				harga=38000;
				total=harga*tik;
			}
			else{
				pesawat="Yowis Ben:Final";
				harga=40000;
				total=harga*tik;
			}
		}
		else if (pes.equalsIgnoreCase("103")){
			if (tik <=3){
				pesawat="Paw Patrol:The Movie";
				harga=28000;
				total=harga*tik;
			}
			else {
				pesawat="Paw Patrol:The Movie";
				harga=30000;
				total=harga*tik;
			}
		}
		else {
			pesawat="tidak ada data";
			harga=total=0;
		}
		System.out.println("Judul Film : "+pesawat);
		System.out.println("Harga Tiket : Rp."+harga);
		System.out.println("Total Yang Harus Dibayar : Rp."+total);
	}
}
