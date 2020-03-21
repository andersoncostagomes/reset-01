package Lutadores;

public class Mago extends Arcano{

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    public String toString(){
        return("Nome = "+ getNome() + " Classe = Mago, Vida = " + getVida() + ", Ataque = " + getAtaque() + ", Defesa = " + getDefesa() + ", Mana = " + mana);
    }
}
