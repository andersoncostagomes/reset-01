package Lutadores;

public class Clerigo extends Sacerdote{

    public Clerigo(String nome, int vida, int ataque, int defesa, int fe) {

        super(nome, vida, ataque, defesa, fe);
    }

    public String toString(){
        return("Nome = "+ nome + " Classe = Clérigo, Vida = " + vida + ", Ataque = " + ataque + ", Defesa = " + defesa + ", Fé = " + fe);
    }
}
