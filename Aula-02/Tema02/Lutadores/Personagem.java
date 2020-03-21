package Lutadores;

public class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    protected Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    int calcularDano(int defesa, int poder) {

        return ataque * poder - defesa;
    }

    public void registrar(String nomeAlvo, String habilidade, int danoFinal) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + danoFinal + " de dano");
    }


}