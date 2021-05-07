package org.example.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tudomanyos {

    private final StringProperty muvelet = new SimpleStringProperty();

    public Tudomanyos() {
    }

    public String getTudomanyosMuvelet() {
        return muvelet.get();
    }

    public void setTudomanyosMuvelet(String muveletParam) {
        this.muvelet.set(muveletParam);
    }

}
