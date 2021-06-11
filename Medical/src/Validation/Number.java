package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    public int count = 0;
    public String contact;

    public void valid(String contact) {
        this.contact = contact;
        if (isNumberValid()) {

            count++;
        }
    }

    public boolean isNumberValid() {

        Pattern p = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[6789]\\d{9}$");

        Matcher m = p.matcher(contact);
        return (m.find() && m.group().equals(contact));
    }
}