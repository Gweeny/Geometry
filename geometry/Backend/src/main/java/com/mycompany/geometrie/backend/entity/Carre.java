package com.mycompany.geometrie.backend.entity;

public class Carre implements FigureGeometriqueInterface{
    private double cote;

    public Carre() {
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }
}
