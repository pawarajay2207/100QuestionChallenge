import java.util.Scanner;

public class TwentyThreeQ {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();
    
            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();
    
            boolean areRotations = str1.length() == str2.length() && (str1 + str1).contains(str2);
    
            System.out.println(areRotations ? "The strings are rotations of each other." : "The strings are not rotations of each other.");
    
            scanner.close();
        }
    }
    