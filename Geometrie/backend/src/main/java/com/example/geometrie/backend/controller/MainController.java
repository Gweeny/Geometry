package com.example.geometrie.backend.controller;

import com.example.geometrie.backend.entity.Carre;
import com.example.geometrie.backend.entity.Cercle;
import com.example.geometrie.backend.entity.Rectangle;
import com.example.geometrie.backend.entity.TriangleRectangle;

public class MainController {
    double calculAire;
    double calculperimetre;

    Carre carre = new Carre();
    double aireCarre = carre.getCote()* carre.getCote();


    double perimetreCarre = carre.getCote()*4;


    Cercle cercle = new Cercle();
    double aireCercle = cercle.getPi()*(cercle.getRayon()*cercle.getRayon());

    double perimetreCercle = 2 *cercle.getPi()*cercle.getRayon();



    Rectangle rectangle = new Rectangle();
    double aireRectangle = rectangle.getLongueur()+rectangle.getLargeur();

    double perimetreRectangle = (rectangle.getLongueur() + rectangle.getLargeur())*2;



    TriangleRectangle triangleRectangle = new TriangleRectangle();
    double aireTriangleRectangle = (triangleRectangle.getLongueur()*triangleRectangle.getLongueur())/2;

    double hypotenuse = java.lang.Math.sqrt(((triangleRectangle.getLargeur()*triangleRectangle.getLargeur())+(triangleRectangle.getLongueur()*triangleRectangle.getLongueur())));

    double perimetreTriangleRectangle = triangleRectangle.getLargeur()+triangleRectangle.getLongueur()+hypotenuse;

}
