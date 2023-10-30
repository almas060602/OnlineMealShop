package Project1.DAO;

import Project1.DataBase.Person;
import Project1.Service.HibernateSessions.HibernateSessionFactoryUtil;
import org.hibernate.Session;

import java.util.List;

public class PersonDAOImpl implements PersonDAO {
    @Override
    public void save(Person person) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            session.close();
    }

    @Override
    public List<Person> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Person> personList = session.createQuery("from Person").getResultList();
        session.getTransaction().commit();
        session.close();
        return personList;
    }

    @Override
    public Person findByID(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        session.getTransaction().commit();
        session.close();
        return person;
    }

    @Override
    public void delete(Person person) {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(person);
            session.getTransaction().commit();
            session.close();
    }


    @Override
    public Person update(int id, String name, String lastName, String login, String password) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        person.setFirstName(name);
        person.setLastName(lastName);
        person.setLogin(login);
        person.setPassword(password);
        session.save(person);
        session.getTransaction().commit();
        session.close();
        return person;
    }
}


