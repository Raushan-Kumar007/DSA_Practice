package OOps.Coupling;

// Tight coupling: If one class is strongly interrelated to another class, it is said to have a tight coupling with that class.
public class TightCoupling {
    public static class College{
        public void status() {
            System.out.println("College is open today");
        }
    }
    public static class Student {
        College obj = new College();

        public void goToCollege() {
            obj.status();
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.goToCollege();
    }
}
