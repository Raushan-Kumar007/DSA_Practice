package dynamicStacks;

import Stack.Stacks;

public class dynamic_Stacks extends Stacks {
    @Override
    public void push(int item) throws Exception {
      if(this.isFull()==true){
          int[] newArr = new int[2*arr.length];
          for(int i=0; i<super.arr.length;i++){
              newArr[i] = arr[i];
          }
          arr = newArr;
      }
      super.push(item);
   }
}
