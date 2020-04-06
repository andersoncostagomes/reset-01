package br.com.cwi.TinderEvolution.Console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        UsuárioMenu usuárioMenu = new UsuárioMenu();
        FilmeMenu filmeMenu = new FilmeMenu();
        SérieMenu sérieMenu = new SérieMenu();
        JogoMenu jogoMenu = new JogoMenu();
        EsporteMenu esporteMenu = new EsporteMenu();
        CuriosidadeMenu curiosidadeMenu = new CuriosidadeMenu();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ U ] Usuários");
            System.out.println("[ M ] Músicas");
            System.out.println("[ F ] Filmes");
            System.out.println("[ S ] Séries");
            System.out.println("[ J ] Jogos");
            System.out.println("[ E ] Esportes");
            System.out.println("[ C ] Curiosidades");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'U':
                    usuárioMenu.opções();
                    break;

                case 'M':
                    musicaMenu.opções();
                    break;

                case 'F':
                    filmeMenu.opções();
                    break;

                case 'S':
                    sérieMenu.opções();
                    break;

                case 'J':
                    jogoMenu.opções();
                    break;

                case 'E':
                    esporteMenu.opções();
                    break;

                case 'C':
                    curiosidadeMenu.opções();
                    break;

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

}
