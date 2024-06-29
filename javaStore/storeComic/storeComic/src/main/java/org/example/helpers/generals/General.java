package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class General {

    public boolean regexValidation(String regex, String cadena) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        if (!matcher.matches()) {
            return false;
        } else {
            return true;
        }

    }
}
