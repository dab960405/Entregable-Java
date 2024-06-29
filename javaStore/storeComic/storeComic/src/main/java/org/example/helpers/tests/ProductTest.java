package org.example.helpers.tests;
import org.example.helpers.validaciones.ProductValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void testProductNameValidation() {
        ProductValidation productValidation = new ProductValidation();


        assertDoesNotThrow(() -> productValidation.nameValidation("Product Name"));


        Exception exception = assertThrows(Exception.class, () -> productValidation.nameValidation("Product123"));
        assertEquals("Error! debes ingresar solo letras y espacios", exception.getMessage());
    }

    @Test
    void testProductPriceValidation() {
        ProductValidation productValidation = new ProductValidation();


        assertDoesNotThrow(() -> productValidation.priceValidation(100));


        Exception exception = assertThrows(Exception.class, () -> productValidation.priceValidation(-50));
        assertEquals("Error! has ingresado un valor del producto Negativo.", exception.getMessage());
    }

    @Test
    void testProductDescriptionValidation() {
        ProductValidation productValidation = new ProductValidation();


        assertDoesNotThrow(() -> productValidation.descriptionValidation("Short description"));


        Exception exception = assertThrows(Exception.class, () -> productValidation.descriptionValidation("This description is way too long and should throw an exception because it exceeds fifty characters limit."));
        assertEquals("Error! solo podras ingresar menos ed 50 caracteres a la descripcion de este producto.", exception.getMessage());
    }
}
