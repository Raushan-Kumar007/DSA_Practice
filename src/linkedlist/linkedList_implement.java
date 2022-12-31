package linkedlist;

public class linkedList_implement {
    public static void main(String[] args) throws Exception {
        linkedList ll = new linkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.Display();
        ll.addlast(40);
        ll.Display();
        ll.addatIndex(2,-9);
        ll.Display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getatIndex(2));
    }
}
