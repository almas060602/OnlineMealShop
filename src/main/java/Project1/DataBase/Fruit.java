package Project1.DataBase;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fruits")
@DiscriminatorValue("Fruit")
public class Fruit extends Meal {
    private String name;
    private double calories;
    private int price;

    public Fruit() {
    }

    public Fruit(String name, double calories, int price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}