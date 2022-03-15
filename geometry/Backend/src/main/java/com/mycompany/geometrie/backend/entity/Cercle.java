package com.mycompany.geometrie.backend.entity;

public class Cercle implements FigureGeometriqueInterface{
    private final double pi = Math.PI;
    private double rayon;

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getPi() {
        return pi;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
