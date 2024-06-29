package org.example.helpers.tests;
import org.example.helpers.generals.Message;
import org.junit.jupiter.api.Test;
import org.example.models.Brand;

import static org.junit.jupiter.api.Assertions.*;

class BrandTest {

    @Test
    void testNameValidation() {
        Brand brand = new Brand();


        assertDoesNotThrow(() -> brand.setName("ValidName"));
        assertEquals("ValidName", brand.getName());


        Exception exception = assertThrows(Exception.class, () -> brand.setName("ThisNameIsWayTooLongAndShouldThrowAnExceptionBecauseItExceedsFiftyCharacters"));
        assertEquals(Message.BRAND_NAME.getMessage(), exception.getMessage());
    }

    @Test
    void testCountryValidation() {
        Brand brand = new Brand();


        assertDoesNotThrow(() -> brand.setCountry("Colombia"));
        assertEquals("Colombia", brand.getCountry());


        Exception exception = assertThrows(Exception.class, () -> brand.setCountry("LongCountryName"));
        assertEquals(Message.BRAND_COUNTRY.getMessage(), exception.getMessage());


        exception = assertThrows(Exception.class, () -> brand.setCountry("Colombia1"));
        assertEquals(Message.BRAND_COUNTRY.getMessage(), exception.getMessage());
    }

    @Test
    void testEmailValidation() {
        Brand brand = new Brand();


        assertDoesNotThrow(() -> brand.setEmail("test@globant.com"));
        assertEquals("test@globant.com", brand.getEmail());


        Exception exception = assertThrows(Exception.class, () -> brand.setEmail("invalidemail@gmail.com"));
        assertEquals(Message.REPRESENTATIVE_EMAIL.getMessage(), exception.getMessage());
    }

    @Test
    void testIdValidation() {
        Brand brand = new Brand();


        brand.setId(5);
        assertEquals(5, brand.getId());


        brand.setId(-1);
        assertNotEquals(-1, brand.getId());
    }
}
