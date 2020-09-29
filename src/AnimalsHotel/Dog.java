package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/27/2020
 * Time: 9:39 PM
 * Project: IntelliJ IDEA
 */
public class Dog extends Animal implements IFood {

    //konstruktör
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double printFood() {
        food = WeightConvert.convertToGram(getWeight()) / 100;
        return food;
    }

    @Override
    public String foodsType() {
        return "Dog's Food";
    }
}