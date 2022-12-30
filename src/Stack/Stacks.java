package Stack;
import java.io.*;

public class Stacks {
    private int[] arr;
    private int top;

    public Stacks() {
        arr = new int[5];
        top = -1;
    }

    public Stacks(int cap) {
        arr = new int[cap];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public void push(int item) throws Exception {
        if (isFull() == true) {
            throw new Exception("Stack full hai");
        }
        top++;
        arr[top] = item;
    }

    public int pop() {
        int val = arr[top];
        top--;
        return val;
    }

    public int peek() throws Exception {
        if (isEmpty() == true) {
          throw new Exception("Stack full hai");
       }
        int val = arr[top];
        return val;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}



