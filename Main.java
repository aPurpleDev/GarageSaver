package fr.OCGarage.java;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

        File carSaver = new File("carSave.txt"); //declaration du Fichier
        ObjectInputStream carReaderA = null; //declaration du Stream de lecture

        if(!carSaver.isFile()){ //condition en cas de ficher non-existant, pour le premier lancement
            System.out.println("AUCUNE VOITURE ENREGISTREE");
            System.out.println(garage);
        }else{
            try{
                carReaderA = new ObjectInputStream(new FileInputStream(carSaver)); //Si une sauvegarde est présente, lecture
                System.out.println(carReaderA.readObject());
                carReaderA.close(); //fermeture du flux
            }catch(IOException | ClassNotFoundException e){
                e.printStackTrace();
            }

            }

        Vehicule lag1 = new Lagouna(); //Main de l'exercice
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());
        garage.addVoiture(lag1);

        Vehicule A300B_2 = new A300B();
        A300B_2.setMoteur(new MoteurElectrique("1200 W", 1234d));
        A300B_2.addOption(new Climatisation());
        A300B_2.addOption(new BarreDeToit());
        A300B_2.addOption(new SiegeChauffant());
        garage.addVoiture(A300B_2);

        Vehicule d4_1 = new D4();
        d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
        d4_1.addOption(new BarreDeToit());
        d4_1.addOption(new Climatisation());
        d4_1.addOption(new GPS());
        garage.addVoiture(d4_1);

        Vehicule lag2 = new Lagouna();
        lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
        garage.addVoiture(lag2);

        Vehicule A300B_1 = new A300B();
        A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
        A300B_1.addOption(new VitreElectrique());
        A300B_1.addOption(new BarreDeToit());
        garage.addVoiture(A300B_1);

        Vehicule d4_2 = new D4();
        d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
        d4_2.addOption(new SiegeChauffant());
        d4_2.addOption(new BarreDeToit());
        d4_2.addOption(new Climatisation());
        d4_2.addOption(new GPS());
        d4_2.addOption(new VitreElectrique());
        garage.addVoiture(d4_2);

        ObjectOutputStream carSaveB = null; //declaration du flux de sauvegarde

        try{
            carSaveB = new ObjectOutputStream(new FileOutputStream(carSaver)); //initialisation et sauvegarde
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            carSaveB.writeObject(garage);
            carSaveB.close(); //fermeture du flux de sauvegarde
        }catch(IOException e){
            e.printStackTrace();
        }


        }
}

