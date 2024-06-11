package modelo;

// Importa a classe 'AmigoDao' do pacote 'dao'. E Importa a classe ArrayList do pacote java.util. 
import dao.AmigoDao;
import java.util.ArrayList;


// publica a classe Amigo
public class Amigo {

// Define uma variável de instância chamada id que é do tipo inteiro (int) e é privada. E Define uma variável de instância chamada 'nome' que é do tipo String e também é privada. E Define uma variável de instância chamada 'telefone' que é do tipo String e também é privada.
    private int id; // Define o id do amigo
    private String nome; // Define o nome do amigo
    private String telefone; // Define o telefone do amigo
   
// Construtor da classe Amigo
   
    public Amigo(int id, String nome, String telefone) {
        this.id = id; // Define o id do amigo
        this.nome = nome; // Define o nome do amigo
        this.telefone = telefone; // Define o telefone do amigo
   
    }
    public int getId() {
        return id; // Define o telefone do amigo
    }
    public void setId(int id) {
        this.id = id; // Define o id do amigo
    }
   
    public String getNome() {
        return nome; // Retorna o nome do amigo
    }
    public void setNome(String nome) {
        this.nome = nome; // Define o nome do amigo
    }
    public String getTelefone(){
        return telefone; // Retorna o telefone do amigo
    }
    public void setTelefone(String telefone){
        this.telefone = telefone; // Define o telefone do amigo
    }
    @Override
    public String toString() {
        return "Amigo [id=" + id + ", nome=" + nome + ", telefone="+ telefone + "]"; // Retorna uma representação em String do objeto Amigo
    }
   
        public ArrayList<Amigo> getMinhaLista() {
            return AmigoDao.getMinhaLista(); // Retorna a lista de amigos
    }
        public boolean insertAmigoBD(String nome,String Telefone){
            int id = this.maiorID() + 1; // Calcula o novo id do amigo
            Amigo objeto = new Amigo(id, nome, telefone); // Cria um novo objeto Amigo
            AmigoDao.minhaLista.add(objeto); // Adiciona o amigo à lista
            return true; // Retorna verdadeiro se a operação for bem-sucedida
}
            public boolean deleteAmigoBD(int id) {
                int indice = this.procuraIndice(id); // Encontra o índice do amigo na lista
                AmigoDao.minhaLista.remove(indice); // Remove o amigo da lista
                return true; // Retorna verdadeiro se a operação for bem-sucedida
    }
    public boolean updateAmigoDao (int id, String nome, String Telefone) {
        Amigo objeto = new Amigo(id, nome, Telefone); // Cria um novo objeto Amigo
        int indice = this.procuraIndice(id); // Encontra o índice do amigo na lista
        AmigoDao.minhaLista.set(indice, objeto); // Atualiza o amigo na lista
        return true; // Retorna verdadeiro se a operação for bem-sucedida
    }
    private int procuraIndice(int id) {
        int indice = -1; // Define o índice inicial como -1
        for (int i = 0; i < AmigoDao.minhaLista.size(); i++) {  // Percorre a lista de amigos
            if (AmigoDao.minhaLista.get(i).getId() == id) { // Verifica se o id corresponde ao amigo na posição atual
                indice = i; // Atribui o índice atual
}
}
        return indice; // Retorna o índice do amigo na lista
    }
   
 public Amigo carregaAmigo(int id) {
        int indice = this.procuraIndice(id); // Encontra o índice do amigo na lista
        return AmigoDao.minhaLista.get(indice); // Retorna o amigo correspondente ao índice
 }
public int maiorID() {
        return AmigoDao.maiorID(); // Retorna o maior id entre os amigos na lista
    } 
}