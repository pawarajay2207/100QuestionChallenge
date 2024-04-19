import java.util.*;
public class TwentyTwoQ {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String:");
        String str = sc.nextLine();
        boolean foundChar = false; 

        for (char i : str.toCharArray()) {
            if (str.toLowerCase().indexOf(Character.toLowerCase(i)) == str.toLowerCase().lastIndexOf(Character.toLowerCase(i))) {
                System.out.println("The first character which is not repeating is : " + i);
                foundChar = true; 
                break;
            }
        }
        if (!foundChar) { 
            System.out.println("There is no non-repeating character in the input string");
        }
        sc.close();
    }
}
//Write a program that takes a string as input and prints the first non-repeating character in the string.