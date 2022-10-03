/*
         238. Product of Array Except Self
         https://leetcode.com/problems/product-of-array-except-self/
 */


package Array.LeetCodeQuestion;

public class ProductOfArrExceptSelf {
    static int[] product(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int[] right = new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int[] ans = product(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
