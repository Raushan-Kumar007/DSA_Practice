package WrapperClassAndArrayList;

import java.util.ArrayList;

public class Sum_Of_Two_Num {
    static void sumOfTwoNum(int[] arr, int[] arr1){
        int carry = 0;
        int i = arr.length-1;
        int j = arr1.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i>=0 || j>=0){
            int sum = 0;
            if(i>=0) {
                sum += arr[i];
                i--;
            }
            if(j>=0) {
                sum += arr1[j];
                j--;
            }
            sum += carry;
            list.add(sum%10);
            carry = sum/10;
        }
        if(carry>0){
            list.add(carry);
        }
        for (int k = list.size()-1; k >= 0; k--) {
            System.out.print(list.get(k)+" ");
        }
    }
    public static void main(String[] args) {
//      int arr[] = {1,0,2,9};
//      int arr1[] = {3,4,5,6,7};
        int arr[] = {8,5};
        int arr1[] = {4,5};
      sumOfTwoNum(arr,arr1);
    }
}
