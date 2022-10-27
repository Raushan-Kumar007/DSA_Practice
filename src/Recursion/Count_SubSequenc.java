package Recursion;

public class Count_SubSequenc {
//    static int count = 0;
//    static void printSubsequence(String que, String ans){
//        if(que.length()==0){
//            System.out.println(ans);
//            count++;
//            return;
//        }
//       char ch =  que.charAt(0);
//        printSubsequence(que.substring(1),ans);
//        printSubsequence(que.substring(1),ans+ch);
//    }
    // by using recursion
    static int countAns(String ques, String ans){
        if(ques.length()==0){
            return 1;
        }
        char ch = ques.charAt(0);
        int a = countAns(ques.substring(1),ans);
        int b = countAns(ques.substring(1),ans+ch);
        return a+b;
    }
    public static void main(String[] args) {
        String str = "abc";
 //       printSubsequence(str,"");
 //       System.out.println(count);
        System.out.println(countAns(str,""));
    }
}
