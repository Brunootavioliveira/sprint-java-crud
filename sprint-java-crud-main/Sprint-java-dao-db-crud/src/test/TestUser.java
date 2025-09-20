package test;

import model.User;
import service.UserService;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserService service = new UserService();

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    User user = new User(id, nome, email, senha);
                    service.addUser(user);
                    System.out.println("✅ Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n📋 Lista de usuários:");
                    for (User u : service.listUsers()) {
                        System.out.println(u);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
