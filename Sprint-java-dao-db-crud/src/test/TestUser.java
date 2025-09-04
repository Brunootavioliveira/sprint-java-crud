package test;

import model.User;
import service.UserService;

public class TestUser {
    public static void main(String[] args) {
        UserService service = new UserService();

        User user = new User(0, "Marcello", "Marcello@email.com", "12345");
        service.addUser(user);

        System.out.println("Lista de usuários:");
        for (User u : service.listUsers()) {
            System.out.println(u);
        }
    }
}
