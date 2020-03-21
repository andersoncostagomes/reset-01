package exercicio2;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "J. K. Rowling", Categoria.FANTASIA, Status.DISPONIVEL);
        Livro livro2 = new Livro("Um Amor para Recordar", "Nicolas Sparks", Categoria.ROMANCE, Status.DISPONIVEL);
        Livro livro3 = new Livro("Drácula", "Bram Stoker", Categoria.TERROR, Status.EM_USO);
        Livro livro4 = new Livro("O Homem de Giz", "J. C. Tudor", Categoria.SUSPENSE, Status.EMPRESTADO);


        System.out.println( livro1.categoria.getDescricao() + " - " + livro1.titulo + " ( " + livro1.autor +" ): " + livro1.status.getDescricao());
        System.out.println( livro2.categoria.getDescricao() + " - " + livro2.titulo + " ( " + livro2.autor +" ): " + livro2.status.getDescricao());
        System.out.println( livro3.categoria.getDescricao() + " - " + livro3.titulo + " ( " + livro3.autor +" ): " + livro3.status.getDescricao());
        System.out.println( livro4.categoria.getDescricao() + " - " + livro4.titulo + " ( " + livro4.autor +" ): " + livro4.status.getDescricao());
    }
}
