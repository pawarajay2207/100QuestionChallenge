import java.util.Scanner;

public class EightQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of List : ");
        int size = sc.nextInt();
        System.out.println("Enter a numbers in List : ");
        double[] list = new double[size];
        for(int i=0; i<size ; i++){
            list[i]=sc.nextDouble();
        }
        double  sum = 0;
        for (double num:list){
            sum+=num;
        }
        double avg = sum/size;
        System.out.println("The average of the numbers in the list : "+avg);
        sc.close();
    }
}
//Write a program that takes a list of numbers as input and prints the average of the numbers in the list.