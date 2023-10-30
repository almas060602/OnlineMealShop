package Project1.Service.HibernateSessions;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory1;

    public HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory1 == null) {
            try {
                sessionFactory1 = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Project1.DataBase.Person.class)
                        .addAnnotatedClass(Project1.DataBase.Meal.class)
                        .buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory1;
    }
}
