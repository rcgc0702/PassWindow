package Main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller_Window2 {

    @FXML
    TextField f1;
    @FXML
    TextField f2;

    public void initialize() {

        f1.setDisable(true);
        f1.setText(AStaticClass.getTheFName());

        f2.setDisable(true);
        f2.setText(AStaticClass.getTheLName());

    }


}
