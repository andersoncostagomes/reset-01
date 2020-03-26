package Console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        MusicaMenu musicaMenu = new MusicaMenu();
        UsuárioMenu usuárioMenu = new UsuárioMenu();

        Scanner scanner = new Scanner(System.in);
        char opcao = ' ';

        while (opcao != 'X') {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ U ] Usuários");
            System.out.println("[ M ] Músicas");
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

                case 'X':
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

}
