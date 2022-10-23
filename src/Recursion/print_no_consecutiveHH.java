package Recursion;

public class print_no_consecutiveHH {
    static void PrintOutcomes(int n, String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            PrintOutcomes(n - 1, ans + "H");
        }
        PrintOutcomes(n-1,ans +"T");
    }
    public static void main(String[] args) {
        int n = 3;
        PrintOutcomes(n,"");
    }
}
