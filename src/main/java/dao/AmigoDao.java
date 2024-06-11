package dao;

import java.util.ArrayList;
import modelo.Amigo;

// Classe responsável por realizar operações de acesso a dados para a entidade Amigo
public class AmigoDao {

    // Lista estática para armazenar os amigos
    public static ArrayList<Amigo> minhaLista = new ArrayList<>();
   
    // Método estático para obter a lista de amigos
    public static ArrayList<Amigo> getMinhaLista() {
        return minhaLista;
    }

    // Método estático para definir a lista de amigos
    public static void setMinhaLista(ArrayList<Amigo> minhaLista) {
        AmigoDao.minhaLista = minhaLista;
    }

    // Método estático para obter o maior ID entre os amigos
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId() > maiorID) {
                maiorID = minhaLista.get(i).getId();
            }
        }
        return maiorID;
    }
}
