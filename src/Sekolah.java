public class Sekolah {
	public static void main (String[] args) {
		int jam=9;
		boolean berangkat=true;
		if(jam>=8) {
			if (berangkat==true) {
				System.out.println("Datang Terlambat");
				System.out.println("Mendapat Sanksi");
			}
			if(jam==12) {
				if (berangkat=false) {
				}
				System.out.println("Tidak Berangkat Sekolah");
			}
		} else {
			System.out.println("Tidak Terlambat");
		}
	}

}
