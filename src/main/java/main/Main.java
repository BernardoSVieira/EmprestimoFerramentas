
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/EmprestimoFerramenta";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha na conexão!");
        }
    }
}
