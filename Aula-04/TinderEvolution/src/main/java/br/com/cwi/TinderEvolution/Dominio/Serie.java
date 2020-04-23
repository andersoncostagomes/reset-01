package br.com.cwi.TinderEvolution.Dominio;

import java.time.LocalDate;

public class Serie {
    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLancamento;
    private int numeroTemporadas;
    private int numeroEpisodios;
    private CategoriaSerie categoriaSerie;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate dataDeLancamento, int numeroTemporadas, int numeroEpisodios, CategoriaSerie categoriaSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLancamento = dataDeLancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
        this.categoriaSerie = categoriaSerie;
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
        return dataDeLancamento;
    }

    public void setDataDeLançamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisódios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisódios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public CategoriaSerie getCategoriaSerie() {
        return categoriaSerie;
    }

    public void setCategoriaSerie(CategoriaSerie categoriaSerie) {
        this.categoriaSerie = categoriaSerie;
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
                ", Data de lançamento: " + dataDeLancamento +
                ", Possui: " + numeroTemporadas + "temporadas, com " + numeroEpisodios + " episódios cada " +
                ", Categoria: " + categoriaSerie +
                ", Sinopse: \n" + sinopse + " }";
    }
}
