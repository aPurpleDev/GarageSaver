package fr.OCGarage.java;

public class GPS implements Option {

    protected double prix;

    GPS(){
        prix = 113.5;
    }

    @Override
    public double getPrix() {

        return prix;
    }

    @Override
    public String toString(){

        String option = "Vitre Electrique, Prix : " + this.getPrix() + " €.";;
        return option;
    }
}

