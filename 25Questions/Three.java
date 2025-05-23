import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" : Even Number");
        }else{
            System.out.println(a+" : Odd Number");
        }
        sc.close();
    }
}
//Write a program that takes a number as input and prints whether it is even or odd.
