package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Ferramenta;

public class FerramentaDao {
    public void adicionarFerramenta(Ferramenta ferramenta) {
        String sql = "INSERT INTO tb_ferramenta (id_ferramenta, nome, custo, marca) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, ferramenta.getId());
            stmt.setString(2, ferramenta.getNome());
            stmt.setFloat(3, ferramenta.getCusto());
            stmt.setString(4, ferramenta.getMarca());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
