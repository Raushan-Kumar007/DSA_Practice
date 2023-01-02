package Queue;

public class Queues_impliment {
    public static void main(String[] args) throws Exception {
        Queues q = new Queues();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        System.out.println(q.DeQueue());
        System.out.println(q.DeQueue());
        q.EnQueue(-10);
        q.EnQueue(-20);
        q.EnQueue(-30);
        q.display();
        System.out.println(q.GetFront());
    }
}
