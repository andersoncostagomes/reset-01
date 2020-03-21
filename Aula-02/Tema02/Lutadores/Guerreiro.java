package Lutadores;

public class Guerreiro extends HomensDeArmas {

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public String toString(){

        return("Nome = "+ nome + " Classe = Guerreiro, Vida = " + vida + ", Ataque = " + ataque + ", Defesa = " + defesa);    }
}

