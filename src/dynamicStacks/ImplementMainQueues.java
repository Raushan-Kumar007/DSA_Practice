package dynamicStacks;

public class ImplementMainQueues {
    public static void main(String[] args) throws Exception {
        dynamic_Queues dq = new dynamic_Queues();
        dq.EnQueue(10);
        dq.EnQueue(20);
        dq.EnQueue(30);
        dq.display();
        dq.DeQueue();
        dq.display();
    }
}
