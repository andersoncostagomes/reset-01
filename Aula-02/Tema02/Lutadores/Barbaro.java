package Lutadores;

public class Barbaro extends HomensDeArmas {

    public Barbaro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }


    public String toString(){
        return("Nome = "+ nome + " Classe = Bárbaro, Vida = " + vida + ", Ataque = " + ataque + ", Defesa = " + defesa);
    }
}

