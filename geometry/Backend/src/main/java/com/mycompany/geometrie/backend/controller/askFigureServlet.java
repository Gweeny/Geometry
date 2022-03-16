package com.mycompany.geometrie.backend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "askFigureServlet", urlPatterns = "/figure")
public class askFigureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String figureGeometrique = req.getParameter("FigureGeometrique");

        switch (figureGeometrique){
            case "carre":

        }
    }
}
