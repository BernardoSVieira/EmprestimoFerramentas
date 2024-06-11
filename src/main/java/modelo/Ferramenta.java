package modelo;

import dao.FerramentaDao;
import java.util.ArrayList;

// Classe que representa uma ferramenta
public class Ferramenta {

    private int id_ferramenta; // Identificador da ferramenta
    private String nome; // Nome da ferramenta
    private String marca; // Marca da ferramenta
    private float custo; // Custo da ferramenta
   
    // Construtor da classe Ferramenta
    public Ferramenta(int id_ferramenta, String nome, String marca, float custo) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
    }

    // Métodos para obter e definir o id da ferramenta
    public int getId_ferramenta() {
        return id_ferramenta;
    }
    public void setId_ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }
   
    // Métodos para obter e definir o nome da ferramenta
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para obter e definir a marca da ferramenta
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    // Métodos para obter e definir o custo da ferramenta
    public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }

    // Método que retorna uma representação em string da ferramenta
    @Override
    public String toString() {
        return "Ferramenta [id=" + id_ferramenta + ", nome=" + nome + ", marca="+ marca + ", custo=" + custo + "]";
    }
   
    // Método para obter a lista de ferramentas do DAO
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDao.getMinhaLista();
    }

    // Método para inserir uma nova ferramenta no banco de dados
    public boolean insertFerramentaBD(String nome, String marca, float custo) {
        int id_ferramenta = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
        FerramentaDao.minhaLista.add(objeto);
        return true;
    }

    // Método para excluir uma ferramenta do banco de dados
    public boolean deleteFerramentaBD(int id_ferramenta) {
        int indice = this.procuraIndice(id_ferramenta);
        FerramentaDao.minhaLista.remove(indice);
        return true;
    }

    // Método para atualizar uma ferramenta no banco de dados
    public boolean updateFerramentaBD (int id_ferramenta, String nome, String marca, float custo) {
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
        int indice = this.procuraIndice(id_ferramenta);
        FerramentaDao.minhaLista.set(indice, objeto);
        return true;
    }

    // Método privado para procurar o índice de uma ferramenta na lista
    private int procuraIndice(int id_ferramenta) {
        int indice = -1;
        for (int i = 0; i < FerramentaDao.minhaLista.size(); i++) {
            if (FerramentaDao.minhaLista.get(i).getId_ferramenta() == id_ferramenta) {
                indice = i;
            }
        }
        return indice;
    }
   
    // Método para carregar uma ferramenta pelo seu id
    public Ferramenta carregaFerramenta(int id_ferramenta) {
        int indice = this.procuraIndice(id_ferramenta);
        return FerramentaDao.minhaLista.get(indice);
    }

    // Método para obter o maior ID das ferramentas
    public int maiorID() {
        return FerramentaDao.maiorID();
    }
}
