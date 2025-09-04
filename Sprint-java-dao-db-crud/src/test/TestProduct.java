package test;

import model.Product;
import service.ProductService;

public class TestProduct {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        Product p = new Product(0, "Cadeira Gamer", 1200.00, 5);
        service.addProduct(p);

        System.out.println("Lista de produtos:");
        for (Product prod : service.listProducts()) {
            System.out.println(prod);
        }
    }
}
