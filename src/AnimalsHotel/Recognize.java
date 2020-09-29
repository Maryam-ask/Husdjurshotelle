package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/29/2020
 * Time: 10:34 PM
 * Project: IntelliJ IDEA
 */
public class Recognize {
    private String name;

    // Konstruktör
    public Recognize(String name){
        this.name = name;
    }

    /**
     * En metod som returnerar klassen med hjälp av det angivna namnet
     * @return subklasser av Animal
     */
    public Animal animalType() { // Polymorphism
        if (name.toUpperCase().equals(Team.DOGGE.toString())) {
            return new Dog(name, Team.DOGGE.kg);
        } else if (name.toUpperCase().equals(Team.SIXTEN.toString())) {
            return new Dog(name, Team.SIXTEN.kg);
        } else if (name.toUpperCase().equals(Team.VENUS.toString())) {
            return new Cat(name, Team.SIXTEN.kg);
        } else if (name.toUpperCase().equals(Team.OVE.toString())) {
            return new Cat(name, Team.OVE.kg);
        } else if (name.toUpperCase().equals(Team.HYPNO.toString())){
            return new Snake(name,Team.HYPNO.kg);
        }
        return null;
    }
}
