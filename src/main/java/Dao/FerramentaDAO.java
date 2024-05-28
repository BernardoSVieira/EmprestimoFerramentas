package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {
    
    public void adicionarFerramenta(Ferramenta ferramenta) throws SQLException {
        String sql = "INSERT INTO ferramentas (nome, descricao, disponivel) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getDescricao());
            stmt.setBoolean(3, ferramenta.isDisponivel());
            stmt.executeUpdate();
        }
    }

    public Ferramenta obterFerramenta(int id) throws SQLException {
        String sql = "SELECT * FROM ferramentas WHERE id = ?";
        try (Connection conn = Conexao.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Ferramenta(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getBoolean("disponivel")
                    );
                }
            }
        }
        return null;
    }

    public List<Ferramenta> listarFerramentas() throws SQLException {
        List<Ferramenta> ferramentas = new ArrayList<>();
        String sql = "SELECT * FROM ferramentas";
        try (Connection conn = Conexao.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ferramentas.add(new Ferramenta(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getBoolean("disponivel")
                ));
            }
        }
        return ferramentas;
    }

    public void atualizarFerramenta(Ferramenta ferramenta) throws SQLException {
        String sql = "UPDATE ferramentas SET nome = ?, descricao = ?, disponivel = ? WHERE id = ?";
        try (Connection conn = Conexao.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ferramenta.getNome());
            stmt.setString(2, ferramenta.getDescricao());
            stmt.setBoolean(3, ferramenta.isDisponivel());
            stmt.setInt(4, ferramenta.getId());
            stmt.executeUpdate();
        }
    }

    public void removerFerramenta(int id) throws SQLException {
        String sql = "DELETE FROM ferramentas WHERE id = ?";
        try (Connection conn = Conexao.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}





}
