package dao;

import java.util.ArrayList;
import modelo.Ferramenta;

// Classe responsável por realizar operações de acesso a dados para a entidade Ferramenta
public class FerramentaDao {

    // Lista estática para armazenar as ferramentas
    public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
   
    // Método estático para obter a lista de ferramentas
    public static ArrayList<Ferramenta> getMinhaLista() {
        return minhaLista;
    }

    // Método estático para definir a lista de ferramentas
    public static void setMinhaLista(ArrayList<Ferramenta> minhaLista) {
        FerramentaDao.minhaLista = minhaLista;
    }

    // Método estático para obter o maior ID entre as ferramentas
    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < minhaLista.size(); i++) {
            if (minhaLista.get(i).getId_ferramenta() > maiorID) {
                maiorID = minhaLista.get(i).getId_ferramenta();
            }
        }
        return maiorID;
    }
}
