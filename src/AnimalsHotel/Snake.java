package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/27/2020
 * Time: 9:54 PM
 * Project: IntelliJ IDEA
 */
public class Snake extends Animal implements IFood {

    //konstruktör
    public Snake(String name, double weight) {
        super(name, weight);
    }

    public double printFood() {
        food = 20;
        return food;
    }

    public String foodsType() {
        return "Snake's Food";
    }
}

