package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Message;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;

public class CustomerValidation {

    private General general = new General();

    public boolean namesValidate(String names) throws Exception {
        if (names.length() > 70) {
            throw new Exception("El nombre del cliente no puede tener más de 70 caracteres.");
        }
        String regex = "^[a-zA-Z ]+$";
        boolean matcher = general.regexValidation(regex, names);
        if (!matcher) {
            throw new Exception("El nombre del cliente solo puede contener letras y espacios.");
        }
        return true;
    }

    public boolean emailValidate(String email) throws Exception {
        String regex = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@globant\\.com$";
        boolean matcher = general.regexValidation(regex, email);
        if (!matcher) {
            throw new Exception("El correo electrónico del cliente debe tener un formato válido (xxxx@globant.com).");
        }
        return true;
    }

    public boolean registerdatevalidate(LocalDate registerDate) throws Exception {
        String formattedDate = registerDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String regex = "\\d{4}/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])";
        boolean matcher = formattedDate.matches(regex);
        if (!matcher) {
            throw new Exception("La fecha de registro debe tener el formato YYYY/MM/DD.");
        }
        return true;
    }

    public boolean phoneValidate(String phone) throws Exception {
        String regex = "^\\d{10}$";
        boolean matcher = general.regexValidation(regex, phone);
        if (!matcher) {
            throw new Exception("El número de teléfono debe tener exactamente 10 dígitos numéricos.");
        }
        return true;
    }
}
