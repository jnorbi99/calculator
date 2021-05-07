package org.example.controller;

import org.example.dao.TudomanyosDAOImpl;
import org.example.dao.TudomaynosDAO;
import org.example.model.Tudomanyos;

public class TudomanyosController {

    private final TudomaynosDAO dao = new TudomanyosDAOImpl();
    private static TudomanyosController cont = null;

    public static TudomanyosController getInstance(){
        if(cont == null){
            cont = new TudomanyosController();
        }
        return cont;
    }

    public void save(Tudomanyos t) {dao.save(t);}
    public String getElozo() {return dao.getElozo();}
    public void deleteMemo() {dao.deleteMemo();}
}
