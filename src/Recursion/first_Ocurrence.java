package Recursion;

public class first_Ocurrence {
    static int firstOcurrence(int[] arr, int item , int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
        return firstOcurrence(arr,item,i+1);
    }

    public static void main(String[] args) {
      int[] arr = {2,3,4,2,3,5,7,3};
      int item = 3;
      System.out.print(firstOcurrence(arr,item,0));

    }
}
