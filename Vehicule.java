package fr.OCGarage.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule implements Option, Serializable {

protected double prix;

public static String nom;

protected List<Option> options;

protected Marque nomMarque;

public Moteur moteur;

public abstract String toString();

public abstract void addOption(Option opt);

public abstract Marque getMarque();

public abstract List<Option> getOptions();

public abstract double getPrix();

public abstract double getPrixOptions();

public abstract void setMoteur(Moteur moteur);

}
