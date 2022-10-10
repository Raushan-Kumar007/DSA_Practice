package Array;

public class UniqueEle {
    static int unique_element(int[] arr){
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 6, 3, 6, 2};
        System.out.print(unique_element(arr));
    }
}
