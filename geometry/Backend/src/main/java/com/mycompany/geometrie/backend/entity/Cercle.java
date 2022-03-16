package com.mycompany.geometrie.backend.entity;

public class Cercle implements FigureGeometriqueInterface{
    private final double pi = Math.PI;
    private double rayon;

    public Cercle(Double rayon, Double pi) {
        super();
    }

    @Override
    public double calculAire() {
        return pi*(rayon*rayon);
    }

    @Override
    public double calculPerimetre() {
        return 2*pi*rayon;
    }
}
