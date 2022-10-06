/*
  https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

package Array.LeetCodeQuestion;

public class Search__a_2D_Matrix_II {
//    static boolean SearchA2DMat(int arr[][],int x){
//        int n = arr.length;
//        for(int row=0;row<n;row++){
//            for(int col=0; col<arr[row].length; col++){
//                if(arr[row][col]==x)
//                    return true;
//            }
//        }
//        return false;
//    }
    static boolean SearchA2DMat(int arr[][],int item) {
        int n = arr.length;
        int row = 0;
        int col = arr[0].length - 1;
       while (row<n && col>0){
           if(arr[row][col]==item)
               return true;
           else if(arr[row][col]>item){
               col--;
           }else {
               row++;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.print(SearchA2DMat(arr,100));
    }
}
