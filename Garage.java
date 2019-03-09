package fr.OCGarage.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static fr.OCGarage.java.Vehicule.nom;

public class Garage implements Serializable {

    List<Vehicule> voitures;

    Garage(){

        voitures = new ArrayList<>();
    }

    public String toString(){

            String garageList = "";

            garageList += "***************************\n";
            garageList += "*  Garage OpenClassrooms  *\n";
            garageList += "***************************\n";

            for(int i = 0; i < voitures.size(); i++){

                garageList += (voitures.get(i).toString() + "\n" );

            }

    return garageList;
    }

    public void addVoiture(Vehicule voit){

        voitures.add(voit);

    }
}
