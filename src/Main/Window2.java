package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Window2 extends InheritWindow {

    public Window2(Person myPerson) throws IOException {
        super(myPerson);

        Parent root = FXMLLoader.load(getClass().getResource("../FXML/UI_Window2.fxml"));
        AStaticClass.assignPersonObject(myPerson);
        awindowStage = new Stage();
        awindowStage.setTitle(myPerson.getMyFirstName() + " "+ myPerson.getMyLastName());
        awindowStage.initModality(Modality.APPLICATION_MODAL);
        awindowStage.setScene(new Scene(root, 500, 275));
        awindowStage.show();
    }

}
