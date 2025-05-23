import java.util.Arrays;
import java.util.Scanner;

public class SixQ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size of List : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in the List : ");
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int largestNumber = arr[n-1];
    System.out.println("The largest number in the list is: " + largestNumber);

        sc.close();
    }
}
//Write a program that takes a list of numbers as input and prints the largest number in the list.
