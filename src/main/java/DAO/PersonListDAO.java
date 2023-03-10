package DAO;

import HelloWorld.Person;

import java.util.ArrayList;
import java.util.List;

//works with
public class PersonListDAO {

    private final ArrayList<Person> people;

    public PersonListDAO() {
        people = new ArrayList<>();
        initData();
    }

    public List<Person> all() {
        return people;
    }

//    insert person into arraylist/in mem db
    public void insert(Person person) {
        people.add(person);
    };

    private void  initData() {
        Person person = new Person();
        person.setName("bob");
        person.setAge(23);
        people.add(person);

        Person person1 = new Person();
        person1.setName("sue");
        person1.setAge(56);
        people.add(person1);

        Person person2 = new Person();
        person2.setName("lou");
        person2.setAge(34);
        people.add(person2);
    }

}
