package org.example.controller;

import org.example.dao.HufToEurDAO;
import org.example.dao.HufToEurDAOImpl;

public class HufToEurController {

    private final HufToEurDAO dao = new HufToEurDAOImpl();
    private static HufToEurController cont = null;

    public static HufToEurController getInstance() {
        if(cont == null){
            cont = new HufToEurController();
        }
        return cont;
    }

    public String change() {return dao.change();}
}
