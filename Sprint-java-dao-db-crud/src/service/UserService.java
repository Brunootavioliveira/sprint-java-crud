package service;

import dao.UserDAO;
import model.User;
import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public void addUser(User user) {
        if (user.getName() == null || user.getEmail() == null) {
            throw new IllegalArgumentException("Nome e email são obrigatórios");
        }
        userDAO.create(user);
    }

    public List<User> listUsers() {
        return userDAO.readAll();
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(int id) {
        userDAO.delete(id);
    }
}
