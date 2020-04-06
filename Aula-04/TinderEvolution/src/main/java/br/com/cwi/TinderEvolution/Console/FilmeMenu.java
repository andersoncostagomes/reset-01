package br.com.cwi.TinderEvolution.Console;

import br.com.cwi.TinderEvolution.Dominio.CategoriaFilme;
import br.com.cwi.TinderEvolution.Dominio.Filme;
import br.com.cwi.TinderEvolution.Gerenciador.FilmeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FilmeMenu {
    private FilmeGerenciador gerenciador;

    public FilmeMenu() {
        this.gerenciador = new FilmeGerenciador();
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

    public Filme create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Filme:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.print("Categoria: ");
        System.out.println("[ D ] DRAMA;");
        System.out.println("[ C ] COMEDIA;");
        System.out.println("[ S ] SUSPENSE;");
        System.out.println("[ T ] TERROR;");
        System.out.println("[ A ] AÇÃO;");
        System.out.println("[ M ] MUSICAL;");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "D":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "C":
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "T":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "A":
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.next();

        Filme filme = new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse );
        return gerenciador.salvar(filme);

    }

    public Filme editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Filme");
        System.out.println("Qual filme você deseja editar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[ " + filme.getId() + " ]: " + filme.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Artista: ");
        String artista = scanner.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = scanner.nextInt();

        System.out.print("Mês de Lançamento: ");
        int mes = scanner.nextInt();

        System.out.print("Dia de Lançamento: ");
        int dia = scanner.nextInt();

        System.out.println("Categoria: ");
        System.out.println("[ D ] DRAMA");
        System.out.println("[ C ] COMEDIA");
        System.out.println("[ S ] SUSPENSE");
        System.out.println("[ T ] TERROR");
        System.out.println("[ A ] ACAO");
        System.out.println("[ M ] MUSICAL");
        System.out.print("> ");
        String categoria = scanner.next();

        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case "D":
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case "C":
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case "S":
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case "T":
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case "A":
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case "M":
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
        }
        System.out.print("Sinopse: ");
        String sinopse = scanner.next();

        Filme atualização = new Filme(nome, artista, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);

        Filme filmeAtualizado = gerenciador.editar(id, atualização);

        if (filmeAtualizado == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filmeAtualizado);
        }
        return filmeAtualizado;
    }

    private List<Filme> listar() {

        System.out.println("Lista de Filmes:");
        List<Filme> filmes = gerenciador.listar();

        for (Filme filme : filmes) {
            System.out.println(filme);
        }

        return filmes;
    }
    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Filme:");
        System.out.println("Qual o código do filme? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Filme filme = gerenciador.procurar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }
    }
    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Filme:");
        System.out.println("Qual filme deseja deletar?");

        List<Filme> filmes = gerenciador.listar();
        for (Filme filme : filmes) {
            System.out.println("[ " + filme.getId() + " ]: " + filme.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Filme Deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }

    }

}
