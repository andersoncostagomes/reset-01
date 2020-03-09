package exercicio3;

public class Aluno {
    String nome;
    float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;

    }

    boolean maiorOuIgual() {
        return nota >= 7.0;
    }
}
