package org.example.models;

import org.example.helpers.validaciones.FactureValidation;

import java.time.LocalDate;
import java.util.ArrayList;

public class Facture {

    // ID
    private Integer id;

    // DATE (DD-MM-YYYY) local date
    private LocalDate date;

    // Productlist: "Revisar Arraylist"
    private String productList;

    // Grosscost
    private double grossCost;

    // Netcost (Aplicar IVA y descontar descuentos)
    private double netCost;

    private FactureValidation factureValidation = new FactureValidation();

    public Facture() {
    }

    public Facture(Integer id, LocalDate date, String productList, double grossCost, double netCost) {
        this.id = id;
        this.date = date;
        this.productList = productList;
        this.grossCost = grossCost;
        this.netCost = netCost;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        try {
            this.factureValidation.dateValidation(date);
            this.date = date;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        if (this.factureValidation.productListValidation(productList)) {
            this.productList = productList;
        } else {
            System.out.println("La lista de productos no puede estar vacía");
        }
    }

    public double getGrossCost() {
        return grossCost;
    }

    public void setGrossCost(double grossCost) {
        if (grossCost >= 0) {
            this.grossCost = grossCost;
        } else {
            System.out.println("El costo bruto no puede ser negativo");
        }
    }

    public double getNetCost() {
        return netCost;
    }

    public void setNetCost(double netCost) {
        try {
            if (this.factureValidation.netcostValidation(netCost)) {
                this.netCost = netCost;
            } else {
                throw new Exception("El costo neto no puede ser negativo");
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
