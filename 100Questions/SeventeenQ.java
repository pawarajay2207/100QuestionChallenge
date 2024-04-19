import java.util.Scanner;
public class SeventeenQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        
        boolean pairsFound = false;
        System.out.print("Pairs of elements that sum up to " + target + ": ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] + a[j] == target) {
                    System.out.println("(" + a[i] + ", " + a[j] + "), ");
                    pairsFound = true;
                }
            }
        }
        if (!pairsFound) {
            System.out.println("Sorry!! no pairs Found !! With target value: " + target);
        }
        sc.close();
    }
}