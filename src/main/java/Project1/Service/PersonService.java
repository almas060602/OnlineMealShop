package Project1.Service;

import Project1.DAO.PersonDAOImpl;
import Project1.DataBase.Person;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
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
    public void deletePersonByID(int id){
        personDAOImpl.deleteById(id);
        System.out.println("Deleted");
    }


    public void updatePerson(Person person) {
        personDAOImpl.update(person.getId(), person.getFirstName(), person.getLastName(), person.getLogin(), person.getPassword());
    }
}
