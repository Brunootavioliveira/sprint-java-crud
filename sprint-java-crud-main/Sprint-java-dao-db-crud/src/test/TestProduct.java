package test;

import model.Product;
import service.ProductService;

import java.util.List;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Produtos ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Preço do produto: ");
                String precoStr = sc.next().replace(",", ".");
                double preco = Double.parseDouble(precoStr);

                System.out.print("Estoque do produto: ");
                int estoque = sc.nextInt();

                Product p = new Product(0, nome, preco, estoque);
                service.addProduct(p);
                System.out.println("Produto cadastrado com sucesso!");
                break;

            case 2:
                List<Product> produtos = service.listProducts();
                System.out.println("=== Lista de Produtos ===");
                for (Product prod : produtos) {
                    System.out.println(prod);
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
