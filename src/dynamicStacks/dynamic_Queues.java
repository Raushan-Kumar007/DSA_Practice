package dynamicStacks;

import Queue.Queues;

public class dynamic_Queues extends Queues {
    @Override
    public void EnQueue(int item) throws Exception {
       if(isFull()){
           int[] newArr = new int[2*arr.length];
           for (int i = 0; i < size; i++) {
               int idx = (front + i) % arr.length; // % is for making circular queue
               newArr[i] = arr[idx];
           }
           arr = newArr;
           front=0;
       }
       super.EnQueue(item);
    }
}
