package WrapperClassAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
