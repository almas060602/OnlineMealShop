package Project1.DAO;

import Project1.DataBase.Person;

import java.util.List;

public interface PersonDAO {
    public void save(Person o);
    public List<Person> getAll();
    public Person findByID(int id);
    public void delete(Person o);
    public void deleteById(int id);
    public Person update(int id, String name, String lastName, String login, String password);
}
