package Main;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Person  {

    private StringProperty myFirstName;
    private StringProperty myLastName;
    private StringProperty theFullName;

    public Person(String myFirstName, String myLastName) {
        this.myFirstName = new SimpleStringProperty(myFirstName);
        this.myLastName = new SimpleStringProperty(myLastName);
        this.theFullName = new SimpleStringProperty("");
//        setTheFullName(this.getMyFirstName() + " " + this.getMyLastName());
    }

    public String getMyFirstName() {
        return myFirstName.get();
    }

    public StringProperty myFirstNameProperty() {
        return myFirstName;
    }

    public void setMyFirstName(String myFirstName) {
        this.myFirstName.set(myFirstName);
    }

    public String getMyLastName() {
        return myLastName.get();
    }

    public StringProperty myLastNameProperty() {
        return myLastName;
    }

    public void setMyLastName(String myLastName) {
        this.myLastName.set(myLastName);
    }

    public String getTheFullName() {
        return theFullName.get();
    }

    public StringProperty theFullNameProperty() {
        return theFullName;
    }

    private void setTheFullName(String theFullName) {
        this.theFullName.set(theFullName);
    }
}
