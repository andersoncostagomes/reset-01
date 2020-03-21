package Lutadores;

public class Druida extends Sacerdote {

    public Druida(String nome, int vida, int ataque, int defesa, int fe) {
        super(nome, vida, ataque, defesa, fe);
    }

    public String toString(){
        return("Nome = "+ nome + " Classe = Clérigo, Vida = " + vida + ", Ataque = " + ataque + ", Defesa = " + defesa + ", Fé = " + fe);
    }
}
