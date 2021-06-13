package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Label labelOne;
    @FXML private TextField TFSum;
    @FXML private Button buttonPlus;
    @FXML private Button buttonMinus;

    public void ClickButtonPlus(ActionEvent e) {
        int i = Integer.parseInt(TFSum.getText());
        if(i<3) {
            i++;
        }
        TFSum.setText(Integer.toString(i));
    }
    public void ClickButtonMinus(ActionEvent e) {
        int i = Integer.parseInt(TFSum.getText());
        if(i>-5) {
        i--;
        }
        TFSum.setText(Integer.toString(i));
        }
    }
