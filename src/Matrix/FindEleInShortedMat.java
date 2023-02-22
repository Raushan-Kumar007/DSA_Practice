package Matrix;

public class FindEleInShortedMat {
    static void solve(int[][] arr,int r, int c,int x){
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                if(arr[i][j]==x){
//                    System.out.print(i+","+j);
//                    return;
//                }
//            }
//        }
//        System.out.print("Not Found");
//    start comparing from top right or bottom left corner
         int low = 0; int high = c-1;
         while (low<high && high>=0){
             if(arr[low][high]==x){
                 System.out.print(low+","+high);
                 return;
             }else if(arr[low][high]>x){
                 high--;
             }else {
                 low++;
             }
         }
        System.out.print("Not Found");
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        solve(arr,4,4,2);
    }
}
