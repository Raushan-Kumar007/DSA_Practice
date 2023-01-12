package Array;

public class maxArthematicArr {
    static int MaxArr(int[] arr){
        int n = arr.length;
        int pd = arr[1]-arr[0];
        int ans = 2;
        int curr = 2;
        int i = 2;
        while (i<n){
            if(pd==arr[i]-arr[i-1]){
                curr++;
            }else{
                pd = arr[i] - arr[i-1];
                ans =   Math.max(ans,curr);
                curr = 2;
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,7,4,6,8,10,11};
        System.out.println(MaxArr(arr));
    }
}
