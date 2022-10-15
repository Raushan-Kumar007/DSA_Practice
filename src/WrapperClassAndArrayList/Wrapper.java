package WrapperClassAndArrayList;

public class Wrapper {
    public static void main(String[] args) {
        Integer a = 156;
        int a1 = 156;
        System.out.println(a==a1); // true
        a=a1; // AutoBoxing(when primitive datatype put in non-primitive)
        Integer b = 90;
        int b1 = 9;
        b1=b; // UnBoxing (when Non-primitive datatype put in primitive)
        Integer c = 12;
        Integer c1 = 12;
        Integer d = 167;
        Integer d1 = 167;
        System.out.println(c==c1); // true (because of Integer chase it's range is (-127 to 128) it will allow for Byte,Sort,Long Wrapper class
        // data type just like String pool)
        System.out.println(d==d1);//false (because it's range is not in Integer chase therefore it'll print false)
    }
}
