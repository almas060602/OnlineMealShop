package Project1.Service;

import Project1.DAO.PersonDAOImpl;
import Project1.DataBase.Person;

import java.util.List;

public class PersonService {
    private PersonDAOImpl personDAOImpl = new PersonDAOImpl();

    public void savePerson(Person person){
        personDAOImpl.save(person);
    }

    public Person getPersonById(int id){
        return personDAOImpl.findByID(id);
    }

    public List<Person> getAllPersons(){
        return personDAOImpl.getAll();
    }
    public void deletePerson(Person person){
        personDAOImpl.delete(person);
        System.out.println("Deleted");
    }

    public void updatePerson(int id, String name, String lastName, String login, String password){
        personDAOImpl.update(id, name, lastName, login, password);
    }
}
