package modelo;

import java.util.Date;

public class Emprestimo {
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataInicio;
    private Date dataFim;

    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataInicio, Date dataFim) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
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
        this.amigo = amigo;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Emprestimo [id=" + id + ", amigo=" + amigo.getNome() + ", ferramenta=" + ferramenta.getNome() + 
               ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
    }
}

//teste