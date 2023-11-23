package Project1.DataBase;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fruits")
@DiscriminatorValue("Fruit")
public class Fruit extends Meal {
    public Fruit() {
    }

    public Fruit(String name, double calories, int price) {
        super(name, calories, price);
    }
}