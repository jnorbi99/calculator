package org.example.controller;

import org.example.dao.EurToHufDAO;
import org.example.dao.EurToHufDAOImpl;


public class EurToHufController {

    private final EurToHufDAO dao = new EurToHufDAOImpl();
    private static EurToHufController cont = null;

    public static EurToHufController getInstance() {
        if(cont == null){
            cont = new EurToHufController();
        }
        return cont;
    }

    public String change() {return dao.change();}
}
