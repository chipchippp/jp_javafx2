package db2java2;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Calcul {

    private Double nba, nubb, result;

    public Calcul(Double nba, Double nubb, Double result) {
        this.nba = nba;
        this.nubb = nubb;
        this.result = result;
    }

    public Double getNba() {
        return nba;
    }

    public void setNba(Double nba) {
        this.nba = nba;
    }

    public Double getNubb() {
        return nubb;
    }

    public void setNubb(Double nubb) {
        this.nubb = nubb;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Calcul{" +
                "nba=" + nba +
                ", nubb=" + nubb +
                ", result=" + result +
                '}';
    }
}
