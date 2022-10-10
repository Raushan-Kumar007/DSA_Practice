package Array;

public class Swap01 {
    // this method is valid when you are scanning arrays two or more times
//    static void swap01(int[] arr, int n){
//        int count = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        for(int i=0;i<count;i++){
//            arr[i]=0;
//        }
//        for(int i=count;i<n;i++){
//            arr[i]=1;
//        }
//    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap01(int arr[],int n){
        int i=0; int j = n-1;
        while (i<j){
            if(i==1){
                if(j!=1){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j--;
            }else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 1 };
        swap01(arr,6);
        print(arr);
    }
}
