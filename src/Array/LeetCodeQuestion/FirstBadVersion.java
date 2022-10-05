/*
     https://leetcode.com/problems/first-bad-version/

 */

package Array.LeetCodeQuestion;

public class FirstBadVersion {
    static int First_Bad_Version(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int ans  = 0;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                right = mid-1;
            }else {
                left = mid + 1;
            }
        }
        return ans ;
    }

    // this function is used is bad version at 4 or not if it's not at 4 then it'll move to left
     static boolean isBadVersion(int mid) {
        if(mid==4){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        System.out.print(First_Bad_Version(arr));
    }
}
