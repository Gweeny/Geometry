package com.mycompany.geometrie.backend.entity;

public class Carre extends Quadrillatere implements FigureGeometriqueInterface{


    public Carre(double cote) {
        super (cote);
    }

    @Override
    public double calculAire() {
        return this.getCote()*this.getCote();
    }

    @Override
    public double calculPerimetre() {
        return this.getCote()*4;
    }




}
