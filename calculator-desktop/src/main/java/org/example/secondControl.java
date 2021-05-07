package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class secondControl {

    @FXML
    Label szamolas;
    @FXML
    Label eredmeny;
    private String ans;

    public secondControl() {
    }

    @FXML
    private void tud() {
        App.loadFXML("/org.example/first.fxml");
    }

    @FXML
    private void atvalt() {
        App.loadFXML("/org.example/third.fxml");
    }

    @FXML
    public void numbers(javafx.event.ActionEvent event) {
        String number = ((Button)event.getSource()).getText();
        String old = szamolas.getText();
        String newString = old + number;
        szamolas.setText(newString);
    }

    @FXML
    public void del() {
        if(szamolas.getText().length() > 0) {
            StringBuilder string = new StringBuilder(szamolas.getText());
            string.deleteCharAt(szamolas.getText().length() - 1);
            szamolas.setText(string.toString());
        }
        eredmeny.setText("");
    }

    @FXML
    public void ac() {
        szamolas.setText("");
        ans = eredmeny.getText();
        eredmeny.setText("");
    }

    @FXML
    public void ans() {
        eredmeny.setText("");
        szamolas.setText(ans);
    }

    @FXML
    public void binToDec() {
        String inp = szamolas.getText();
        if (inp.contains("2") || inp.contains("3") || inp.contains("4") || inp.contains("5") || inp.contains("6")
                || inp.contains("7") || inp.contains("8") || inp.contains("9") || inp.contains("A") || inp.contains("B")
                || inp.contains("C") || inp.contains("D") || inp.contains("E") || inp.contains("F")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Ez nem bináris szám hapsikám/kisasszony!");
            alert.showAndWait();
        } else {
            String out = Exchange.binToDec(inp);
            eredmeny.setText(out);
            ans = out;
        }
    }

    @FXML
    public void decToBin() {
        String inp = szamolas.getText();
        if (inp.contains("A") || inp.contains("B") || inp.contains("C") || inp.contains("D") || inp.contains("E") || inp.contains("F")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Ez nem decimális szám hapsikám/kisasszony!");
            alert.showAndWait();
        } else {
            String out = Exchange.decToBin(inp);
            eredmeny.setText(out);
            ans = out;
        }
    }

    @FXML
    public void decToOkt() {
        String inp = szamolas.getText();
        if (inp.contains("A") || inp.contains("B") || inp.contains("C") || inp.contains("D") || inp.contains("E") || inp.contains("F")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Ez nem decimális szám hapsikám/kisasszony!");
            alert.showAndWait();
        } else {
            String out = Exchange.decToOkt(inp);
            eredmeny.setText(out);
            ans = out;
        }
    }

    @FXML
    public void decToHex() {
        String inp = szamolas.getText();
        if (inp.contains("A") || inp.contains("B") || inp.contains("C") || inp.contains("D") || inp.contains("E") || inp.contains("F")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Ez nem decimális szám hapsikám/kisasszony!");
            alert.showAndWait();
        } else {
            String out = Exchange.decToHex(inp);
            eredmeny.setText(out);
            ans = out;
        }
    }

    @FXML
    public void hexToDec() {
        String inp = szamolas.getText();
        String out = Exchange.hexToDec(inp);
        eredmeny.setText(out);
        ans = out;
    }

    @FXML
    public void oktToDec() {
        String inp = szamolas.getText();
        if (inp.contains("A") || inp.contains("B") || inp.contains("C") || inp.contains("D") || inp.contains("E") || inp.contains("F") || inp.contains("9") || inp.contains("8")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Ez nem oktális szám hapsikám/kisasszony!");
            alert.showAndWait();
        } else {
            String out = Exchange.oktToDec(inp);
            eredmeny.setText(out);
            ans = out;
        }
    }
}
