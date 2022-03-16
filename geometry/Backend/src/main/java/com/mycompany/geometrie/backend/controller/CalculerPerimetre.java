package com.mycompany.geometrie.backend.controller;

import com.mycompany.geometrie.backend.entity.Carre;
import com.mycompany.geometrie.backend.entity.Cercle;
import com.mycompany.geometrie.backend.entity.Rectangle;
import com.mycompany.geometrie.backend.entity.TriangleRectangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Calculer Perimetre", urlPatterns = "/perimetre")
public class CalculerPerimetre extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double cote = Double.parseDouble(req.getParameter("cote"));
        String figure = req.getParameter("figure");
        Double longueur = Double.parseDouble((req.getParameter("longueur")));
        Double largeur = Double.parseDouble((req.getParameter("largeur")));
        Double base = Double.parseDouble((req.getParameter("Base")));
        Double hauteur = Double.parseDouble((req.getParameter("hauteur")));
        Double hypotenuse = Double.parseDouble((req.getParameter("hypotenuse")));
        Double rayon = Double.parseDouble((req.getParameter("rayon")));
        Double pi = Double.parseDouble((req.getParameter("pi")));


        switch (figure){
            case "carre":
                Carre carre = new Carre(cote);
                Double perimetreCarre = carre.calculPerimetre();
                req.setAttribute("perimetre", perimetreCarre);
                break;
            case "rectangle":
                Rectangle rectangle = new Rectangle(longueur,largeur);
                Double perimetreRectangle = rectangle.calculPerimetre();
                req.setAttribute("perimetre",perimetreRectangle);
                break;
            case "triangle-rectangle":
                TriangleRectangle triangleRectangle = new TriangleRectangle(base,hauteur,hypotenuse);
                Double perimetreTriangleRectangle = triangleRectangle.calculPerimetre();
                req.setAttribute("perimetre",perimetreTriangleRectangle);
                break;
            case "cercle":
                Cercle cercle = new Cercle(rayon, pi);
                Double perimetreCercle = cercle.calculPerimetre();
                req.setAttribute("perimetre",perimetreCercle);
                break;


        }


        //Redirection
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req,resp);




    }
}
