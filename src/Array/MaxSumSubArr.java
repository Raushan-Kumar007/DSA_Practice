package Array;

public class MaxSumSubArr {
    static int MaxSum(int arr[]){
        int ans = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                ans  = Math.max(sum,ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(MaxSum(arr));
    }
}
