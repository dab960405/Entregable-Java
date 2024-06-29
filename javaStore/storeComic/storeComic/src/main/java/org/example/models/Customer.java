package org.example.models;

import org.example.helpers.validaciones.CustomerValidation;

import java.time.LocalDate;
public class Customer {
    // ID
    private Integer id;

    // Names (Que solo se puedan letras y espacios y máximo 70 caracteres)
    private String name;

    // Email
    private String email;

    // Fecha de registro (YYYY/MM/DD) se recomienda usar la clase LOCAL DATE
    private LocalDate date;

    // Teléfono (Debe tener 10 dígitos)
    private String phone;

    // Inyectando una dependencia de la clase CustomerValidation
    private CustomerValidation customerValidation = new CustomerValidation();

    public Customer() {
    }

    public Customer(Integer id, String name, String email, LocalDate date, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Revise ya que no se aceptan id negativos");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.customerValidation.namesValidate(name);
            this.name = name;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            this.customerValidation.emailValidate(email);
            this.email = email;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        try {
            this.customerValidation.registerdatevalidate(date);
            this.date = date;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        try {
            this.customerValidation.phoneValidate(phone);
            this.phone = phone;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
