package Matrix;

public class SnakePattern {
    static void solve(int[][] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        solve(arr);
    }
}
