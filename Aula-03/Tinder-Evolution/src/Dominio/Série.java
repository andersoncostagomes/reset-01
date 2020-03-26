package Dominio;

import java.time.LocalDate;

public class Série {
    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLançamento;
    private int numeroTemporadas;
    private int numeroEpisódios;
    private CategoriaSérie categoriaSérie;
    private String sinopse;

    public Série(String nome, String diretor, LocalDate dataDeLançamento, int numeroTemporadas, int numeroEpisódios, CategoriaSérie categoriaSérie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLançamento = dataDeLançamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisódios = numeroEpisódios;
        this.categoriaSérie = categoriaSérie;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataDeLançamento() {
        return dataDeLançamento;
    }

    public void setDataDeLançamento(LocalDate dataDeLançamento) {
        this.dataDeLançamento = dataDeLançamento;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisódios() {
        return numeroEpisódios;
    }

    public void setNumeroEpisódios(int numeroEpisódios) {
        this.numeroEpisódios = numeroEpisódios;
    }

    public CategoriaSérie getCategoriaSérie() {
        return categoriaSérie;
    }

    public void setCategoria(CategoriaSérie categoriaSérie) {
        this.categoriaSérie = categoriaSérie;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    @Override
    public String toString(){
        return "Série { " +
                "id: " + id +
                ", Nome: " + nome +
                ", Diretor: " + diretor +
                ", Data de lançamento: " + dataDeLançamento +
                ", Possui: " + numeroTemporadas + "temporadas, com " + numeroEpisódios + " episódios cada " +
                ", Categoria: " + categoriaSérie +
                ", Sinopse: \n" + sinopse + " }";
    }
}
