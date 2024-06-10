package dao;

import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDao {

     public static ArrayList<Ferramenta> minhaLista = new ArrayList<>();
   
      public static ArrayList<Ferramenta> getMinhaLista() {
        return minhaLista;
      }
    public static void setMinhaLista(ArrayList<Ferramenta> minhaLista) {
        FerramentaDao.minhaLista = minhaLista;
    }
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