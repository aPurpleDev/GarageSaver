package fr.OCGarage.java;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

protected TypeMoteur type;

protected String cylindre;

protected double prix;

public abstract String toString();

public abstract double getPrix();
}
