package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Message;

public class BrandValidation {

    private General general = new General();

    public boolean nameValidate(String name) throws Exception {
        if (name.length() > 50) {
            throw new Exception("El nombre de la marca no puede tener más de 50 caracteres.");
        }
        return true;
    }

    public boolean countryValidation(String country) throws Exception {
        String regex = "^[a-zA-Z]{1,10}$";
        boolean matcher = general.regexValidation(regex, country);
        if (!matcher) {
            throw new Exception("El país de la marca debe contener solo letras y tener máximo 10 caracteres.");
        }
        return true;
    }

    public boolean emailValidation(String email) throws Exception {
        String regex = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@globant\\.com$";
        boolean matcher = general.regexValidation(regex, email);
        if (!matcher) {
            throw new Exception("El correo electrónico del representante debe tener un formato válido (xxxx@globant.com).");
        }
        return true;
    }
}
