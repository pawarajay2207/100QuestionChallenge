import java.util.Arrays;
import java.util.Scanner;
public class SevenQ {
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
    int SmallestNum = arr[0];
    System.out.println("The Smallest number in the list is: " + SmallestNum);
    sc.close();
    }
}
//Write a program that takes a list of numbers as input and prints the Smallest number in the list.
