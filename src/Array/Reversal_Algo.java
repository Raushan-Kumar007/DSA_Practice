package Array;

public class Reversal_Algo {
    public static void RotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        // 1st n-k element reverse krna h
        Reverse(arr, 0, n - k - 1);
        // last k element reverse krna h
        Reverse(arr, n - k, n - 1);
        // All element Reverse krna h
        Reverse(arr, 0, n - 1);

    }
    public static void Reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

       int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        RotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
