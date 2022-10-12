package String;

public class SubArray_Sum_windows_Size_K {
    static int  SubArrSum(int[] arr, int k){
        int sum = 0;
        // first window ka lea
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int ans = sum;
        for(int i=k; i<arr.length; i++){
            sum += arr[i];
            sum = sum - arr[i-k];
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
       int[] arr = {10,20,2,3,17,5,18,12,25};
       int k = 3;
        System.out.print(SubArrSum(arr,k));
    }
}
