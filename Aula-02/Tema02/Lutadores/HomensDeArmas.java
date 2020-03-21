package Lutadores;

import PoderesDivinosArmasMagias.Arma;

public class HomensDeArmas extends Personagem {
    protected String arma;

    public HomensDeArmas(String nome, int vida, int ataque, int defesa, String arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void imprimirEstado() {
        System.out.println(this.nome + ", Vida = " + this.vida);
    }


    public void atacar(Personagem alvo, Arma arma)  {
        if (this.vida > 0) {
            int danoFinal =  calcularDano(alvo.defesa, arma.poder);
            alvo.vida -= danoFinal;
            if (this.vida > 0) {
                registrar(alvo.nome, arma.nome, danoFinal);
            } else {
                System.out.println(this.nome + " atacou " + alvo + " com " + arma + " e causou " + danoFinal + " de dano. O Lutador " + alvo + " está fora de combate");
        } }else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
    }
}

