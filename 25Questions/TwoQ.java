import java.util.Scanner;

public class TwoQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter second number :");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("Sum Of Two Numbers : "+sum);
        sc.close();
    }
}
//Write a program that takes two numbers as input and prints their sum to the console.
