package ch03;

public class BilanganTerbesar2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 30;
		int z = 50;
		if (x >= y && x >= y) {
			System.out.println(x + " : adalah yang terbesar");
		} else if (y >= x && y >= z) {
			System.out.println(y + " : adalah yangterbesar");
		} else {
			System.out.println(z + " : adalah yang terbesar");
		}
	}
}