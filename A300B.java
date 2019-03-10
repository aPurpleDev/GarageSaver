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

    @Override //de la méthode abstraite de la Classe Vehicule
    public String toString(){

        String converted = "Voiture : " + this.nomMarque + ", Nom : A300B, Prix :" + this.prix + " €, " + this.options + ". Pour un prix total de : " + (this.prix + this.getPrixOptions()) + " €.";

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

    @Override //de la méthode abstraite de l'interface Option, parcours l'ArrayList des options pour les chercher et additionner leur prix.
    public double getPrixOptions(){

        double prixoptions = 0;

        for(int i = 0; i < this.options.size(); i++) {

            prixoptions += options.get(i).getPrix();
        }

        return prixoptions;
    }
}
