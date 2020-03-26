package Dominio;

import java.time.LocalDate;

public class Jogo {
    private int id;
    private String nome;
    private String publisher;
    private LocalDate dataDeLançamento;
    private CategoriaJogo categoriaJogo;
    private PlataformaJogo plataformaJogo;

    public Jogo(String nome, String publisher, LocalDate dataDeLançamento, CategoriaJogo categoriaJogo, PlataformaJogo plataformaJogo) {
        this.nome = nome;
        this.publisher = publisher;
        this.dataDeLançamento = dataDeLançamento;
        this.categoriaJogo = categoriaJogo;
        this.plataformaJogo = plataformaJogo;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDataDeLançamento() {
        return dataDeLançamento;
    }

    public void setDataDeLançamento(LocalDate dataDeLançamento) {
        this.dataDeLançamento = dataDeLançamento;
    }

    public CategoriaJogo getCategoriaJogo() {
        return categoriaJogo;
    }

    public void setCategoriaJogo(CategoriaJogo categoriaJogo) {
        this.categoriaJogo = categoriaJogo;
    }

    public PlataformaJogo getPlataformaJogo() {
        return plataformaJogo;
    }

    public void setPlataformaJogo(PlataformaJogo plataformaJogo) {
        this.plataformaJogo = plataformaJogo;
    }
    @Override
    public String toString(){
        return "Jogo { " +
                "id: " + id +
                ", Nome: " + nome +
                ", Publisher: " + publisher +
                ", Data de lançamento: " + dataDeLançamento +
                ", Categoria: " + categoriaJogo +
                ", Plataforma: " + plataformaJogo + " }";
    }
}
