package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/27/2020
 * Time: 9:46 PM
 * Project: IntelliJ IDEA
 */
public class Cat extends Animal implements IFood {

    //konstruktör
    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double printFood() {
        food = WeightConvert.convertToGram(getWeight()) / 150;
        return food;
    }

    @Override
    public String foodsType() {
        return "Dog's Food";
    }
}
