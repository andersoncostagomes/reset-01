package Lutadores;
import PoderesDivinosArmasMagias.Magia;

import java.util.List;

public class Arcano extends Personagem {
    protected int mana;

    protected Arcano(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void imprimirEstado() {
        System.out.println(this.nome + ", Vida = " + this.vida);
    }
    public void atacar(Personagem alvo, Magia magia)  {
        if (this.vida > 0) {
            if (this.mana >= magia.custoDeMana) {
                this.mana -= magia.custoDeMana;
            int danoFinal =  calcularDano(alvo.defesa, magia.poder);
            alvo.vida -= danoFinal;
            if (this.vida > 0) {
                registrar(alvo.nome, magia.nome, danoFinal);
            } else {
                System.out.println(this.nome + " atacou " + alvo + " com " + magia + " e causou " + danoFinal + " de dano. O Lutador " + alvo + " está fora de combate");
            }
        } else {
            System.out.println("O Lutador" + this.nome + " não possui mais mana!");
        }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
    }
}

