package org.example.helpers.validaciones;

import org.example.helpers.generals.Message;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FactureValidation {

    public boolean dateValidation(LocalDate date) throws Exception {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String regex = "\\d{4}/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])";
        boolean matcher = formattedDate.matches(regex);
        if (!matcher) {
            throw new Exception("La fecha de la factura debe tener el formato DD/MM/YYYY.");
        }
        return true;
    }

    public boolean productListValidation(String productList) {
        return productList != null && !productList.isEmpty();
    }

    public double calculateNetCost(double grossCost, double iva, double discount) {
        double netCost = grossCost + (grossCost * iva) - discount;
        return netCost;
    }

    public boolean netcostValidation(double netcost) {
        return netcost >= 0;
    }
}
