package Array;

import java.util.Scanner;

public class ReverseArr {
    public static void reverseArr(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
