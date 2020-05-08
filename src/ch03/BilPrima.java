package ch03;

public class BilPrima {
	public static void main(String[] args) {
		int bil = 8;
		boolean prima = true;
		
		for (int i=2; i<= (bil/2); i++) {
			if (( bil % i) == 0) {
				prima = false;
				break;//menghentikan pengulangan
			}
		}
				
				if(prima) {
					System.out.println(bil + " merupakan bil prima");
				} 
				else{
					System.out.println(bil + "bukan bil prima");
				}
			}
}