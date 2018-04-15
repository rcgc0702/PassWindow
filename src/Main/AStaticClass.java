package Main;


public class AStaticClass {


    private static Person currentObject;

    public static void assignPersonObject (Person thePerson) {
        currentObject = thePerson;
    }

    public static String getTheFName() {

        return currentObject.getMyFirstName();
    }

    public static String getTheLName() {

        return currentObject.getMyLastName();
    }

}
