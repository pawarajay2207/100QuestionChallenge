import java.util.Scanner;
public class SixteenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array : ");
        int size = sc.nextInt();
        System.out.print("Enter a numbers in array : ");
        int[] array = new int[size];

        for(int i=0; i<size ; i++){
            array[i]=sc.nextInt();
        }
            System.out.print("Original array : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
            System.out.print("\nReversed array : ");
        for (int i = array.length - 1; i >= 0; i--) {
             System.out.print(array[i] + " ");
            }
            sc.close();
        }
}