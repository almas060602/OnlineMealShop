package Project1.Service;

import Project1.DAO.FruitDAOImpl;
import Project1.DataBase.Fruit;

public class FruitService {
    private FruitDAOImpl fruitDAOImpl = new FruitDAOImpl();

    public void saveFruit(Fruit fruit){
        fruitDAOImpl.save(fruit);
    }

    public Fruit getFruitById(int id){
        return fruitDAOImpl.findByID(id);
    }

    public void getAllFruits(){
        fruitDAOImpl.getAll();
    }
    public void deleteFruit(Fruit fruit){
        fruitDAOImpl.delete(fruit);
        System.out.println("Deleted");
    }
}
