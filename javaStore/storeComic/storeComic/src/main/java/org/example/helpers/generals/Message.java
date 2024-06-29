package org.example.helpers.generals;

public enum Message {

    // Mensajes de validación para Brand
    BRAND_NAME("Error: El nombre de la marca no puede tener más de 50 caracteres."),
    BRAND_COUNTRY("Error: El país solo puede tener letras y un máximo de 10 caracteres."),
    REPRESENTATIVE_EMAIL("Error: El correo electrónico del representante debe ser válido y terminar en @globant.com."),

    // Mensajes de validación para Customer
    LENGTH_NAME("Error: El nombre no puede tener más de 70 caracteres."),
    FORMAT_NAME("Error: El nombre solo puede contener letras y espacios."),
    FORMAT_EMAIL("Error: El correo electrónico debe ser válido y terminar en @globant.com."),
    DATE_REGISTER("Error: La fecha de registro debe tener el formato YYYY/MM/DD."),
    PHONE_FORMAT("Error: El teléfono debe tener exactamente 10 dígitos."),

    // Mensajes de validación para Facture
    DATE_FACTURE("Error: La fecha de la factura debe tener el formato DD/MM/YYYY."),

    // Mensajes de validación para Product
    PRODUCT_NAME_FORMAT("Error: El nombre del producto solo puede contener letras y espacios."),
    PRODUCT_PRICE("Error: El precio del producto no puede ser negativo."),
    PRODUCT_DESCRIPTION("Error: La descripción del producto no puede tener más de 50 caracteres.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
