package Project1.DAO;

import Project1.DataBase.Fruit;
import Project1.Service.HibernateSessionFactoryUtil;
import org.hibernate.Session;

import java.util.List;

public class FruitDAOImpl implements FruitDAO{
    @Override
    public void save(Fruit fruit) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(fruit);
            session.getTransaction().commit();
            session.close();
    }

    @Override
    public List<Fruit> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Fruit> fruitList = session.createQuery("from Fruit", Fruit.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return fruitList;
    }

    @Override
    public Fruit findByID(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Fruit fruit = session.get(Fruit.class, id);
        session.getTransaction().commit();
        session.close();
        return fruit;
    }

    @Override
    public void delete(Fruit fruit) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(fruit);
            session.getTransaction().commit();
            session.close();
    }
}
