package Recursion;

public class print_Subsequence {
    static void printSubSequence(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        printSubSequence(ques.substring(1),ans);
        printSubSequence(ques.substring(1),ans+ch);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubSequence(str,"");
    }
}
