public class TwentyOneQ {
    public void secMin(int[] a) {
        System.out.print("Given Array  : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secmin = min;
                min = a[i];
            } else if (a[i] < secmin && a[i] != min) {
                secmin = a[i];
            }
        }
        if (secmin == Integer.MAX_VALUE) {
            System.out.println("\nSecond smallest does not exist !!!");
        } else {
            System.out.println("\nSecond Smallest element :  " + secmin);
        }
    }    
    public static void main(String[] args) {
        TwentyOneQ ob = new TwentyOneQ();
        int[] arr = { 1, 1,1,2,4,6,8 };
        ob.secMin(arr);
    }
}// Given an array of integers, our task is to write a program that efficiently finds the second-smallest element present in the array.