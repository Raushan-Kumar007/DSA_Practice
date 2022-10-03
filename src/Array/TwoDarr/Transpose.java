package Array.TwoDarr;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Transpose_Matrix(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Transpose_Matrix(int arr[][]){
        for(int row =0; row<arr.length; row++){
            for(int col = row + 1; col<arr[row].length; col++){
                int temp = arr[row][col];
                arr[row][col]=arr[col][row];
                arr[col][row]=temp;
            }
        }
    }
}
