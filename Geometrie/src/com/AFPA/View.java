package com.AFPA;
import java.util.Scanner;

public class View {

    static double longueurs;
    static double largeurs;
    static double cote;

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @return
     */

    public double longueur() {
        System.out.println("quelle est la longueur ? ");
        this.longueurs = sc.nextDouble();
        return longueurs;
    }

    public double largeur() {
        System.out.println("Quel est la largeur ? ");
        this.largeurs = sc.nextDouble();
        return largeurs;
    }

    public double cote() {
        System.out.println("quel est le coté ?");
        this.cote = sc.nextDouble();
        return cote;
    }


    public void affichResult(double result) {
        System.out.println("Le résultat de l'opération est " + result);
    }
    
    
    //Getter/Setter


    public double getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(double longueurs) {
        this.longueurs = longueurs;
    }

    public double getLargeurs() {
        return largeurs;
    }

    public void setLargeurs(double largeurs) {
        this.largeurs = largeurs;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }
}
