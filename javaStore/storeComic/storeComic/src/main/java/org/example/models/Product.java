package org.example.models;

import org.example.helpers.validaciones.ProductValidation;

public class Product {

    // ID
    private Integer id;

    // Nombre (solo se aceptan letras y espacios)
    private String name;

    // Precio (solo se aceptan números)
    private Integer price;

    // Descripción (solo se aceptan cadenas de hasta 50 caracteres)
    private String description;

    // Foto
    private String photo;

    // Reseña
    private String review;

    // Marca
    private String brand;

    private ProductValidation productValidation = new ProductValidation();

    public Product() {
    }

    public Product(Integer id, String name, Integer price, String description, String photo, String review, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.photo = photo;
        this.review = review;
        this.brand = brand;
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
            this.productValidation.nameValidation(name);
            this.name = name;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        try {
            this.productValidation.priceValidation(price);
            this.price = price;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        try {
            this.productValidation.descriptionValidation(description);
            this.description = description;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
