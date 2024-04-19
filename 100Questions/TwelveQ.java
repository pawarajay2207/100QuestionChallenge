import java.util.Scanner;

public class TwelveQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ",");
            }
        }
        
        sc.close();
    }
}
//Write a program that takes a number as input and prints all its factors.