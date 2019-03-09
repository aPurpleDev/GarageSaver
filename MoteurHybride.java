package fr.OCGarage.java;

public class MoteurHybride extends Moteur {

    MoteurHybride(){

        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = "cylindre par defaut";
        this.prix = 0;
    }

    MoteurHybride(String cylindre, double prix){
        this.type = TypeMoteur.HYBRIDE;
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
