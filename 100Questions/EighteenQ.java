import java.util.Scanner;

public class EighteenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the strings:");
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("Strings sorted by length in ascending order are :");
        for (String s : str) {
            System.out.print(s+", ");
        }
        sc.close();
    }
}
