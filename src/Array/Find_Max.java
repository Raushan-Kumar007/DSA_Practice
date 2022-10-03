package Array;

public class Find_Max {
    static int findMax(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[temp])
                temp=i;
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {12,25,33,10,7};
        System.out.println(findMax(arr));
    }
}
