package Array;

public class Swap_num2 {
    static void Swap2(int[] arr1, int[] arr2){
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] other = { 100, 200, 300, 400 };
        System.out.println(arr[0] + " " + other[0]);// 10 100
        Swap2(arr, other);
        System.out.println(arr[0] + " " + other[0]);

        // it will not swap because we are Swaping address not index and we know that java is pass by value and  not pass by refrence
    }
}
