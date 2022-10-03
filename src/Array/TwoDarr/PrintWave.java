package Array.TwoDarr;

public class PrintWave {
    static void WavePrint(int arr[][]){
        for(int col=0; col<arr.length; col++){
                if(col%2==0){
                    for(int row = 0; row<arr[col].length;row++){
                        System.out.print(arr[row][col]+" ");
                    }
                }else {
                    for(int row = arr[0].length-1; row>=0; row--){
                        System.out.print(arr[row][col]+" ");
                    }
                }
            }
        }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                {4,5,6},{7,8,9}};
        WavePrint(arr);
    }
}
