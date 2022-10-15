package WrapperClassAndArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);
        // element add karne ka lea
        list.add(10);
        list.add(20);
        list.add(30);
//        System.out.println(list);
//        list.add(1,-5);
//        list.add(0,8);
//        System.out.println(list);
        // remove
//        System.out.println(list.remove(2));
//        System.out.println(list);
        // set == new value add nhi krega bass update krega
//        list.set(2,-7);
//        System.out.println(list);
        // for sorting
//        Collections.sort(list);
//        System.out.println(list);
        // for reverse
//        Collections.reverse(list);
//        System.out.println(list);
        // get
//        System.out.println(list.get(2));
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
        int[] arr = new int[3];
        for(int v : arr){
            System.out.print(v+" ");
        }
        System.out.println();
        for (int v : list){
            System.out.print(v+" ");
        }
    }
}
