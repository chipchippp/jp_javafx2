package demo4;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;

public class Time implements Initializable {
    public Button btnStart;
    public Button btnPause;
    public Button btnStop;
    public Text txtMin1;
    public Text txtSec1;
    private Integer x = 30, y = 0;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Thread(() -> {

            boolean flag = true;
            while (flag) {
                String m = x>=30?x.toString():""+x;
                String s = y>=10?y.toString():"0"+y;
                txtMin1.setText(m);
                txtSec1.setText(s);
                y--;
                if (y < 0) {
                    y = 59;
                    x--;
                }
                if (x < 0) {
                    flag = false;
                }
                try {
                    Thread.sleep(30);
                } catch (Exception e) {
                }
            }

        }).start();
    }
    public void Start(MouseEvent mouseEvent) {
//        Thread t1 = new Thread(({
//
//        });
    }

    public void Pause(MouseEvent mouseEvent) {
    }

    public void Stop(MouseEvent mouseEvent) {

    }
}

