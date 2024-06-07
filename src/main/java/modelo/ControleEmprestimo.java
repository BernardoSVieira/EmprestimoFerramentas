package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControleEmprestimo{
    private final List<Emprestimo> emprestimos;

    public ControleEmprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    // Adiciona um novo emprestimo
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo != null) {
            emprestimos.add(emprestimo);
        } else {
            throw new IllegalArgumentException("Empréstimo não pode ser nulo");
        }
    }

    // termina um emprestimo pelo ID
    public void encerrarEmprestimo(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                emprestimo.setDataFim(new Date());
                return;
            }
        }
        throw new IllegalArgumentException("Empréstimo não encontrado");
    }

    // busca emprestimos por amigo
    public List<Emprestimo> buscarEmprestimosPorAmigo(Amigo amigo) {
        List<Emprestimo> resultados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getAmigo().equals(amigo)) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
    }

    // busca emprestimos por ferramenta
    public List<Emprestimo> buscarEmprestimosPorFerramenta(Ferramenta ferramenta) {
        List<Emprestimo> resultados = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getFerramenta().equals(ferramenta)) {
                resultados.add(emprestimo);
            }
        }
        return resultados;
        }

    // mostra todos os emprestimos
    public List<Emprestimo> listarTodosEmprestimos() {
        return new ArrayList<>(emprestimos);
    }

    // mostra emprestimos ativos
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