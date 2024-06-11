package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe responsável por controlar os empréstimos
public class ControleEmprestimo {
    // Lista de empréstimos
    private final List<Emprestimo> emprestimos;

    // Construtor que inicializa a lista de empréstimos
    public ControleEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    // Método para adicionar um novo empréstimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo != null) {
            emprestimos.add(emprestimo);
        } else {
            throw new IllegalArgumentException("Empréstimo não pode ser nulo");
        }
    }

    // Método para encerrar um empréstimo pelo ID
    public void encerrarEmprestimo(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                emprestimo.setDataFim(new Date());
                return;
            }
        }
        throw new IllegalArgumentException("Empréstimo não encontrado");
    }

    // Método para buscar empréstimos por amigo
    public List<Emprestimo> buscarEmprestimosPorAmigo(Amigo amigo) {
        List<Emprestimo> resultados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getAmigo().equals(amigo)) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    // Método para buscar empréstimos por ferramenta
    public List<Emprestimo> buscarEmprestimosPorFerramenta(Ferramenta ferramenta) {
        List<Emprestimo> resultados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getFerramenta().equals(ferramenta)) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    // Método para listar todos os empréstimos
    public List<Emprestimo> listarTodosEmprestimos() {
        return new ArrayList<>(emprestimos);
    }

    // Método para listar os empréstimos ativos
    public List<Emprestimo> listarEmprestimosAtivos() {
        List<Emprestimo> ativos = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataFim().after(new Date())) {
                ativos.add(emprestimo);
            }
        }
        return ativos;
    }
}
