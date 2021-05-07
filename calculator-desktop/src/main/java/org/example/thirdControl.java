package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.controller.EurToHufController;
import org.example.controller.HufToEurController;

public class thirdControl {

    @FXML
    Label szamolas;
    @FXML
    Label eredmeny;
    private String ans;
    private String operator = null;


    public thirdControl() {
    }

    @FXML
    private void tud() {
        App.loadFXML("/org.example/first.fxml");
    }

    @FXML
    private void info() {
        App.loadFXML("/org.example/second.fxml");
    }

    @FXML
    public void numbers(javafx.event.ActionEvent event) {
        String number = ((Button)event.getSource()).getText();
        String old = szamolas.getText();
        String newString = old + number;
        szamolas.setText(newString);
    }

    @FXML
    public void ac() {
        szamolas.setText("");
        operator = null;
        eredmeny.setText("");
    }
    @FXML
    public void ans() {
        szamolas.setText(ans);
        operator = null;
        eredmeny.setText("");
    }

    @FXML
    public void del() {
        if(szamolas.getText().length() > 0) {
            String[] seged = szamolas.getText().split(" ");
            String seged1 = seged[0];
            StringBuilder string = new StringBuilder(seged1);
            string.deleteCharAt(seged1.length() - 1);
            szamolas.setText(string.toString());
            operator = null;
        }
        eredmeny.setText("");
    }

    public boolean check() {
        if(szamolas.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("HIBA");
            alert.setHeaderText("Művelet hiba");
            alert.setContentText("Adj meg egy értéket először!");
            alert.showAndWait();
            return false;
        }
        return true;
    }

    //T
    @FXML
    public void tToKg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " t");
                    Double num = Double.parseDouble(old) * 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " kg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void tToDkg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " t");
                    Double num = Double.parseDouble(old) * 100000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " dkg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void tToG(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " t");
                    Double num = Double.parseDouble(old) * 1000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " g");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void tToMg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " t");
                    Double num = Double.parseDouble(old) * 1000000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " mg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //Kg
    @FXML
    public void kgToT(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " kg");
                    Double num = Double.parseDouble(old) / 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " t");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void kgToDkg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " kg");
                    Double num = Double.parseDouble(old) * 100;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " dkg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void kgToG(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " kg");
                    Double num = Double.parseDouble(old) * 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " g");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void kgToMg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " kg");
                    Double num = Double.parseDouble(old) * 1000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " mg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //Dkg
    @FXML
    public void dkgToT(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " dkg");
                    Double num = Double.parseDouble(old) / 100000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " t");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void dkgToKg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " dkg");
                    Double num = Double.parseDouble(old) / 100;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " kg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void dkgToG(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " dkg");
                    Double num = Double.parseDouble(old) * 10;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " g");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void dkgToMg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " dkg");
                    Double num = Double.parseDouble(old) * 10000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " mg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //G
    @FXML
    public void gToT(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " g");
                    Double num = Double.parseDouble(old) / 1000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " t");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void gToKg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " g");
                    Double num = Double.parseDouble(old) / 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " kg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void gToDkg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " g");
                    Double num = Double.parseDouble(old) / 10;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " dkg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void gToMg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " g");
                    Double num = Double.parseDouble(old) * 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " mg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //Mg
    @FXML
    public void mgToT(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " mg");
                    Double num = Double.parseDouble(old) / 1000000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " t");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void mgToKg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " mg");
                    Double num = Double.parseDouble(old) / 1000000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " kg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void mgToDkg(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " mg");
                    Double num = Double.parseDouble(old) / 10000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " dkg");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void mgToG(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " mg");
                    Double num = Double.parseDouble(old) / 1000;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " g");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //°C
    @FXML
    public void cToF(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " °C");
                    Double num = Double.parseDouble(old) * 1.8 + 32;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " °F");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }
    //°F
    @FXML
    public void fToC(javafx.event.ActionEvent event) {
        try{
            if(check()) {
                if (operator == null) {
                    operator = ((Button) event.getSource()).getText();
                    String old = szamolas.getText();
                    szamolas.setText(old + " °F");
                    Double num = (Double.parseDouble(old) - 32) / 1.8;
                    ans = String.valueOf(num);
                    eredmeny.setText(num + " °C");
                }
            }
        } catch (Exception e) {
            System.out.println("Számot kérek! Nincs művelethalmozás!");
        }
    }

    @FXML
    public void HufToEur() {
        try{
            if(check()) {
                if (operator == null) {
                    operator = "HUFTOEUR";
                    Double old = Double.valueOf(szamolas.getText());
                    String num1 = HufToEurController.getInstance().change();
                    Double num2 = Double.valueOf(num1);
                    Double newer = old * num2;
                    ans = String.valueOf(String.format("%.2f", newer));
                    szamolas.setText(old + " HUF");
                    eredmeny.setText(String.format("%.2f", newer) + " EUR");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void EurToHuf() {
        try{
            if(check()) {
                if (operator == null) {
                    operator = "EURTOHUF";
                    Double old = Double.valueOf(szamolas.getText());
                    String num1 = EurToHufController.getInstance().change();
                    Double num2 = Double.valueOf(num1);
                    Double newer = old * num2;
                    ans = String.valueOf(String.format("%.0f", newer));
                    szamolas.setText(old + " EUR");
                    eredmeny.setText(String.format("%.0f", newer) + " HUF");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
