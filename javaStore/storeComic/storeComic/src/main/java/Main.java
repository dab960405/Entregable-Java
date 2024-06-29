import org.example.models.Customer;

import java.time.LocalDate;
import java.util.Scanner;

import org.example.models.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();

        //Intentar agregar un nombre al cliente desde la consola

        Scanner lea = new Scanner(System.in);

        /*System.out.print("Digita el nombre del cliente ");
        customer.setName(lea.nextLine());

        System.out.print("Digita el correo del cliente ");
        customer.setEmail(lea.nextLine());

        System.out.println("Ingrese la fecha de registro del cliente");
        customer.setDate(LocalDate.parse(lea.nextLine()));

        System.out.print("Digita el telefono del cliente ");
        customer.setPhone(lea.nextLine());

        Brand brand = new Brand();

        System.out.println("Digita el nombre de la marca");
        brand.setName(lea.nextLine());

        System.out.println("Digita el nombre del pais");
        brand.setCountry(lea.nextLine());

        System.out.println("Digita el correo del representante");
        brand.setEmail(lea.nextLine());

        Product product = new Product();

        System.out.println("Digita el nombre del producto");
        product.setName(lea.nextLine());

        System.out.println("Digita el precio del producto");
        product.setPrice(Integer.valueOf(lea.nextLine()));

        System.out.println("Has una descripcion del producto");
        product.setDescription(lea.nextLine());*/

        Facture facture = new Facture();

        System.out.println("Digite la fecha de la factura");
        facture.setDate(LocalDate.parse(lea.nextLine()));

        System.out.println("Coloca la lista de productos");
        facture.setProductList(lea.nextLine());

        System.out.println("Coloca el valor neto");
        facture.setNetCost(lea.nextInt());
    }

}
