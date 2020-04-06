package br.com.cwi.TinderEvolution.Dominio;

import java.time.LocalDate;

public class Filme {
    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataDeLançamento;
    private CategoriaFilme categoriaFilme;
    private String sinopse;

    public Filme(String nome, String diretor, LocalDate dataDeLançamento, CategoriaFilme categoriaFilme, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataDeLançamento = dataDeLançamento;
        this.categoriaFilme = categoriaFilme;
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

    public CategoriaFilme getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(CategoriaFilme categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    @Override
    public String toString(){
        return "Filme { " +
                "id: " + id +
                ", Nome: " + nome +
                ", Diretor: " + diretor +
                ", Data de lançamento: " + dataDeLançamento +
                ", Categoria: " + categoriaFilme +
                ", Sinopse: \n" + sinopse + " }";
    }

}
