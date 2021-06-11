package Validation;

public class PatientName {
    String name;

    public boolean Checkname(String name) {
        if (name.matches("[A-Z][a-z]*")) {

            return true;
        } else {
            return false;
        }
    }

    public boolean Checkname() {
        return true;
    }
}