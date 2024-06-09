package dao;

import dao.AmigoDao.Amigo;
import java.util.List;
import javax.lang.model.SourceVersion;

public class AmigoDao {
    public class Amigo {
       
    private static int contador = 1;
    private final int id;
    private String nome;
    private String email;

    public AmigoDao(String nome, String email) {
        this.id = contador++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    interface AmigoDAO {
    List<Amigo> listarTodos();
    Amigo buscarPorId(int id);
    void inserir(Amigo amigo);
    void atualizar(Amigo amigo);
    void deletar(int id);
}

    class AmigoDAOImpl extends AmigoDAO {

    private Iterable<Amigo> amigos;
    
    public AmigoDAOImpl(String nome, String email) {
        super(nome, email);
    }

    public List<Amigo> listarTodos() {
        return (List<Amigo>) amigos;
        }
    }
}