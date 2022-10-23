package Recursion;

public class printOutcomes {
    static void PrintOutcomes(int n, String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        PrintOutcomes(n-1,ans + "H");
        PrintOutcomes(n-1,ans +"T");
    }
    public static void main(String[] args) {
        int n = 3;
        PrintOutcomes(n,"");
    }
}
