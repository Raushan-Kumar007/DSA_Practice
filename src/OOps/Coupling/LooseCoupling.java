package OOps.Coupling;

//Loose coupling: If one class is weakly interrelated to another class, it is said to have loose coupling with that class. Loose coupling is preferred over tight coupling. A class can achieve this with the help of interfaces, as shown below.
public class LooseCoupling {
    public interface College{
        void status();
    }
    static class CollegeStatus1 implements College{
        public void status() {
            System.out.println("College is open monday to friday");
        }
    }
    static class CollegeStatus2 implements College{
        public void status() {
            System.out.println("College is open on saturday");
        }
    }
    public static class Student{
        College obj = new CollegeStatus1();
        public void goToCollege() {
            obj.status();
        }
    }
    public static void main(String[] args) {
      Student s = new Student();
      s.goToCollege();
    }
}
