package com.mycompany.geometrie.backend.entity;

import com.mycompany.geometrie.backend.entity.FigureGeometriqueInterface;

public class Rectangle extends Quadrillatere implements FigureGeometriqueInterface {
    public Rectangle(double longueur, double largeur) { super();
    }

    @Override
    public double calculAire() {
        return this.getLongueur()*this.getLargeur();
    }

    @Override
    public double calculPerimetre() {
        return (this.getLongueur()+this.getLargeur())*2;
    }
}
