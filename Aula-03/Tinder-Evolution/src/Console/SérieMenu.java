package Console;

import Dominio.CategoriaSérie;
import Dominio.Série;
import Gerenciador.SérieGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class SérieMenu {
    private SérieGerenciador gerenciador;

    public SérieMenu() {
        this.gerenciador = new SérieGerenciador();
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

    public Série create() {
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

        CategoriaSérie categoriaSérie;
        switch (categoria) {
            case "D":
                categoriaSérie = CategoriaSérie.DRAMA;
                break;
            case "C":
                categoriaSérie = CategoriaSérie.COMEDIA;
                break;
            case "S":
                categoriaSérie = CategoriaSérie.SUSPENSE;
                break;
            case "T":
                categoriaSérie = CategoriaSérie.TERROR;
                break;
            case "A":
                categoriaSérie = CategoriaSérie.ACAO;
                break;
            case "M":
                categoriaSérie = CategoriaSérie.SITCOM;
                break;
            default:
                categoriaSérie = CategoriaSérie.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.next();

        Série série = new Série(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisódios, categoriaSérie, sinopse);
        return gerenciador.salvar(série);

    }

    public Série editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Série");
        System.out.println("Qual série você deseja editar?");

        List<Série> séries = gerenciador.listar();
        for (Série série : séries) {
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

        CategoriaSérie categoriaSérie;
        switch (categoria) {
            case "D":
                categoriaSérie = CategoriaSérie.DRAMA;
                break;
            case "C":
                categoriaSérie = CategoriaSérie.COMEDIA;
                break;
            case "S":
                categoriaSérie = CategoriaSérie.SUSPENSE;
                break;
            case "T":
                categoriaSérie = CategoriaSérie.TERROR;
                break;
            case "A":
                categoriaSérie = CategoriaSérie.ACAO;
                break;
            case "M":
                categoriaSérie = CategoriaSérie.SITCOM;
                break;
            default:
                categoriaSérie = CategoriaSérie.DRAMA;
                break;
        }

        System.out.print("Sinopse: ");
        String sinopse = scanner.next();


        Série atualização = new Série(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporadas, numeroEpisódios, categoriaSérie, sinopse);

        Série sérieAtualizada = gerenciador.editar(id, atualização);

        if (sérieAtualizada == null) {
            System.out.println("Série não encontrada.");
        } else {
            System.out.println(sérieAtualizada);
        }
        return sérieAtualizada;
    }

    private List<Série> listar() {

        System.out.println("Lista de Séries:");
        List<Série> séries = gerenciador.listar();

        for (Série série : séries) {
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

        Série série = gerenciador.procurar(id);

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

        List<Série> séries = gerenciador.listar();
        for (Série série : séries) {
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
