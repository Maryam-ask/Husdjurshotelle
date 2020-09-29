package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/27/2020
 * Time: 9:36 PM
 * Project: IntelliJ IDEA
 */
public abstract class Animal {

    // instansvariabel
    private String name;
    private double weight;

    protected double food;

    // konstruktör
    protected Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getter
    protected String getName() {
        return name;
    }

    protected double getWeight() {
        return weight;
    }

    // abstrakta metoder för överrida
    public abstract String foodsType();
    public abstract double printFood();
}
