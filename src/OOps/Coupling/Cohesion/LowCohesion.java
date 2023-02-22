package OOps.Coupling.Cohesion;
//Low Cohesion: In the following code, we have a class called Book. But it is less cohesive because it comprises less focussed and independent attributes and methods to the class. This class should contain information related to the Book. Therefore, the person’s name and age method are making this classless cohesive.
public class LowCohesion {
    class Book {
        int price = 299; //related attribute
        String name = "Sam"; //unrelated attribute

        //related methods to Book class
        public String author(String name) {
            return name;
        }
    }
    public String title(String subject) {
        return subject;
    }
    public int id(int number) {
        return number;
    }
    //unrelated methods to Book class
    public int age(int age) {
        return age;
    }

    public static void main(String[] args) {

    }
}
