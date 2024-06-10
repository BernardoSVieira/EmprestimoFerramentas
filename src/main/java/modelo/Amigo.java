package modelo;

import dao.AmigoDao;
import java.util.ArrayList;

public class Amigo {

    private int id;
    private String nome;
    private String telefone;
   
   
   
    public Amigo(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
   
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Amigo [id=" + id + ", nome=" + nome + ", telefone="+ telefone + "]";
    }
   
        public ArrayList<Amigo> getMinhaLista() {
            return AmigoDao.getMinhaLista();
    }
        public boolean insertAmigoBD(String nome,String Telefone){
            int id = this.maiorID() + 1;
            Amigo objeto = new Amigo(id, nome, telefone);
            AmigoDao.minhaLista.add(objeto);
            return true;
}
            public boolean deleteAmigoBD(int id) {
                int indice = this.procuraIndice(id);
                AmigoDao.minhaLista.remove(indice);
                return true;
    }
    public boolean updateAmigoDao (int id, String nome, String Telefone) {
        Amigo objeto = new Amigo(id, nome, Telefone);
        int indice = this.procuraIndice(id);
        AmigoDao.minhaLista.set(indice, objeto);
        return true;
    }
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AmigoDao.minhaLista.size(); i++) {
            if (AmigoDao.minhaLista.get(i).getId() == id) {
                indice = i;
}
}
        return indice;
    }
   
 public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id);
        return AmigoDao.minhaLista.get(indice);
 }
public int maiorID() {
        return AmigoDao.maiorID();
    }
}