package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private static ConnectionFactory instance;
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_java?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "";
    private static final String PASSWORD = "";


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage(), e);
        }
    }

    public static synchronized ConnectionFactory getInstance() {
        if (instance == null) instance = new ConnectionFactory();
        return instance;
    }
}
