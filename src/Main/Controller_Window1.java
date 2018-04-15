package Main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller_Window1 {

    @FXML
    TextField myID1;
    @FXML
    TextField myID2;

    public void initialize() {

        myID1.setDisable(true);
        myID1.setText(AStaticClass.getTheFName());

        myID2.setDisable(true);
        myID2.setText(AStaticClass.getTheLName());

    }


}
