package com.example.geometrie.backend.controller;


import static com.example.geometrie.backend.entity.FigureGeometriqueInterface.*;

public class test {
    private  String aire;
    private String perimetre;

    private double result;
    private String errorMessage;



    public test(String aire, String perimetre){
        this.aire = aire;
        this.perimetre = perimetre;


        switch (aire){
            case ("Carre"):
                this.result = aireCarre;
                break;
            case("Rectangle"):
                this.result = aireRectangle;
                break;
            case ("Triangle Rectangle"):
                this.result = aireTriangleRectangle;
                break;
            case ("Cercle"):
                this.result = aireCercle;
                break;
            default:
                errorMessage = "Cette figure n'a pas d'aire";

        }

        switch (perimetre){
            case ("Carre"):
                this.result = perimetreCarre;
                break;
            case ("Rectangle"):
                this.result = perimetreRectangle;
                break;
            case ("Triangle Rectangle"):
                this.result = perimetreTriangleRectangle;
                break;
            case ("Cercle"):
                this.result = perimetreCercle;
                break;
            default:
                errorMessage = " Cette figure n'a pas de périmètre";
        }

    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    public String getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(String perimetre) {
        this.perimetre = perimetre;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
