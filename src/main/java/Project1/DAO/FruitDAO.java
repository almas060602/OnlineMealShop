package Project1.DAO;

import Project1.DataBase.Fruit;
import Project1.DataBase.Person;

import java.util.List;

public interface FruitDAO {
    public void save(Fruit fruit);
    public List<Fruit> getAll();
    public Fruit findByID(int id);
    public void delete(Fruit fruit);
    }
