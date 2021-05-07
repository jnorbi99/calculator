package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.model.Tudomanyos;
import org.example.controller.TudomanyosController;
import java.net.URL;
import java.util.ResourceBundle;

public class firstControl implements Initializable {

    @FXML
    Label szamolas;
    @FXML
    Label eredmeny;
    private String ans;
    private String operator = null;
    private final Tudomanyos tud = new Tudomanyos();

    @FXML
    private void info() {
        App.loadFXML("/org.example/second.fxml");
    }

    @FXML
    private void atvalt() {
        App.loadFXML("/org.example/third.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public firstControl() {
    }

    @FXML
    public void numbers(javafx.event.ActionEvent event) {
        String number = ((Button)event.getSource()).getText();
        String old = szamolas.getText();
        String newString = old + number;
        szamolas.setText(newString);
    }

    @FXML
    public void operators(ActionEvent event) {
        try {
            if(operator == null) {
                String old = szamolas.getText();
                operator = ((Button) event.getSource()).getText();
                if (operator.equals("mod")) {
                    operator = "%";
                }
                szamolas.setText(old + operator);
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("HIBA");
                alert.setHeaderText("Művelet hiba");
                alert.setContentText("Egyszerre csak egy műveletet tudok megcsinálni!");
                alert.showAndWait();
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void equal() {
        String all = szamolas.getText();
        double number1, number2, result;

        if(all.contains("+")) {
            String[] allIn=  all.split("\\+");
            number1 = Double.parseDouble(allIn[0]);
            number2 = Double.parseDouble(allIn[1]);
            result = number1 + number2;
            eredmeny.setText(String.valueOf(result));
            ans = String.valueOf(result);
        } else if(all.contains("-")) {
            String[] allIn=  all.split("-");
            number1 = Double.parseDouble(allIn[0]);
            number2 = Double.parseDouble(allIn[1]);
            result = number1 - number2;
            eredmeny.setText(String.valueOf(result));
            ans = String.valueOf(result);
        } else if(all.contains("*")) {
            String[] allIn=  all.split("\\*");
            number1 = Double.parseDouble(allIn[0]);
            number2 = Double.parseDouble(allIn[1]);
            result = number1 * number2;
            eredmeny.setText(String.valueOf(result));
            ans = String.valueOf(result);
        } else if(all.contains("/")) {
            String[] allIn=  all.split("/");
            number1 = Double.parseDouble(allIn[0]);
            number2 = Double.parseDouble(allIn[1]);
            result = number1 / number2;
            eredmeny.setText(String.valueOf(result));
            ans = String.valueOf(result);
        } else if(all.contains("%")) {
            String[] allIn=  all.split("%");
            number1 = Double.parseDouble(allIn[0]);
            number2 = Double.parseDouble(allIn[1]);
            result = number1 % number2;
            eredmeny.setText(String.valueOf(result));
            ans = String.valueOf(result);
        }
    }

    @FXML
    public void ans() {
        String elozo = szamolas.getText();
        szamolas.setText(elozo + ans);
        operator = null;
        eredmeny.setText("");
    }

    @FXML
    public void del() {
        if(szamolas.getText().length() > 0) {
            StringBuilder string = new StringBuilder(szamolas.getText());
            String seged = szamolas.getText();
            if(seged.endsWith("+") || seged.endsWith("-") || seged.endsWith("/") || seged.endsWith("*") || seged.endsWith("%")) {
                operator = null;
            }
            string.deleteCharAt(szamolas.getText().length() - 1);
            szamolas.setText(string.toString());
        }
        eredmeny.setText("");
    }

    @FXML
    public void ac() {
        szamolas.setText("");
        operator = null;
        ans = eredmeny.getText();
        eredmeny.setText("");
    }

    @FXML
    public void sin() {
        double degrees = Double.parseDouble(szamolas.getText());
        double radians = Math.toRadians(degrees);
        eredmeny.setText(String.valueOf(Math.sin(radians)));
        ans = String.valueOf(Math.sin(radians));
    }

    @FXML
    public void cos() {
        double degrees = Double.parseDouble(szamolas.getText());
        double radians = Math.toRadians(degrees);
        eredmeny.setText(String.valueOf(Math.cos(radians)));
        ans = String.valueOf(Math.cos(radians));
    }

    @FXML
    public void tan() {
        double degrees = Double.parseDouble(szamolas.getText());
        double radians = Math.toRadians(degrees);
        eredmeny.setText(String.valueOf(Math.tan(radians)));
        ans = String.valueOf(Math.tan(radians));
    }

    @FXML
    public void sqrt() {
        double szam = Double.parseDouble(szamolas.getText());
        if (szam > 0) {
            eredmeny.setText(String.valueOf(Math.sqrt(szam)));
            ans = String.valueOf(Math.sqrt(szam));
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Nagyobb számot kérek 0-nél!");
            alert.showAndWait();
        }

    }

    @FXML
    public void sqr() {
        double szam = Double.parseDouble(szamolas.getText());
        eredmeny.setText(String.valueOf(szam*szam));
        ans = String.valueOf(szam*szam);
    }

    @FXML
    public void rec() {
        double szam = Double.parseDouble(szamolas.getText());
        if(szam != 0) {
            eredmeny.setText(String.valueOf(1/szam));
            ans = String.valueOf(1/szam);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("A számlálód nem lehet 0!");
            alert.showAndWait();
        }
    }

    @FXML
    public void saveMuv() {
        tud.setTudomanyosMuvelet(szamolas.getText());
        TudomanyosController.getInstance().save(tud);
        System.out.println("A muveletet sikeresen elmentettem!");
    }

    @FXML
    public void elozoMuvelet() {
        szamolas.setText("");
        String s = TudomanyosController.getInstance().getElozo();
        if(s.equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Memoria hiba");
            alert.setContentText("A memoria ures, eloszor hasznald a muvelet elmentesere az M+ gombot!");
            alert.showAndWait();
        } else {
            szamolas.setText(s);
            System.out.println("A memoria utolso elemet sikeresen lekertem!");
        }
    }

    @FXML
    public void urites() {
        TudomanyosController.getInstance().deleteMemo();
        System.out.println("A memoriat sikeresen uritettem!");
    }
}
