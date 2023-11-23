package Project1.Test;

import Project1.Configuration.MyConfig;
import Project1.DataBase.Fruit;
import Project1.DataBase.Meal;
import Project1.DataBase.Person;
import Project1.Service.MealService;
import Project1.Service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        final PersonService personService = new PersonService();

        Person person = personService.getPersonById(1);
        System.out.println(person.getFirstName());

//        final MealService mealService = new MealService();
//
//        Person p1 = personService.getPersonById(1);
//
//        Meal m1 = new Fruit("Apple", 20, 250);
//        p1.addMeal(m1);
//        m1.setPerson(p1);
//        mealService.saveMeal(m1);

    }
}
