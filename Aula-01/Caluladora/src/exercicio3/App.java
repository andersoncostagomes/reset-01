package exercicio3;

public class App {
    public static void main(String[] args) {
        Aluno Rafael = new Aluno("Rafael",6.5f); //

        System.out.println("O aluno: " + Rafael.nome);
        System.out.println("Possui a nota: " + Rafael.nota);
        System.out.println("Está aprovado? " + Rafael.maiorOuIgual());

        Aluno Daniele = new Aluno("Daniele", 10);
        System.out.println("O aluno: " + Daniele.nome);
        System.out.println(" Possui a nota: " + Daniele.nota);
        System.out.println(" Está aprovado? " + Daniele.maiorOuIgual());

    }
}
