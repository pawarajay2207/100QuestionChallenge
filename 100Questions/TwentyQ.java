public class TwentyQ {
	public void secMax(int[] a) {
		if (a.length < 2) {
			System.out.println("\nSecond largest does not exist.");
			return;
		}
		System.out.print("Given Array  : ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		int max = a[0];
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secmax = max;
				max = a[i];
			} else if (a[i] > secmax && a[i] != max) {
				secmax = a[i];
			}
		}
		if (secmax == Integer.MIN_VALUE) {
			System.out.println("\nSecond largest does not exist.");
		} else {
			System.out.println("\nSecond Largest element = " + secmax);
		}
	}	
	public static void main(String[] args) {
		TwentyQ ob = new TwentyQ();
		int[] arr1 = { 12, 35, 1, 10, 34, 1 };
		int[] arr2 = { 10, 5, 10 };
		int[] arr3 = { 10, 10, 10 };

		System.out.println("\nArray 1:");
		ob.secMax(arr1);

		System.out.println("\nArray 2:");
		ob.secMax(arr2);

		System.out.println("\nArray 3:");
		ob.secMax(arr3);
	}
}
// Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array.