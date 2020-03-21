
import Lutadores.*;
import PoderesDivinosArmasMagias.Arma;
import PoderesDivinosArmasMagias.Magia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Batalha {
    public static void main(String[] args) {
        Barbaro Thor = new Barbaro("Thor", 5000,80,70);
       Guerreiro Aragorn = new Guerreiro("Aragorn",4700, 65,100);
        Mago Dumbledore = new Mago("Dumbledore", 6000,68,110,100);
       Feiticeiro Zatanna = new Feiticeiro("Zatanna", 5800, 73, 90, 90);
       Clerigo Arduin = new Clerigo("Arduin",4600,66,110,92);
       Druida Nissa = new Druida("Nissa",5500,69, 115, 98 );

        Arma Strombreaker = new Arma("Stormbreaker", 20);
        Arma Anduril = new Arma("Anduril", 15);
        Arma Galandir = new Arma("Galandir", 17);

        Magia FogoMaldito = new Magia("FogoMaldito", 16, 12,"ATAQUE_EM_AREA");
    }

}
//
//         Scanner sc = new Scanner(System.in);
//
//        List<HomensDeArmas> HomensDeArmas = new ArrayList<>();
//        List<Arcano> Arcano = new ArrayList<>();
//        List<Sacerdote> Sacerdote = new ArrayList<>();
//
//        System.out.print("Escolha quantos personagens irão participar da batalha: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//
//            System.out.println("Crie seu próprio Lutador!");
//            System.out.println("B - Bárbaro");
//            System.out.println("C - Clérigo");
//            System.out.println("D - Druida");
//            System.out.println("F - Feiticeiro");
//            System.out.println("G - Guerreiro");
//            System.out.println("M - Mago");
//            System.out.print("Digite a classe do seu Lutador: ");
//            char classe = sc.next().charAt(0);
//
//
//            System.out.print("Nome: = ");
//            String nome = sc.next();
//            System.out.print("Vida: ");
//            int vida = sc.nextInt();
//            System.out.print("Ataque: ");
//            int ataque = sc.nextInt();
//            System.out.print("Defesa: ");
//            int defesa = sc.nextInt();
//
//            int mana;
//            int fe;
//
//            switch (classe) {
//                case 'B':
//                    Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa);
//                    HomensDeArmas.add(barbaro);
//                    break;
//                case 'G':
//                    Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa);
//                    HomensDeArmas.add(guerreiro);
//
//                    break;
//                case 'F':
//                    System.out.print("Mana: ");
//                    mana = sc.nextInt();
//
//                    Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, mana);
//                    Arcano.add(feiticeiro);;
//
//                    break;
//                case 'M':
//                    System.out.print("Mana: ");
//                    mana = sc.nextInt();
//
//                    Mago mago = new Mago(nome, vida, ataque, defesa, mana);
//                    Arcano.add(mago);
//                    break;
//                case 'C':
//                    System.out.print("Fé: ");
//                    fe = sc.nextInt();
//                    Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, fe);
//                    Sacerdote.add(clerigo);
//
//                    break;
//                case 'D':
//                    System.out.print("Fé: ");
//                    fe = sc.nextInt();
//
//                    Druida druida = new Druida(nome, vida, ataque, defesa, fe);
//                    Sacerdote.add(druida);
//
//                    break;
//                default:
//                    System.out.println("Classe não existente!");
//                    break;
//            }
//        }
//        for (HomensDeArmas print1 : HomensDeArmas) {
//            System.out.println(print1);
//        }
//        for (Arcano print2 : Arcano) {
//            System.out.println(print2);
//        }
//        for (Sacerdote print3 : Sacerdote) {
//            System.out.println(print3);
//        }
//    }


