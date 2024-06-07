package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import visao.FRMCentral;

public class Principal {
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
       
         FRMCentral objetotela = new FRMCentral();
         objetotela.setVisible(true);
        }
    } 
}            
   
