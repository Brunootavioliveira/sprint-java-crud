package test;

import dao.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.getInstance().getConnection();
            System.out.println("Conexão realizada com sucesso!");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
