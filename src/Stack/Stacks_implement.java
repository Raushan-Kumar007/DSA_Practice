package Stack;



public class Stacks_implement {
    public static void main(String[] args) throws Exception {
        Stacks s = new Stacks();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.size());
        s.push(-9);
        s.display();
    }
}
