public class Evento {
    private String nome;
    private Date data;
    private String organizador;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Evento(String nome, Date data, String organizador) {
        this.nome = nome;
        this.data = data;
        this.organizador = organizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOrganizador() {
        return organizador;
    }

    public String getDataFormatada() {
        return dateFormat.format(data);
    }
}
