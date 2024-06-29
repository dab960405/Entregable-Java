package org.example.helpers.validaciones;

import org.example.helpers.generals.General;

public class ProductValidation {

    private General general = new General();

    public boolean nameValidation(String name) throws Exception {
        String regex = "^[a-zA-Z\\s]+$";
        boolean match = general.regexValidation(regex, name);
        if (!match) {
            throw new Exception("El nombre del producto solo puede contener letras y espacios.");
        }
        return true;
    }

    public boolean priceValidation(int price) throws Exception {
        if (price < 0) {
            throw new Exception("El precio del producto no puede ser negativo.");
        }
        return true;
    }

    public boolean descriptionValidation(String description) throws Exception {
        String regex = "^.{1,50}$";
        boolean match = general.regexValidation(regex, description);
        if (!match) {
            throw new Exception("La descripción del producto debe tener entre 1 y 50 caracteres.");
        }
        return true;
    }
}

