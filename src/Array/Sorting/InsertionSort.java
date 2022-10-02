package Array.Sorting;

public class InsertionSort {
    static void Sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int item = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, -7, 4, 8, 2 };
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
