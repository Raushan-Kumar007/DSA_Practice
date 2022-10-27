package Recursion;

public class Board_Path {
    static void boardPath(int curr, int n, String ans){
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        boardPath(curr+1,n,ans+1);
        boardPath(curr+2,n,ans+2);
        boardPath(curr+3,n,ans+3);
    }
    public static void main(String[] args) {
       int n = 4;
       boardPath(0,n,"");
    }
}
