package OOps.Coupling.Association;

import java.util.ArrayList;
import java.util.List;

public class Composition {
    //person class
    static class Person
    {
        private String name;
        private int age ;
        Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    }

/* Group class contains the list of person
Objects. It is associated with the person
class through its Object(s). */

    //group class
    static class Group
    {
        private String groupName;
        private List<Person> persons;
        Group(String groupName, List<Person> persons)
        {
            this.groupName = groupName;
            this.persons = persons;
        }
    }

    //main method
        public static void main (String[] args)
        {
//creating objects of person class
            Person a = new Person("Tanmay", 17);
            Person b = new Person("Sam", 18);
            Person c = new Person("Pitu", 19);
            Person d = new Person("Khushi", 20);
//making a list of persons belongs to social welfare group
            List<Person> p1 = new ArrayList<>();
            p1.add(a);
            p1.add(c);
//making a list of persons belongs to drama fest group
            List<Person> p2 = new ArrayList<>();
            p2.add(b);
            p2.add(d);
//creating objects of group class
            Group swGrp = new Group("Social Welfare", p1);
            Group dfGrp = new Group("Drama Fest", p2);
//before deleting drama fest group
            System.out.println("List of persons in Drama Fest group:");
            for(Person p : p2) {
                System.out.println("Person name: " + p.getName() + ", Age:" + p.getAge() + ", Group: Drama Fest");
            }
//deleting drama fest group
            dfGrp = null;
//after deleting drama fest group
//person list will not destroy
            System.out.println("List of persons after deleting Drama Fest group:");
            for(Person p : p2) {
                System.out.println("Person name: " + p.getName() + ", Age: " + p.getAge());
            }
        }
}
