package Project1.Configuration;

import Project1.DataBase.*;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Properties;

@Configuration
@ComponentScan("Project1")
public class MyConfig {



    @Bean
    @Scope("prototype")
    public Person personBean(){
        return new Person();
    }


    @Bean
    @Scope("prototype")
    public ArrayList<Meal> mealArrayList(){
        return new ArrayList<>();
    }
//    @Bean
//    @Scope("prototype")
//    public Meal meatBean(){
//        return new Meat();
//    }
//
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
