package modelo;

import dao.FerramentaDao;
import java.util.ArrayList;

public class Ferramenta {

    private int id_ferramenta;
    private String nome;
    private String marca;
    private float custo;
   
   
   
    public Ferramenta(int id_ferramenta, String nome, String marca, float custo) {
        this.id_ferramenta = id_ferramenta;
        this.nome = nome;
        this.custo = custo;
        this.marca = marca;
   
    }
    public int getId_ferramenta() {
        return id_ferramenta;
    }
    public void setId_ferramenta(int id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public float getCusto() {
        return custo;
    }
    public void setCusto(float custo) {
        this.custo = custo;
    }
    @Override
    public String toString() {
        return "Ferramenta [id=" + id_ferramenta + ", nome=" + nome + ", marca="+ marca + ", custo" + custo + "]";
    }
   
        public ArrayList<Ferramenta> getMinhaLista() {
            return FerramentaDao.getMinhaLista();
    }
        public boolean insertFerramentaBD(String nome,String marca, float custo){
            int id_ferramenta = this.maiorID() + 1;
            Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
            FerramentaDao.minhaLista.add(objeto);
            return true;
}
            public boolean deleteFerramentaBD(int id_ferramenta) {
                int indice = this.procuraIndice(id_ferramenta);
                FerramentaDao.minhaLista.remove(indice);
                return true;
    }
    public boolean updateFerramentaBD (int id_ferramenta, String nome, String marca, float custo) {
        Ferramenta objeto = new Ferramenta(id_ferramenta, nome, marca, custo);
        int indice = this.procuraIndice(id_ferramenta);
        FerramentaDao.minhaLista.set(indice, objeto);
        return true;
    }
    private int procuraIndice(int id_ferramenta) {
        int indice = -1;
        for (int i = 0; i < FerramentaDao.minhaLista.size(); i++) {
            if (FerramentaDao.minhaLista.get(i).getId_ferramenta() == id_ferramenta) {
                indice = i;
}
}
        return indice;
    }
   
 public Ferramenta carregaFerramenta(int id_ferramenta) {
        int indice = this.procuraIndice(id_ferramenta);
        return FerramentaDao.minhaLista.get(indice);
 }
public int maiorID() {
        return FerramentaDao.maiorID();
    }
}