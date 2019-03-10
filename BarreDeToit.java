package fr.OCGarage.java;

public class BarreDeToit implements Option {

    protected double prix;

    BarreDeToit(){
        prix = 29.9;
    }

    @Override
    public double getPrix()
    {
        return prix;
    }

    @Override
    public String toString(){

        String option = "Barre de toît, Prix : " + this.getPrix();
        return option;
    }
}
