package Array;

import java.util.Scanner;

public class Swap_num {
    static void Swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
        Swap(arr,i,j);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
