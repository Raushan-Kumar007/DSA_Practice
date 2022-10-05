package Array.LeetCodeQuestion;

public class RotateArray {
    static void Rotate_Array(int arr[],int k){
        int n = arr.length;
        k=k%n;

            reverse(arr, 0, n - k - 1);
            reverse(arr, n - k, n - 1);
            reverse(arr, 0, n - 1);
    }
    static void reverse(int arr[],int left, int right){
        left=0;
        right=arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Rotate_Array(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
