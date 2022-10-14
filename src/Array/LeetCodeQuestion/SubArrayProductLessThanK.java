package Array.LeetCodeQuestion;

public class SubArrayProductLessThanK {
    static int subArray_Product_Less_Than(int num[] , int k) {
        int start = 0;
        int end = 0;
        int pro = 1;
        int ans = 0;
        while (end<num.length){
            // growing array
            pro *= num[end];
            // shrink array
            while (pro>=k && start<=end){
                pro = pro/num[start];
                start++;
            }
            // calculate ans
            ans = ans + end - start + 1;
            end++;
        }
        return ans;
    }
    public static void main(String[] args) {
      int arr[] = {10,5,2,6};
        System.out.print(subArray_Product_Less_Than(arr,100));
    }
}
