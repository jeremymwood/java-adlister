package DAO;

public class PersonDaoFactory {
    private static PersonListDAO personDAO;

//    this will allow us to talk to the same db when multiple servlets are at play

    public static PersonListDAO getPersonDAO() {
        if (personDAO == null) {
            personDAO = new PersonListDAO();
        }
        return personDAO;
    }
}
