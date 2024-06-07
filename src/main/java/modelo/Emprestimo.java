package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Emprestimo {
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataInicio;
    private Date dataFim;

    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataInicio, Date dataFim) {
        this.id = id;
        this.amigo = Objects.requireNonNull(amigo, "Amigo não pode ser nulo");
        this.ferramenta = Objects.requireNonNull(ferramenta, "Ferramenta não pode ser nula");
        if (dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("Datas não podem ser nulas");
        }
        if (dataFim.before(dataInicio)) {
            throw new IllegalArgumentException("Data de fim não pode ser antes da data de início");
        }
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = Objects.requireNonNull(amigo, "Amigo não pode ser nulo");
    }
    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = Objects.requireNonNull(ferramenta, "Ferramenta não pode ser nula");
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("Data de início não pode ser nula");
        }
        this.dataInicio = dataInicio;
    }

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
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Emprestimo [id=" + id + ", amigo=" + amigo.getNome() + ", ferramenta=" + ferramenta.getNome() + 
               ", dataInicio=" + sdf.format(dataInicio) + ", dataFim=" + sdf.format(dataFim) + "]";
    }
} 