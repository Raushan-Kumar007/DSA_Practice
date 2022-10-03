package Array;

public class Find_Min {
    static int findMin(int arr[]){
        int ans  = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[ans])
                ans = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,25,7,5,1};
        System.out.print(findMin(arr));
    }
}
