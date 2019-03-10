package fr.OCGarage.java;

public class SiegeChauffant implements Option{

    protected double prix;

    SiegeChauffant(){

        prix = 562.9;
    }

    @Override
    public double getPrix()
    {

        return prix;
    }

    @Override
    public String toString(){

        String option = "Siège Chauffant, Prix : " + this.getPrix() + " €.";;
        return option;
    }
}

