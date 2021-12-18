public class Sekolah {
	public static void main (String[] args) {
		boolean berangkat=false;
		int jam=7;
		
		if(berangkat==false) {
			if (jam>=8) {
				System.out.println("Datang Terlambat");
				System.out.println("Mendapat Sanksi");
			}else {
				System.out.println("Tidak Terlambat");
			}
		} else {
			System.out.println("Tidak Berangkat Sekolah");
		}
	}

}
