package Project1.DataBase;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Meat")
public class Meat extends Meal {
    // Дополнительные поля и методы для мяса

    public Meat() {
    }

    public Meat(String name, double calories, int price) {
        super(name, calories, price);
    }
}