package Lutadores;

public class Feiticeiro extends Arcano {

    public Feiticeiro(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    public String toString(){
        return("Nome = "+ nome + " Classe = Feiticeiro, Vida = " + vida + ", Ataque = " + ataque + ", Defesa = " + defesa + ", Mana = " + mana);
    }
}
