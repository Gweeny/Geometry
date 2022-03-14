package com.example.geometrie.backend.entity;

public class TriangleRectangle implements FigureGeometriqueInterface{
    private double longueur;
    private double largeur;


    public TriangleRectangle() {
    }

    public TriangleRectangle(double longueur, double largeur, double hypothenuse) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }


}
