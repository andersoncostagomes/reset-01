package Lutadores;

import PoderesDivinosArmasMagias.Poder;

public class Sacerdote extends Personagem {
    protected int fe;

    protected Sacerdote(String nome, int vida, int ataque, int defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public int getFe() {
        return fe;
    }

    public void imprimirEstado() {
        System.out.println(this.nome + ", Vida = " + this.vida);
    }
     public void atacar(Personagem alvo, Poder poder)  {
        if (this.vida > 0) {
            if (this.fe >= poder.custoDeFe) {
                this.fe -= poder.custoDeFe;
                int danoFinal =  calcularDano(alvo.defesa, poder.poder);
                alvo.vida -= danoFinal;
                if (this.vida > 0) {
                    registrar(alvo.nome, poder.nome, danoFinal);
                } else {
                    System.out.println(this.nome + " atacou " + alvo + " com " + poder + " e causou " + danoFinal + " de dano. O Lutador " + alvo + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
    }

}
