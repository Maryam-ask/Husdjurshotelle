package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/29/2020
 * Time: 10:31 PM
 * Project: IntelliJ IDEA
 */
public class WeightConvert {
    // Konstruktör
    private WeightConvert(){
    }

    /**
     * En metod som konverterar Kilo gram till gram
     * @param kilo
     * @return geram (kilo till gram)
     */
    public static double convertToGram(double kilo) {
        return kilo * 1000;
    }
}
