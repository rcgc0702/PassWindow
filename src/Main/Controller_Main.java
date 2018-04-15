package Main;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_Main {

    @FXML
    Button submit1;
    @FXML
    Button submit2;
    @FXML
    TextField tf_1;
    @FXML
    TextField tf_2;
    Stage anewStage;
    static Person aPerson = new Person("","");

    public void initialize() {

        submit1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aPerson.setMyFirstName(tf_1.getText());
                aPerson.setMyLastName(tf_2.getText());

                tf_1.clear();
                tf_2.clear();
                try {
                    Window1 myWindow1 = new Window1(aPerson);
                    anewStage = myWindow1.getTheStage();
                    anewStage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        submit2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aPerson.setMyFirstName(tf_1.getText());
                aPerson.setMyLastName(tf_2.getText());

                tf_1.clear();
                tf_2.clear();
                try {
                    Window2 myWindow2 = new Window2(aPerson);
                    anewStage = myWindow2.getTheStage();
                    anewStage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        aPerson.myFirstNameProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                AStaticClass.assignPersonObject(aPerson);
                System.out.println("First Changed");
            }
        });

        aPerson.myLastNameProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                AStaticClass.assignPersonObject(aPerson);
                System.out.println("Last Changed");
            }
        });



//        aPerson.theFullNameProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                AStaticClass.assignPersonObject(aPerson);
//                System.out.println("Full name change");
//            }
//        });


    }
}
