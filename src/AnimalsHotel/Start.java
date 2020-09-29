package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/29/2020
 * Time: 10:37 PM
 * Project: IntelliJ IDEA
 */
import javax.swing.JOptionPane;
public class Start {

    public static void run() {
        // att visa dialogruta och få data från användare
        String input = JOptionPane.showInputDialog("What is your pet name ? ");

        // Deklarera en objekt av typen recognize.
        Recognize r = new Recognize(input);

        String name = "Your pet's name is " + r.animalType().getName();
        String weight = "The Weight of your pet is " + r.animalType().getWeight() + " kg";
        String foodWeight = "Your pet should eat " + r.animalType().printFood() + " g";
        String foodType = "Your pet should eat " + r.animalType().foodsType();

        JOptionPane.showMessageDialog(null,
                name + "\n" + weight + "\n" + foodWeight + "\n" + foodType
                ,"Information Of Pet",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        run();
    }
}
