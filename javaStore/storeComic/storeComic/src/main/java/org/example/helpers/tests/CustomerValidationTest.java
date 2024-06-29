package org.example.helpers.tests;

import org.example.helpers.generals.Message;
import org.example.helpers.validaciones.CustomerValidation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class CustomerValidationTest {

    @Test
    void testNamesValidation() {
        CustomerValidation customerValidation = new CustomerValidation();


        assertDoesNotThrow(() -> customerValidation.namesValidate("John Doe"));


        Exception exception = assertThrows(Exception.class, () -> customerValidation.namesValidate("ThisIsAVeryLongNameThatExceedsSeventyCharactersLimitAndShouldThrowAnException"));
        assertEquals(Message.LENGTH_NAME.getMessage(), exception.getMessage());


        exception = assertThrows(Exception.class, () -> customerValidation.namesValidate("John123"));
        assertEquals(Message.FORMAT_NAME.getMessage(), exception.getMessage());
    }

    @Test
    void testEmailValidation() {
        CustomerValidation customerValidation = new CustomerValidation();


        assertDoesNotThrow(() -> customerValidation.emailValidate("test@globant.com"));


        Exception exception = assertThrows(Exception.class, () -> customerValidation.emailValidate("invalidemail@gmail.com"));
        assertEquals(Message.FORMAT_EMAIL.getMessage(), exception.getMessage());
    }

    @Test
    void testRegisterDateValidation() {
        CustomerValidation customerValidation = new CustomerValidation();


        assertDoesNotThrow(() -> customerValidation.registerdatevalidate(LocalDate.now()));


        Exception exception = assertThrows(Exception.class, () -> customerValidation.registerdatevalidate(LocalDate.of(2023, 13, 01)));
        assertEquals(Message.DATE_REGISTER.getMessage(), exception.getMessage());
    }

    @Test
    void testPhoneValidation() {
        CustomerValidation customerValidation = new CustomerValidation();


        assertDoesNotThrow(() -> customerValidation.phoneValidate("1234567890"));


        Exception exception = assertThrows(Exception.class, () -> customerValidation.phoneValidate("12345"));
        assertEquals(Message.PHONE_FORMAT.getMessage(), exception.getMessage());
    }
}
