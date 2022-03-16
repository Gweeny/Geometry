package com.mycompany.geometrie.backend.entity;

public class Trapeze extends Quadrillatere implements FigureGeometriqueInterface{
    private double coteA;
    private double coteB;
    private double coteC;
    private double coteD;

    public Trapeze(double cote) {
        super(cote);
    }


    @Override
    public double calculAire() {
        return 0;
    }

    @Override
    public double calculPerimetre() {
        return 0;
    }
}
