package Recursion;

public class Count_SubSequenc {
    static int count = 0;
    static void printSubsequence(String que, String ans){
        if(que.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
       char ch =  que.charAt(0);
        printSubsequence(que.substring(1),ans);
        printSubsequence(que.substring(1),ans+ch);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str,"");
        System.out.println(count);
    }
}
