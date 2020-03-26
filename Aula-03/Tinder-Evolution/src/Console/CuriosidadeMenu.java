package Console;

import Dominio.CategoriaCuriosidade;
import Dominio.Curiosidade;
import Gerenciador.CuriosidadeGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CuriosidadeMenu {
    private CuriosidadeGerenciador gerenciador;

    public CuriosidadeMenu() {
        this.gerenciador = new CuriosidadeGerenciador();
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

    public Curiosidade create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criação de Curiosidade:");

        System.out.print("Categoria: ");
        System.out.println("[ C ] COMPORTAMENTO;");
        System.out.println("[ E ] EVENTO;");
        System.out.println("[ A ] APARENCIA;");
        System.out.println("[ F ] ALIMENTAÇÃO;");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "C":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "E":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case "A":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "F":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }
        System.out.print("Descrição: ");
        String descrição = scanner.next();

        Curiosidade curiosidade = new Curiosidade(categoriaCuriosidade, descrição);
        return gerenciador.salvar(curiosidade);

    }

    public Curiosidade editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edição de Curiosidade");
        System.out.println("Qual curiosidade você deseja editar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[ " + curiosidade.getId() + " ]: " + curiosidade.getDescrição());
        }
        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Categoria: ");
        System.out.println("[ C ] COMPORTAMENTO;");
        System.out.println("[ E ] EVENTO;");
        System.out.println("[ A ] APARENCIA;");
        System.out.println("[ F ] ALIMENTAÇÃO;");
        System.out.println("> ");
        String categoria = scanner.next();

        CategoriaCuriosidade categoriaCuriosidade;
        switch (categoria) {
            case "C":
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case "E":
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case "A":
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case "F":
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
        }
        System.out.print("Descrição: ");
        String descrição = scanner.next();

        Curiosidade atualização = new Curiosidade(categoriaCuriosidade, descrição);

        Curiosidade curiosidadeAtualizada = gerenciador.editar(id, atualização);

        if (curiosidadeAtualizada == null) {
            System.out.println("Categoria não encontrada.");
        } else {
            System.out.println(curiosidadeAtualizada);
        }
        return curiosidadeAtualizada;
    }

    private List<Curiosidade> listar() {

        System.out.println("Lista de Curiosidades:");
        List<Curiosidade> curiosidades = gerenciador.listar();

        for (Curiosidade curiosidade : curiosidades) {
            System.out.println(curiosidade);
        }

        return curiosidades;
    }
    private void procurar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisa de Curiosidade:");
        System.out.println("Qual o código da curiosidade? ");

        System.out.print("> ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = gerenciador.procurar(id);

        if (curiosidade == null) {
            System.out.println("Curiosidade não encontrada.");
        } else {
            System.out.println(curiosidade);
        }
    }
    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletando Categoria:");
        System.out.println("Qual curiosidade deseja deletar?");

        List<Curiosidade> curiosidades = gerenciador.listar();
        for (Curiosidade curiosidade : curiosidades) {
            System.out.println("[ " + curiosidade.getId() + " ]: " + curiosidade.getDescrição());
        }

        System.out.print("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Curiosidade Deletada.");
        } else {
            System.out.println("Curiosidade não encontrada.");
        }

    }
}
