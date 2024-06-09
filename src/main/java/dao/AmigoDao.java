package dao;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.SourceVersion;

public class AmigoDao {

    public static class Amigo {
        private static int contador = 1;
        private final int id;
        private String nome;
        private String email;

        public Amigo(String nome, String email) {
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
    }

    public interface AmigoDAO {
        List<Amigo> listarTodos();
        Amigo buscarPorId(int id);
        void inserir(Amigo amigo);
        void atualizar(Amigo amigo);
        void deletar(int id);
    }

    public static class AmigoDAOImpl implements AmigoDAO {

        private List<Amigo> amigos = new ArrayList<>();

        @Override
        public List<Amigo> listarTodos() {
            return new ArrayList<>(amigos);
        }

        @Override
        public Amigo buscarPorId(int id) {
            for (Amigo amigo : amigos) {
                if (amigo.getId() == id) {
                    return amigo;
                }
            }
            return null;
        }

        @Override
        public void inserir(Amigo amigo) {
            amigos.add(amigo);
        }

        @Override
        public void atualizar(Amigo amigo) {
            Amigo existente = buscarPorId(amigo.getId());
            if (existente != null) {
                existente.setNome(amigo.getNome());
                existente.setEmail(amigo.getEmail());
            }
        }

        @Override
        public void deletar(int id) {
            amigos.removeIf(amigo -> amigo.getId() == id);
        }
    }
}
