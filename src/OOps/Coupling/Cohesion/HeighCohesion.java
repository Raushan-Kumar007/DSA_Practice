package OOps.Coupling.Cohesion;

public class HeighCohesion {
    class Book{
        int price = 299; //related attribute
        //related methods to Book class
        public String author(String name) {
            return name;
        }
        public String title(String subject) {
            return subject;
        }
        public int id(int number) {
            return number;
        }
    }
}
