import java.util.Scanner;

public class Aula2Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie seu próprio Veículo!");
        System.out.println("Digite o Tipo de Veículo: ");
        System.out.println("N - Navio");
        System.out.println("c - Carro");
        System.out.println("C - Caminão");
        System.out.println("B - Bicicleta");
        System.out.println("T - Trem");
        System.out.println("A - Avião");
        System.out.println("S - Submarino");

        char tipo = sc.next().charAt(0);
        System.out.print("Nome: ");
        String Nome = sc.next();
        System.out.println("Velocidade Máxima: =");
        double velocidadeMaxima = sc.nextDouble();


        switch (tipo){
            case 'N':
                Navio navio = new Navio();
                //navio
                break;
            case 'c':
                //carro
                break;
            default:
                ///tipo inv..
                break;
        }


        sc.close();

    }
}
