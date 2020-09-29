package AnimalsHotel;

/**
 * Created by Maryam Askari
 * Date: 9/29/2020
 * Time: 10:27 PM
 * Project: IntelliJ IDEA
 */
public enum Team {
    // Används för slutna mängder, variabler som antar vissa bestämda värden
    SIXTEN(5),
    DOGGE(10),
    VENUS(5),
    OVE(3),
    HYPNO(1);

    // instansvariabel
    int kg;

    // Konstruktör
    Team(int kg){
        this.kg = kg;
    }
}

