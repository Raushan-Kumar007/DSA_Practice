package Array;

public class KadanesAlgo {
    static int maxSumSubArr(int arr[]){
        int n = arr.length;
        int ans = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(maxSumSubArr(arr));
    }
}
