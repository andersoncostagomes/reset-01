package br.com.cwi.TinderEvolution.Console;

import br.com.cwi.TinderEvolution.Dominio.CategoriaSerie;
import br.com.cwi.TinderEvolution.Dominio.Serie;
import br.com.cwi.TinderEvolution.Gerenciador.SerieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SerieMenu {
    private SerieGerenciador gerenciador;

    public SerieMenu() {
        this.gerenciador = new SerieGerenciador();
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

    public Serie create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Série:");

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

        System.out.print("Número de Temporadas: ");
        int numeroTemporadas = scanner.nextInt();

        System.out.print("Número de Episódios: ");
        int numeroEpisódios = scanner.nextInt();

        System.out.print("Categoria: ");
        System.out.println("[ D ] DRAMA;");
        System.out.println("[ C ] COMEDIA;");
        System.out.println("[ S ] SUSPENSE;");
        System.out.println("[ T ] TERROR;");
        System.out.println("[ A ] AÇÃO;");
        System.out.println("[ M ] SITCOM;");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "M":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.next();

        Serie série = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisódios, categoriaSerie, sinopse);
        return gerenciador.salvar(série);

    }

    public Serie editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Série");
        System.out.println("Qual série você deseja editar?");

        List<Serie> séries = gerenciador.listar();
        for (Serie série : séries) {
            System.out.println("[ " + série.getId() + " ]: " + série.getNome());
        }
        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

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

        System.out.print("Número de Temporadas: ");
        int numeroTemporadas = scanner.nextInt();

        System.out.print("Número de Episódios: ");
        int numeroEpisódios = scanner.nextInt();

        System.out.print("Categoria: ");
        System.out.println("[ D ] DRAMA;");
        System.out.println("[ C ] COMEDIA;");
        System.out.println("[ S ] SUSPENSE;");
        System.out.println("[ T ] TERROR;");
        System.out.println("[ A ] AÇÃO;");
        System.out.println("[ M ] SITCOM;");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaSerie categoriaSerie;
        switch (categoria) {
            case "D":
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case "C":
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case "S":
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case "T":
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case "A":
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case "M":
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.next();


        Serie atualização = new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisódios, categoriaSerie, sinopse);

        Serie sérieAtualizada = gerenciador.editar(id, atualização);

        if (sérieAtualizada == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(sérieAtualizada);
        }
        return sérieAtualizada;
    }

    private List<Serie> listar() {

        System.out.println("Lista de Séries:");
        List<Serie> séries = gerenciador.listar();

        for (Serie série : séries) {
            System.out.println(série);
        }

        return séries;
    }

    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Série:");
        System.out.println("Qual o código da série? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Serie série = gerenciador.procurar(id);

        if (série == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(série);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Série:");
        System.out.println("Qual série deseja deletar?");

        List<Serie> séries = gerenciador.listar();
        for (Serie série : séries) {
            System.out.println("[ " + série.getId() + " ]: " + série.getNome());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Série Deletada.");
        } else {
            System.out.println("Série não encontrada.");
        }

    }
}
