import java.util.Scanner;

public class TenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer :");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Error: Please enter a non-negative integer.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of  " + n + "  is = " + factorial);
        }

        sc.close();
    }
}
//Write a program that takes a non-negative integer as input and calculates its factorial. 