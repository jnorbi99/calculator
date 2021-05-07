package org.example.dao;

import org.example.model.Tudomanyos;

public interface TudomaynosDAO {

    void save(Tudomanyos t);
    String getElozo();
    void deleteMemo();
}
