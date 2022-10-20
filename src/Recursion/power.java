package Recursion;

public class power {
    static  int power_value(int a,int b){
        if(b==0){
            return 1;
        }
        int p = power_value(a,b-1);
        return p*a;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        System.out.println(power_value(a,b));
    }
}
