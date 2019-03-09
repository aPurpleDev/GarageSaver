package fr.OCGarage.java;

public class Climatisation implements Option {

    double prix;

    Climatisation(){
        prix = 347.3;
    }

    @Override
    public double getPrix() {

        return prix;

    }

    @Override
    public String toString(){

        String option = "Climatisation, Prix : " + this.getPrix() + " €.";;
        return option;
    }
}
