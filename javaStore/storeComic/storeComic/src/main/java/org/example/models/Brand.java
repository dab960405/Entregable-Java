package org.example.models;

import org.example.helpers.validaciones.BrandValidation;

public class Brand {

    // ID
    private Integer id;

    // NAME (El nombre de la marca no puede pasar de 50 caracteres)
    private String name;

    // COUNTRY (Solo puede tener letras y solo 10 caracteres)
    private String country;

    // REPRESENTATIVE_EMAIL (Debe tener un formato de mail valido xxxx@globant.com)
    private String email;

    private BrandValidation brandValidation = new BrandValidation();

    public Brand() {
    }

    public Brand(Integer id, String name, String country, String email) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.email = email;
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
            this.brandValidation.nameValidate(name);
            this.name = name;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        try {
            this.brandValidation.countryValidation(country);
            this.country = country;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            this.brandValidation.emailValidation(email);
            this.email = email;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}