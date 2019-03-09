package fr.OCGarage.java;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

TypeMoteur type;

String cylindre;

double prix;

public abstract String toString();

public abstract double getPrix();
}
