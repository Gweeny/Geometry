package com.AFPA;
import com.AFPA.View;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double cote;
        double longueur = 0;
        double largeur = 0;
        double surface = 0;
        double perimetre = 0;

        double a;
        double b;
        double carre;
        double rectangle;
        double triangleRectangle = 0;

        double typeOperation;

        Scanner sc =new Scanner(System.in);
        View vue = new View();

        do {
            typeOperation = View.longueurs;
        }


        //Surface
        double surfaceCarre = surface;
        a = 7;
        surfaceCarre = (a*a);

        System.out.println("la surface du carré est : " + surfaceCarre);

        double surfaceRectangle = surface;
        longueur = 25;
        largeur = 22;
        surfaceRectangle = (longueur* largeur);


        System.out.println("la surface du rectangle est : " + surfaceRectangle);

        double surfaceTriangleRectangle = triangleRectangle;
        a = 11;
        b = 55;

        surfaceTriangleRectangle = ((a*b)/2);

        System.out.println("la surface du triangle rectange est : " + surfaceTriangleRectangle);

        //perimetre

        double perimetreCarre = perimetre;
        perimetreCarre = (a*4);

        System.out.println("Le perimetre du carré est :" + perimetreCarre);

        double perimetreRectangle = perimetre;
        perimetreRectangle = ((longueur+largeur)*2);

        System.out.println("Le perimetre du rectangle est : " + perimetreRectangle);

        double perimetreTriangleRectangle = perimetre;
        double aCarre;
        double bCarre;
        a = 5;
        b = 2;
        aCarre = a*a;
        bCarre = b*b;
        double sommeDesCarres;
        sommeDesCarres = aCarre + bCarre;
        perimetreTriangleRectangle = (Math.sqrt(sommeDesCarres));

        System.out.println(perimetreTriangleRectangle);


    }
}