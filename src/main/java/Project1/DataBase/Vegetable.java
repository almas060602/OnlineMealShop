package Project1.DataBase;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Vegetable")
public class Vegetable extends Meal {
    public Vegetable() {
    }

    public Vegetable(String name, double calories, int price) {
        super(name, calories, price);
    }
    // Дополнительные поля и методы для овощей
}