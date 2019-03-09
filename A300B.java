package fr.OCGarage.java;

import java.util.ArrayList;
import java.util.List;

public class A300B extends Vehicule {

    A300B(){
        this.options= new ArrayList<Option>();
        this.prix=28457;
        this.moteur=new MoteurElectrique();
        this.nomMarque = Marque.PIGEOT;
        this.nom = "A300B";
        }

    public void setMoteur(Moteur moteur){

        this.moteur = moteur;
    }

    @Override
    public String toString(){

        String converted = "Nom : A300B" + ", Marque :" + this.nomMarque + ", Prix :" + this.prix + " €, " + this.options + ". Pour un prix total de : " + (this.prix + this.getPrixOptions()) + " €.";

        return converted;
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
