package Project1.DAO;

import Project1.DataBase.Meal;
import Project1.Service.HibernateSessions.HibernateSessionFactoryUtil;
import org.hibernate.Session;

import java.util.List;

public class MealDAOImpl implements MealDAO {
    @Override
    public void save(Meal meal) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(meal);
            session.getTransaction().commit();
            session.close();
    }

    @Override
    public List<Meal> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Meal> mealList = session.createQuery("from Meal", Meal.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return mealList;
    }

    @Override
    public Meal findByID(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Meal meal = session.get(Meal.class, id);
        session.getTransaction().commit();
        session.close();
        return meal;
    }

    @Override
    public void delete(Meal meal) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(meal);
            session.getTransaction().commit();
            session.close();
    }
}
