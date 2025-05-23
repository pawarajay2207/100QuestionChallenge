import java.util.Scanner;

public class FourteenQ {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] freq = new int[n];
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    continue;
                }
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                freq[i] = count;
            }
            System.out.println("Frequency of each number in the array:");
            for (int i = 0; i < n; i++) {
                if (freq[i] != 0) {
                    System.out.println(a[i] + " : " + freq[i]);
                }
            }
            sc.close();
        }
    }
//Write a program that takes a list of numbers as input and prints the frequency of each number in the list.