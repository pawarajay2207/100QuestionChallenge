import java.util.Scanner;

public class FiveQ {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a String : ");
            String s1 = scanner.nextLine();
            String s2 = "";

            int i;
            for (i = s1.length() - 1; i >= 0; i--) {
                s2 += s1.charAt(i);
            }
            //String revstring = new StringBuilder(s1).reverse().toString();    // We can also find Using enbaled function  of Java to reverse the string
            if (s1.equals(s2)) {
                System.out.println("The given string is palindrome");
            } else {
                System.out.println("The given string is NOT palindrome");
            } 
        }
    }
}
//Write a program that takes a string as input and prints whether it is a palindrome (reads the same forwards and backwards).
