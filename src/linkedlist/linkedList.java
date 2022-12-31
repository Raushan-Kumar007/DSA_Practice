package linkedlist;

import java.util.LinkedList;

public class linkedList {
    private static class Node{
        int data;
        Node next;
    }
    private Node head;// 1st node address
    private Node tail;// last node address
    private int size;// total number of node in linkedList
    public  void addfirst(int item){
        Node nn = new Node();
        nn.data=item;
        if(size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addlast(int item){
         if(size==0){
             addfirst(item);
         }else{
             Node nn = new Node();
             nn.data=item;
             tail.next=nn;
             tail=nn;
         }
    }
    public Node getnode(int k) throws Exception {
        if(k<0||k>=size){
            throw new Exception("Index valid dedo bklol");
        }
        Node temp = head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addatIndex( int k, int item) throws Exception {
        if(k==0){
            addfirst(item);
        }else if(k==size-1){
            addlast(item);
        }else{
            Node nn = new Node();
            nn.data=item;
            Node kth = getnode(k-1);
            nn.next=kth.next;
            kth.next=nn;
            size++;
        }
    }
    public int getFirst() throws Exception {
        if(size==0){
            throw new Exception();
        }
        return head.data;
    }
    public int getLast() throws Exception {
        if(size==0){
            throw new Exception();
        }
        return tail.data;
    }
    public int getatIndex(int k) throws Exception {
        if(size==0){
            throw new Exception();
        }
        return getnode(k).data;
    }
    public void Display(){
      Node temp = head;
      while (temp!=null){
          System.out.print(temp.data+"-->");
          temp = temp.next;
      }
        System.out.println(".");
    }

}
