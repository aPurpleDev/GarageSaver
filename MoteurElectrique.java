package fr.OCGarage.java;

public class MoteurElectrique extends Moteur {

    MoteurElectrique(){

        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = "cylindre par defaut";
        this.prix = 0;
    }

    MoteurElectrique(String cylindre, double prix){
        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public String toString(){

        String converted = ("Type du Moteur : " + this.type + ", Cylindre : " + this.cylindre + ", Prix du Moteur : " + this.prix + ".");
        return cylindre;
    }

    public double getPrix(){

        return prix;
    }
}
