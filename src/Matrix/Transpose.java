package Matrix;

public class Transpose {
    static void solve(int[][] arr, int n, int m){
//        int[][] temp = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                temp[i][j]=arr[j][i];
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=temp[i][j];
//            }
//        }
//       Diagonal element is always same if we transpose the matrix here we are sawping the i+1 element

        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        solve(arr,3,3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
