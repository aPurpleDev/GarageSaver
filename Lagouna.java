package fr.OCGarage.java;

import java.util.ArrayList;
import java.util.List;

public class Lagouna extends Vehicule {

Lagouna(){ //default constructor for testing purposes

this.prix = 23123;
this.nom = "Lagouna";
this.options= new ArrayList<Option>();
this.nomMarque = Marque.RENO;

    }

Lagouna(double prix, String nom, List<Option> options, Marque nomMarque){ //Params constructors taking input

    this.prix = prix;
    this.nom = nom;
    this.options = options;
    this.nomMarque = nomMarque;
}

    @Override
    public String toString(){

        String converted = "Voiture : " + this.nomMarque + ", Nom : LAGOUNA, Prix :" + this.prix + " €, " + this.options + ". Pour un prix total de : " + (this.prix + this.getPrixOptions())  + " €.";

        return converted;
    }

    public void addOption(Option opt){

        this.options.add(opt);
    }

    public void setMoteur(Moteur moteur){

        this.moteur = moteur;
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

