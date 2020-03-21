package exercicio2;

public class Livro {
    public String titulo;
    public String autor;
    public Categoria categoria;
    public Status status;

    public Livro(String titulo, String autor, Categoria categoria, Status status) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }
}
