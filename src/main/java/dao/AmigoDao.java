package dao;

import java.util.ArrayList;
import modelo.Amigo;

public class AmigoDao {

     public static ArrayList<Amigo> minhaLista = new ArrayList<>();
   
      public static ArrayList<Amigo> getMinhaLista() {
        return minhaLista;
      }
    public static void setMinhaLista(ArrayList<Amigo> minhaLista) {
        AmigoDao.minhaLista = minhaLista;
    }
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