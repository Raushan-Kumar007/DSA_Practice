package Queue;

public class Queues {
    private int[] arr;
    private int size; // this is for enqueue of an element
    private int front; // this is for dequeue of an element
    public Queues(){
     this.arr=new int[5];
     this.size=0;
     this.front=0;
    }
    public Queues(int item){
      this.arr=new int[item];
      this.size=0;
      this.front=0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public  boolean isFull(){
       return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void EnQueue(int item) throws Exception {
        if(isFull()==true){
            throw new Exception("queue full hai");
        }
        int idx = (front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int DeQueue() throws Exception {
        if(isEmpty()==true){
            throw new Exception("queue full hai");
        }
     int val = arr[front];
     front = (front + 1) % arr.length; // % is for making circular queue
     size--;
     return val;
    }
    public int  GetFront() throws Exception {
        if(isEmpty()==true){
            throw new Exception("queue full hai");
        }
        int val = arr[front];
        return val;
    }
    public void display(){
        for (int i = 0; i < size; i++) {
           int idx = (front + i) % arr.length; // % is for making circular queue
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
