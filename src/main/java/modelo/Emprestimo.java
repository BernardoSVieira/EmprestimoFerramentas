package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

// Classe que representa um empréstimo de ferramenta para um amigo
public class Emprestimo {
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataInicio;
    private Date dataFim;

    // Construtor da classe Emprestimo
    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataInicio, Date dataFim) {
        this.id = id;
        // Verifica se amigo e ferramenta não são nulos
        this.amigo = Objects.requireNonNull(amigo, "Amigo não pode ser nulo");
        this.ferramenta = Objects.requireNonNull(ferramenta, "Ferramenta não pode ser nula");
        // Verifica se as datas de início e fim são válidas
        if (dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("Datas não podem ser nulas");
        }
        if (dataFim.before(dataInicio)) {
            throw new IllegalArgumentException("Data de fim não pode ser antes da data de início");
        }
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Métodos para obter e definir o ID do empréstimo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos para obter e definir o amigo do empréstimo
    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = Objects.requireNonNull(amigo, "Amigo não pode ser nulo");
    }

    // Métodos para obter e definir a ferramenta do empréstimo
    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = Objects.requireNonNull(ferramenta, "Ferramenta não pode ser nula");
    }

    // Métodos para obter e definir a data de início do empréstimo
    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("Data de início não pode ser nula");
        }
        this.dataInicio = dataInicio;
    }

    // Métodos para obter e definir a data de término do empréstimo
    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        if (dataFim == null) {
            throw new IllegalArgumentException("Data de fim não pode ser nula");
        }
        if (dataFim.before(this.dataInicio)) {
            throw new IllegalArgumentException("Data de fim não pode ser antes da data de início");
        }
        this.dataFim = dataFim;
    }
    
    // Método que retorna uma representação em string do empréstimo
    @Override
    public String toString() {
        // Formata as datas para exibição
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Retorna uma representação formatada do empréstimo
        return "Emprestimo [id=" + id + ", amigo=" + amigo.getNome() + ", ferramenta=" + ferramenta.getNome() + 
               ", dataInicio=" + sdf.format(dataInicio) + ", dataFim=" + sdf.format(dataFim) + "]";
    }
}
