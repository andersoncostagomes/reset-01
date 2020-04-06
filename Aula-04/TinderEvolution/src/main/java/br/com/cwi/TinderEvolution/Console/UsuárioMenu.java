package br.com.cwi.TinderEvolution.Console;

import br.com.cwi.TinderEvolution.Dominio.Usuário;
import br.com.cwi.TinderEvolution.Gerenciador.UsuárioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuárioMenu {
    public UsuárioGerenciador gerenciador;

    public UsuárioMenu() {
        this.gerenciador = new UsuárioGerenciador();
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

    public Usuário create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Usuário:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Latitude: ");
        double latitude = scanner.nextDouble();

        System.out.print("Longitude: ");
        double longitude = scanner.nextDouble();

        System.out.print("Biografia: ");
        String biografia = scanner.next();


        Usuário usuário = new Usuário(nome, email, telefone, LocalDate.of(ano, mes, dia), latitude, longitude, biografia);
        return gerenciador.cadastrar(usuário);
    }

    public Usuário editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Usuário");
        System.out.println("Qual usuário você deseja editar?");

        List<Usuário> usuários = gerenciador.listar();
        for (Usuário usuário : usuários) {
            System.out.println("[ " + usuário.getId() + " ]: " + usuário.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Ano de Nascimento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Latitude: ");
        double latitude = scanner.nextDouble();

        System.out.print("Longitude: ");
        double longitude = scanner.nextDouble();

        System.out.print("Biografia: ");
        String biografia = scanner.nextLine();


        Usuário atualização = new Usuário(nome, email, telefone, LocalDate.of(ano, mes, dia), latitude, longitude, biografia);


        Usuário usuárioAtualizado = gerenciador.editar(id, atualização);

        if (usuárioAtualizado == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuárioAtualizado);
        }
        return usuárioAtualizado;
    }
    private List<Usuário> listar() {

        System.out.println("Lista de Usuários:");
        List<Usuário> usuários = gerenciador.listar();

        for (Usuário usuário : usuários) {
            System.out.print(usuário);
        }

        return usuários;
    }
    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Usuário:");
        System.out.println("Qual o código do usuário? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Usuário usuário = gerenciador.procurar(id);

        if (usuário == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuário);
        }
    }
    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Usuário:");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuário> usuários = gerenciador.listar();
        for (Usuário usuário : usuários) {
            System.out.println("[ " + usuário.getId() + " ]: " + usuário.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Usuário Deletadao.");
        } else {
            System.out.println("Usuário não encontrado.");
        }

    }

}

