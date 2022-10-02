package Array;

import java.util.Scanner;

public class BinarySearch {
    static int Binary_Search(int arr[], int item){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==item){
                return mid;
            }else if(arr[mid]>item){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12,20,28,19};
        System.out.println(Binary_Search(arr,28));
    }
}
