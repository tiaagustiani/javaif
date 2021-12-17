import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BiayaKuliah {
	public static void main(String[] args)throws Exception{
		System.out.println("Informasi Kode Waktu jurusan Ilkom : \nPagi = a1\nSore = a2\n ");
		System.out.println("Silahkan Input Kode : ");
		
		String kelas, kul, jurusan;
		int biaya, total;
		BufferedReader x = new BufferedReader (new InputStreamReader(System.in));
		kul=x.readLine();
		
		if (kul.equalsIgnoreCase("a1")){
			jurusan="Ilmu Komputer";
			kelas="Pagi";
			biaya=1500000;
		}
		else if (kul.equalsIgnoreCase("a2")){
			jurusan="Ilmu Komputer";
			kelas="Sore";
			biaya=2000000;
		}
		else {
			jurusan="Data Tidak Ada";
			kelas="Data Tidak Ada";
			biaya=0;
		}
		
		System.out.println("\nNama Jurusan    : "+jurusan);
		System.out.println("Kelas           : "+kelas);
		System.out.println("Biaya Kuliah    : Rp."+biaya);
	}
}
