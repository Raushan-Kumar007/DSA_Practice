package Recursion;

public class pattern {
    static void printPattern(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printPattern(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
