import java.util.Scanner;

public class FifteenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        if (input % 2 == 0) {
            int cube = input * input * input;
            System.out.println(input + " : Number is EVEN & it's Cube is : " + cube);
        } else {
            int square = input * input;
            System.out.println(input + " : Number is ODD & it's Square is : " + square);
        }
        sc.close();
    }
}
