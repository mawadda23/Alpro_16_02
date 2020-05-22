package ch04;

public class B {
    public static void main (String[] args){
        int [] nilai ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
		System.out.println("input nilai yang ingin dicari: ");
        int nilaiX = 12;
		boolean benar =  false;
		
		for (int baris = 0;baris < nilai.length;baris++) {
		for (int kolom = 0; kolom < nilai.length;kolom++) {
		  
			   System.out.println("Angka: " + nilaiX + "\nberada pada baris: " + baris + "\nkolom: " + kolom);
			   benar = true;
		   }
		}
	}
}