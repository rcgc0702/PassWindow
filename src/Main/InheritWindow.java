package Main;

import javafx.stage.Stage;
import javafx.stage.Window;

abstract class InheritWindow extends Window {

    Stage awindowStage;

    public InheritWindow(Person myPerson) {
    }

    public Stage getTheStage(){
        return awindowStage;
    }
}
