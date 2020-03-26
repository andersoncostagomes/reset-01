package Console;

import Dominio.CategoriaJogo;
import Dominio.Jogo;
import Dominio.PlataformaJogo;
import Gerenciador.JogoGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class JogoMenu {
    private JogoGerenciador gerenciador;

    public JogoMenu() {
        this.gerenciador = new JogoGerenciador();
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

    public Jogo create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Jogo:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();

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

        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case "D":
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case "C":
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case "S":
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case "T":
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case "A":
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case "M":
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
        }

            System.out.print("Plataforma: ");
            System.out.println("[ X ] Xbox;");
            System.out.println("[ P ] PS4;");
            System.out.println("[ C ] PC;");
            System.out.println("[ S ] SNES;");
            System.out.println("> ");
            String plataforma = scanner.next();

            PlataformaJogo plataformaJogo;
            switch (plataforma) {
                case "X":
                    plataformaJogo = PlataformaJogo.XBOX;
                    break;
                case "P":
                    plataformaJogo = PlataformaJogo.PS4;
                    break;
                case "C":
                    plataformaJogo = PlataformaJogo.PC;
                    break;
                case "S":
                    plataformaJogo = PlataformaJogo.SNES;
                    break;
                default:
                    plataformaJogo = PlataformaJogo.XBOX;
                    break;
            }

            Jogo jogo = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);
            return gerenciador.salvar(jogo);

        }

        public Jogo editar () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Edição de Jogo");
            System.out.println("Qual jogo você deseja editar?");

            List<Jogo> jogos = gerenciador.listar();
            for (Jogo jogo : jogos) {
                System.out.println("[ " + jogo.getId() + " ]: " + jogo.getNome());
            }
            System.out.println("> ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();

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

            CategoriaJogo categoriaJogo;
            switch (categoria) {
                case "D":
                    categoriaJogo = CategoriaJogo.DRAMA;
                    break;
                case "C":
                    categoriaJogo = CategoriaJogo.COMEDIA;
                    break;
                case "S":
                    categoriaJogo = CategoriaJogo.SUSPENSE;
                    break;
                case "T":
                    categoriaJogo = CategoriaJogo.TERROR;
                    break;
                case "A":
                    categoriaJogo = CategoriaJogo.ACAO;
                    break;
                case "M":
                    categoriaJogo = CategoriaJogo.MUSICAL;
                    break;
                default:
                    categoriaJogo = CategoriaJogo.DRAMA;
                    break;
            }

                System.out.print("Plataforma: ");
                System.out.println("[ X ] Xbox;");
                System.out.println("[ P ] PS4;");
                System.out.println("[ C ] PC;");
                System.out.println("[ S ] SNES;");
                System.out.println("> ");
                String plataforma = scanner.next();

                PlataformaJogo plataformaJogo;
                switch (plataforma) {
                    case "X":
                        plataformaJogo = PlataformaJogo.XBOX;
                        break;
                    case "P":
                        plataformaJogo = PlataformaJogo.PS4;
                        break;
                    case "C":
                        plataformaJogo = PlataformaJogo.PC;
                        break;
                    case "S":
                        plataformaJogo = PlataformaJogo.SNES;
                        break;
                    default:
                        plataformaJogo = PlataformaJogo.XBOX;
                        break;
                }

                Jogo atualização = new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);

                Jogo jogoAtualizado = gerenciador.editar(id, atualização);

                if (jogoAtualizado == null) {
                    System.out.println("Jogo não encontrado.");
                } else {
                    System.out.println(jogoAtualizado);
                }
                return jogoAtualizado;
            }

            private List<Jogo> listar () {

                System.out.println("Lista de Jogos:");
                List<Jogo> jogos = gerenciador.listar();

                for (Jogo jogo : jogos) {
                    System.out.println(jogo);
                }

                return jogos;
            }
            private void procurar () {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Pesquisa de Jogo:");
                System.out.println("Qual o código do jogo? ");

                System.out.print("> ");
                int id = scanner.nextInt();

                Jogo jogo = gerenciador.procurar(id);

                if (jogo == null) {
                    System.out.println("Jogo não encontrado.");
                } else {
                    System.out.println(jogo);
                }
            }
            private void deletar () {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Deletando Jogo:");
                System.out.println("Qual jogo deseja deletar?");

                List<Jogo> jogos = gerenciador.listar();
                for (Jogo jogo : jogos) {
                    System.out.println("[ " + jogo.getId() + " ]: " + jogo.getNome());
                }

                System.out.print("> ");
                int id = scanner.nextInt();

                if (gerenciador.deletar(id)) {
                    System.out.println("Jogo Deletado.");
                } else {
                    System.out.println("Jogo não encontrado.");
                }

            }
        }