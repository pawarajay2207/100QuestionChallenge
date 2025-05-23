import java.util.Scanner;

public class NinteenQ {

    static int fact(int n){

        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The Factorial of  "+num+"  is : "+fact(num));
        sc.close();
    }
}
//Write a program that takes a number as input and prints its factorial using recursion.