package Project1.DAO;

import Project1.DataBase.Meal;

import java.util.List;

public interface MealDAO {
    public void save(Meal meal);
    public List<Meal> getAll();
    public Meal findByID(int id);
    public void delete(Meal meal);
    }
