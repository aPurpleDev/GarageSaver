package fr.OCGarage.java;

public class MoteurEssence extends Moteur {

    MoteurEssence(){

        this.type = TypeMoteur.ELECTRIQUE;
        this.cylindre = "cylindre par defaut";
        this.prix = 0;
    }

    MoteurEssence(String cylindre, double prix){
        this.type = TypeMoteur.ESSENCE;
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
