package ch07;

public class algoritmaCocktailsort {
	public static void main (String[] args) {
		int[] arr = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3,};
		System.out.println("Unsorted: " + Array.toString(arr));
		
		cocktailSort(arr);
		System.out.println("Sorted: " + Array.toString(arr));
	}
	
	public static void cocktailSort(int[] arr) {
		boolean swapped;
		do {
			swapped = false;
			for (int i=0;i<=arr.lebgth-2;i++) {
					if (arr[i]>arr[i+1]) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
						swapped = true;
					}
			}
			if (!swapped) {
				break;
			}
			swapped = false;
			for (int i = arr.length-2;i>=0;i--) {
				if (arr[i]>arr[i+1]) {
					int tempp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}
			}
		}while (swapped);
	}
}
			