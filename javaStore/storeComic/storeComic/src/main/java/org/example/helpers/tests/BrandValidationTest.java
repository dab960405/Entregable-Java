package org.example.helpers.tests;
import org.example.helpers.generals.Message;
import org.junit.jupiter.api.Test;
import org.example.helpers.validaciones.BrandValidation;

import static org.junit.jupiter.api.Assertions.*;

public class BrandValidationTest {

    @Test
    void testNameValidation() {
        BrandValidation brandValidation = new BrandValidation();


        assertDoesNotThrow(() -> brandValidation.nameValidate("ValidName"));


        Exception exception = assertThrows(Exception.class, () -> brandValidation.nameValidate("ThisNameIsWayTooLongAndShouldThrowAnExceptionBecauseItExceedsFiftyCharacters"));
        assertEquals(Message.BRAND_NAME.getMessage(), exception.getMessage());
    }

    @Test
    void testCountryValidation() {
        BrandValidation brandValidation = new BrandValidation();


        assertDoesNotThrow(() -> brandValidation.countryValidation("Colombia"));


        Exception exception = assertThrows(Exception.class, () -> brandValidation.countryValidation("LongCountryName"));
        assertEquals(Message.BRAND_COUNTRY.getMessage(), exception.getMessage());


        exception = assertThrows(Exception.class, () -> brandValidation.countryValidation("Country1"));
        assertEquals(Message.BRAND_COUNTRY.getMessage(), exception.getMessage());
    }

    @Test
    void testEmailValidation() {
        BrandValidation brandValidation = new BrandValidation();


        assertDoesNotThrow(() -> brandValidation.emailValidation("test@globant.com"));


        Exception exception = assertThrows(Exception.class, () -> brandValidation.emailValidation("invalidemail@gmail.com"));
        assertEquals(Message.REPRESENTATIVE_EMAIL.getMessage(), exception.getMessage());
    }
}