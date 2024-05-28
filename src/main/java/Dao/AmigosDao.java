package dao;

import dao.AmigosDAO.Amigo;
import java.util.List;
import java.util.ArrayList;
import javax.lang.model.SourceVersion;

public class AmigosDAO{
    public class Amigo {

        String getId() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        String getNome() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        String getEmail() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setEmail(String novoEmail) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        void setNome(String novoNome) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
    
    private static int contador = 1;
    private final int id;
    private String nome;
    private String email;

    public AmigosDAO(String nome, String email) {
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


   public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}

interface AmigosDAO {
    List<Amigo> listarTodos();
    Amigo buscarPorId(int id);
    void inserir(Amigo amigo);
    void atualizar(Amigo amigo);
    void deletar(int id);
}

class AmigoDAOImpl extends AmigosDAO {

    private Iterable<Amigo> amigos;
    
    public AmigoDAOImpl(String nome, String email) {
        super(nome, email);
    }

    public List<Amigo> listarTodos() {
        return (List<Amigo>) amigos;
    }

    public Amigo buscarPorId(int id) {
       
        for (Amigo amigo : amigos) {
            if (amigo.getId() == id) {
                return amigo;
            }
        }
        return null;
    }

    public void inserir(Amigo amigo) {
        amigos.add(amigo);
    }

    public void atualizar(Amigo amigo) {
        for (Amigo a : amigos) {
            if (a.getId().equals(amigo.getId())) {
                a.setNome(amigo.getNome());
                a.setEmail(amigo.getEmail());
                return;
            }
        }
    }

    public void deletar(int id) {
        amigos.removeIf(amigo -> amigo.getId() == id);
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmigoDAO amigoDAO = new AmigoDAOImpl();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar amigos");
            System.out.println("2 - Adicionar amigo");
            System.out.println("3 - Atualizar amigo");
            System.out.println("4 - Deletar amigo");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Lista de Amigos:");
                    List<Amigo> todosOsAmigos = amigoDAO.listarTodos();
                    for (Amigo amigo : todosOsAmigos) {
                        System.out.println(amigo.getId() + " - " + amigo.getNome() + " - " + amigo.getEmail());
                    }
                }
                case 2 -> {
                    System.out.println("Digite o nome do amigo:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o e-mail do amigo:");
                    String email = scanner.nextLine();

                    Amigo novoAmigo = new Amigo(nome, email);
                    amigoDAO.inserir(novoAmigo);
                    System.out.println("Amigo adicionado com sucesso!");
                }
                case 3 -> {
                    System.out.println("Digite o ID do amigo que deseja atualizar:");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    Amigo amigoAtualizar = amigoDAO.buscarPorId(idAtualizar);
                    if (amigoAtualizar != null) {
                        System.out.println("Digite o novo nome do amigo:");
                        String novoNome = scanner.nextLine();

                        System.out.println("Digite o novo e-mail do amigo:");
                        String novoEmail = scanner.nextLine();

                        amigoAtualizar.setNome(novoNome);
                        amigoAtualizar.setEmail(novoEmail);
                        amigoDAO.atualizar(amigoAtualizar);
                        System.out.println("Amigo atualizado com sucesso!");
                    } else {
                        System.out.println("Amigo não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.println("Digite o ID do amigo que deseja deletar:");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    amigoDAO.deletar(idDeletar);
                    System.out.println("Amigo deletado com sucesso!");
                }
                case 5 -> continuar = false;
                default -> System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private void atualizar(Amigo amigoAtualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deletar(int idDeletar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Amigo buscarPorId(int idAtualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void inserir(Amigo novoAmigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private List<Amigo> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
