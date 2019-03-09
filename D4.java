package fr.OCGarage.java;

import java.util.ArrayList;
import java.util.List;

public class D4 extends Vehicule{

    D4(){
        this.options= new ArrayList<Option>();
        this.prix = 25147;
        this.moteur= new MoteurDiesel();
        this.nomMarque=Marque.PIGEOT;
        this.nom = "D4";
    }

    @Override
    public String toString(){

        String converted = "Nom : D4" + ", Marque :" + this.nomMarque + ", Prix :" + this.prix + " €, " + this.options+ ". Pour un prix total de : " + (this.prix + this.getPrixOptions())  + " €.";

        return converted;
    }

    public void setMoteur(Moteur moteur){

        this.moteur = moteur;
    }

    public void addOption(Option opt){

        this.options.add(opt);
    }

    public Marque getMarque(){

        return this.nomMarque;
    }

    public List<Option> getOptions(){

        return options;
    }

    public double getPrix(){

        return prix;
    }

    @Override
    public double getPrixOptions(){

        double prixoptions = 0;

        for(int i = 0; i < this.options.size(); i++) {

            prixoptions += options.get(i).getPrix();
        }

        return prixoptions;
    }
}
