package calculadorapagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

    public static void main(String[] args) {

        System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");

        int opcao = 0;

        List<Funcionario> funcionarioList = new ArrayList<>();
        while (opcao != 9) {
            imprimeMenu();
            opcao = lerInteiro();

            System.out.print("Nome: = ");
            String nome = sc.next();
            System.out.print("CPF: ");
            String cpf = sc.next();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            int numeroCertificacaoes;
            double lucroUltimoAno;

            if (opcao == 1) {
               Engenheiro eng = new Engenheiro(nome,cpf,salario);
               funcionarioList.add(new Engenheiro(nome,cpf,salario));
            } else if (opcao == 2) {
                System.out.print("Número de Certificações: ");
                numeroCertificacaoes = sc.nextInt();

                Programador prog = new Programador(nome,cpf,salario,numeroCertificacaoes);
                funcionarioList.add(new Programador(nome,cpf,salario,numeroCertificacaoes));
                // Cadastra Programador
            } else if (opcao == 3) {
                System.out.print("Número de Certificações: ");
                lucroUltimoAno = sc.nextDouble();

                Gerente ger = new Gerente(nome,cpf,salario,lucroUltimoAno);
                funcionarioList.add(new Gerente(nome,cpf,salario,lucroUltimoAno));

            } else {
                System.out.println("----------- Opção invalida               -----------");
            }
        }
        // Calculo da folha mensal

    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void imprimeMenu() {
        System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
        System.out.println("----------- 2 - Cadastro Programador             -----------");
        System.out.println("----------- 3 - Cadastro Gerente                 -----------");
        System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
    }
}
