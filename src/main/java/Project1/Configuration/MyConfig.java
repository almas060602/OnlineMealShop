package Project1.Configuration;

import Project1.DataBase.Fruit;
import Project1.DataBase.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.ArrayList;


@Configuration
@ComponentScan("Project1")
public class MyConfig {

//    @Bean
//    @Scope("prototype")
//    public Meal meatBean(){
//        return new Meat();
//    }

//    @Bean
//    @Scope("prototype")
//    public Meal fruitBean(){
//        return new Fruit();
//    }
//
//    @Bean
//    @Scope("prototype")
//    public Meal vegetableBean(){
//        return new Vegetable();
//    }

    @Bean
    @Scope("prototype")
    public ArrayList<Fruit> fruitArrayList(){
        return new ArrayList<>();
    }

//    @Autowired
//    private Environment environment;
//
//    @Bean
//    @Scope("singleton")
//    public Person personBean1(){
//        Person person = new Person(fruitArrayList());
//        person.setLogin(environment.getProperty("personLogin1"));
//        person.setPassword(environment.getProperty("personPassword1"));
//        person.setFirstName(environment.getProperty("personName1"));
//        person.setLastName(environment.getProperty("personLastName1"));
//        return person;
//    }
//    @Bean
//    @Scope("singleton")
//    public Person personBean2(){
//        Person person = new Person(fruitArrayList());
//        person.setLogin(environment.getProperty("personLogin2"));
//        person.setPassword(environment.getProperty("personPassword2"));
//        person.setFirstName(environment.getProperty("personName2"));
//        person.setLastName(environment.getProperty("personLastName2"));
//        return person;
//    }
//    @Bean
//    @Scope("singleton")
//    public Person personBean3(){
//        Person person = new Person(fruitArrayList());
//        person.setLogin(environment.getProperty("personLogin3"));
//        person.setPassword(environment.getProperty("personPassword3"));
//        person.setFirstName(environment.getProperty("personName3"));
//        person.setLastName(environment.getProperty("personLastName3"));
//        return person;
//    }
}
