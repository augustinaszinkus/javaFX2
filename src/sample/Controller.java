package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private Label skaiciu;
    @FXML
    private TextField spejimas;

    public void speti(ActionEvent e) {
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        int y = Integer.parseInt(spejimas.getText());
        if (x == y) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saunuolis, tu, atspejai!");
            alert.show();
            //skaiciu.setText("Saunuolis, tu atspejai!");
        } else {
            Alert alert1 = new Alert(Alert.AlertType.ERROR);
            alert1.setContentText("Bandyk dar karta, skaicius buvo " + x);
            alert1.show();
            //skaiciu.setText("Neatspejai " + x);
        }

    }

    public void baigti(ActionEvent b) {
        System.exit(0);
    }
}
