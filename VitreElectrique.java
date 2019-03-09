package fr.OCGarage.java;

public class VitreElectrique implements Option{

    public double prix;

    VitreElectrique(){

        prix = 212.35;

    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString(){

        String option = "Vitre Electrique, Prix : " + this.getPrix() + " €.";
        return option;
    }
}
