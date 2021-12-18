public class Mencuci {
	public static void main(String[] args) {
		boolean air = true;
		boolean sabun = true;
		// cek apakah dia akan ditilang atau tidak
		if(air == true){
			if( sabun == true ) {
				System.out.println("Air dan Sabun Ada");
				System.out.println("Mari Mencici");
			}
		} else {
			System.out.println("Tidak Ada Air, Tidak Bisa Mencuci");
		}
	}
}