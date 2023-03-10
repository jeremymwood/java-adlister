package DAO;

import HelloWorld.Person;

import java.util.List;

public class DAOTest {

    public static void main(String[] args) {


        PersonListDAO personDao = new PersonListDAO();
        List<Person> people = personDao.all();
        System.out.println(people);
        personDao.insert(new Person("sally", 40));
        System.out.println(people);
//        or sout this way
//        will come into play when we swap in mem for db
        System.out.println(personDao.all());
    }
}
