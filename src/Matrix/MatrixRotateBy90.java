package Matrix;

public class MatrixRotateBy90 {
    static void solve(int[][] arr,int n, int m){
//        int[][] temp = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                temp[n-j-1][i]=arr[i][j];
//            }
//        }
//        for(int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                arr[i][j]=temp[i][j];
//            }
//        }
//  here 1st we will transpose the matrix and then reverse the matrix it's an efficient approach
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }
        for (int i=0;i<n;i++){
            int low = 0; int heigh = n-1;
            while (low<heigh){
                int temp = arr[low][i];
                arr[low][i] = arr[heigh][i];
                arr[heigh][i]=temp;
                low++;
                heigh--;
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
