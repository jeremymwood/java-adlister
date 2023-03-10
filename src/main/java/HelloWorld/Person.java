package HelloWorld;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Person implements Serializable {
    private String name;

    private int age;

    private Puppy puppy;

    private ArrayList<Puppy> chaos;

    public Person(String name) {
        this.name = name;
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.puppy = null;
    }

    public static void main(String[] args) {
        Puppy spot = new Puppy("Spot");
        Person bob = new Person("bob", 42);

        System.out.println(bob);
    }

//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
