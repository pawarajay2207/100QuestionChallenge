import java.util.Arrays;
import java.util.Scanner;
public class NineQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list :");
        int size = sc.nextInt();
        double[] a = new double[size];
        System.out.println("Enter the numbers :");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        double median;
        if (size % 2 == 0) {
            median =  (a[size / 2 - 1] + a[size / 2]) / 2.0;
        } else {
            median = a[size / 2];
        }
        System.out.println("The median of the numbers in the list is : " + median);
        sc.close();
    }
}
//Write a program that takes a list of numbers as input and prints the median of the numbers in the list.
