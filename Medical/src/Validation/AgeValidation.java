package Validation;

public class AgeValidation {
    int age;

    //public int count=0;
    public boolean Agevalidation(int age) {
        this.age = age;
        if(isage())
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public  boolean isage() {

        if ((age > 0) && (age <= 100)) {
            //count++;
            return true;
        }
        else{

            return false;
        }

    }
}