package Console;

import Dominio.Esporte;
import Gerenciador.EsporteGerenciador;

import java.util.List;
import java.util.Scanner;

public class EsporteMenu {
    private EsporteGerenciador gerenciador;

    public EsporteMenu() {
        this.gerenciador = new EsporteGerenciador();
    }

    public void opções() {
        Scanner scanner = new Scanner(System.in);
        char opção = ' ';

        while (opção != 'X') {
            System.out.println("Selecione uma opção:");
            System.out.println("[ C ] Criar;");
            System.out.println("[ E ] Editar;");
            System.out.println("[ L ] Listar;");
            System.out.println("[ P ] Procurar;");
            System.out.println("[ D ] Deletar;");
            System.out.println("[ X ] Voltar;");
            System.out.print("> ");
            opção = scanner.next().charAt(0);

            switch (opção) {
                case 'C':
                    create();
                    break;
                case 'E':
                    editar();
                    break;
                case 'L':
                    listar();
                    break;
                case 'P':
                    procurar();
                    break;
                case 'D':
                    deletar();
                    break;
                case 'X':
                    System.out.println("...");
                    break;
                default:
                    System.out.println("... Opção Inválida!...");
            }
        }
    }

    public Esporte create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Esporte:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Esporte esporte = new Esporte(nome);
        return gerenciador.salvar(esporte);

    }

    public Esporte editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Esporte");
        System.out.println("Qual esporte você deseja editar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[ " + esporte.getId() + " ]: " + esporte.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();


        Esporte atualização = new Esporte(nome);

        Esporte esporteAtualizado = gerenciador.editar(id, atualização);

        if (esporteAtualizado == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporteAtualizado);
        }
        return esporteAtualizado;
    }

    private List<Esporte> listar() {

        System.out.println("Lista de Esportes:");
        List<Esporte> esportes = gerenciador.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }

        return esportes;
    }
    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Esporte:");
        System.out.println("Qual o código do esporte? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Esporte esporte = gerenciador.procurar(id);

        if (esporte == null) {
            System.out.println("Esporte não encontrado.");
        } else {
            System.out.println(esporte);
        }
    }
    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Esporte:");
        System.out.println("Qual esporte deseja deletar?");

        List<Esporte> esportes = gerenciador.listar();
        for (Esporte esporte : esportes) {
            System.out.println("[ " + esporte.getId() + " ]: " + esporte.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Esporte Deletado.");
        } else {
            System.out.println("Esporte não encontrado.");
        }

    }
}
