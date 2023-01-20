package Array;

public class majority {
    static int solve(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int res = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    res++;
                }
                if(res>n/2){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;
        System.out.println(solve(arr));
    }
}
