package Recursion;

public class fibonacci {
    static int fibonacci_num(int n){
        if(n<0){
            return -1;
        }
        if(n==0||n==1){
            return n;
        }
        return fibonacci_num(n-1)+fibonacci_num(n-2);
    }
    public static void main(String[] args) {
       int n = 5;
//        for (int i = 0; i <n ; i++) {
//            System.out.println(fibonacci_num(i));
//        }
        System.out.println(fibonacci_num(n));
    }
}
