/*
   https://leetcode.com/problems/maximum-subarray/
 */

package Array.LeetCodeQuestion;

public class MaximumSubarray {
    static int Maximum_Subarray(int arr[]){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        System.out.print(Maximum_Subarray(arr));
    }
}
