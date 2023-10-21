package Project1.DataBase;


//@Component("fruitBean")
//@Scope("prototype")

import javax.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Присваевает id в джаве автоматический
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private double calories;

    @Column(name = "price")
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public Fruit() {
    }

    public Fruit(String name, double calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
