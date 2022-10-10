package Array;

public class Duplicates {
    static int duplicates(int [] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0 ,7 ,2 ,5, 4, 7, 1, 3, 6};
        System.out.println(duplicates(arr));
    }
}
