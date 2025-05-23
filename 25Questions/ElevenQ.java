import java.util.Scanner;

public class ElevenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1 = sc.nextLine();
        String[] words = s1.split(" ");
        String revStr = "";

        for (String s2 : words) {
            String revWord = "";
            for (int i = s2.length() - 1; i >= 0; i--) {
                revWord += s2.charAt(i);
            }
            revStr += revWord + " ";
        }
        System.out.println("Reversed String : " + revStr.trim());
        sc.close();
    }
}
//Write a program that takes a string as input and prints the reverse of each word in the string.