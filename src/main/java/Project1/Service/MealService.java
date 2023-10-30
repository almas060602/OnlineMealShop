package Project1.Service;

import Project1.DAO.MealDAOImpl;
import Project1.DataBase.Meal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MealService {

    private MealDAOImpl mealDAOimpl = new MealDAOImpl();

    public void saveMeal(Meal meal){
        mealDAOimpl.save(meal);
    }

    public Meal getMealById(int id){
        return mealDAOimpl.findByID(id);
    }

    public List<Meal> getAllMeals(){
        return mealDAOimpl.getAll();
    }
    public void deleteMeal(Meal meal){
        mealDAOimpl.delete(meal);
        System.out.println("Deleted");
    }
}
