package org.example.helpers.tests;

import org.example.helpers.validaciones.ProductValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProductValidationTest {
    private ProductValidation productValidation;

    @BeforeEach
    public void setUp() {
        productValidation = new ProductValidation();
    }

    @Test
    public void testValidNameValidation() {
        String name = "Product Name";
        assertDoesNotThrow(() -> productValidation.nameValidation(name));
    }

    @Test
    public void testInvalidNameValidation() {
        String name = "12345";
        Exception exception = assertThrows(Exception.class, () -> productValidation.nameValidation(name));
        assertEquals("Error! debes ingresar solo letras y espacios", exception.getMessage());
    }

    @Test
    public void testValidPriceValidation() {
        int price = 10;
        assertDoesNotThrow(() -> productValidation.priceValidation(price));
    }

    @Test
    public void testInvalidPriceValidation() {
        int price = -10;
        Exception exception = assertThrows(Exception.class, () -> productValidation.priceValidation(price));
        assertEquals("Error! has ingresado un valor del producto Negativo.", exception.getMessage());
    }

    @Test
    public void testValidDescriptionValidation() {
        String description = "This is a valid description with more than 50 characters.";
        assertDoesNotThrow(() -> productValidation.descriptionValidation(description));
    }

    @Test
    public void testInvalidDescriptionValidation() {
        String description = "This is a short description that exceeds fifty characters limit and should throw an exception.";
        Exception exception = assertThrows(Exception.class, () -> productValidation.descriptionValidation(description));
        assertEquals("Error! solo podras ingresar menos ed 50 caracteres a la descripcion de este producto.", exception.getMessage());
    }
}
