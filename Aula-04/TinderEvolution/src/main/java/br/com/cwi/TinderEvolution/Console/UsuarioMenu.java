package br.com.cwi.TinderEvolution.Console;

import br.com.cwi.TinderEvolution.Dominio.Usuario;
import br.com.cwi.TinderEvolution.Gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {
    public UsuarioGerenciador gerenciador;

    public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
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

    public Usuario create() {
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

        System.out.print("Foto: ");
        String foto = scanner.nextLine();


        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), latitude, longitude, biografia, foto);
        return gerenciador.cadastrar(usuario);
    }

    public Usuario editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Usuário");
        System.out.println("Qual usuário você deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[ " + usuario.getId() + " ]: " + usuario.getNome());
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

        System.out.print("Foto: ");
        String foto = scanner.nextLine();


        Usuario atualização = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), latitude, longitude, biografia,foto);


        Usuario usuarioAtualizado = gerenciador.editar(id, atualização);

        if (usuarioAtualizado == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuarioAtualizado);
        }
        return usuarioAtualizado;
    }
    private List<Usuario> listar() {

        System.out.println("Lista de Usuários:");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.print(usuario);
        }

        return usuarios;
    }
    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Usuário:");
        System.out.println("Qual o código do usuário? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
        } else {
            System.out.println(usuario);
        }
    }
    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Usuário:");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[ " + usuario.getId() + " ]: " + usuario.getNome());
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

