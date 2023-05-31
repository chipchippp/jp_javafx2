package db2java2;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Home extends javax.swing.JFrame{
    private Double nba, nbb, result;

    public TextField txtNumberA;
    public TextField txtNumberB;
    public TextField txtR;
    public RadioButton rdAdd;
    public RadioButton rdMul;
    public RadioButton rdSub;
    public RadioButton rdDiv;
    public Button btnCal;
    public Button btnCanel;
    public  Home (){
        initComponents();
        SetLocationRelativeTo(null);
        rdAdd.setSelected(true);
    }
    private  void  btnCancelActionPerformed(){
        txtNumberA.setText("");
        txtNumberB.setText("");
        txtR.setText("");

    }
    public boolean validateForm(){
        if (txtNumberA.getText().isEmpty() || txtNumberB.getText().isEmpty()){
            return false;
        }
        return true;
    }
    private  void  btnCalActionPerformed(){
        if (validateForm()){
            nba = Double.parseDouble(txtNumberA.getText());
            nbb = Double.parseDouble(txtNumberA.getText());

            if (rdAdd.isSelected()){
                txtR.setText("" + (nba + nbb));
            }
            if (rdSub.isSelected()){
                txtR.setText("" + (nba - nbb));
            }
            if (rdMul.isSelected()){
                txtR.setText("" + (nba * nbb));
            }
            if (rdDiv.isSelected()){
                txtR.setText("" + (nba / nbb));
            }
        }
    }

    private void SetLocationRelativeTo(Object o) {
    }

    private void initComponents() {
    }
}
