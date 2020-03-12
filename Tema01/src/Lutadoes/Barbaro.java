package Lutadoes;

import PoderesDivinosArmasMagias.Machado;

public class Barbaro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public String classe = "Barbaro";
    public Machado machadoUtilizado = new Machado("StormBreaker", 20);

    public Barbaro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int atacarGuerreiro(Guerreiro nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
                    System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
                }
                return 0;
            }
    public int atacarBarbaro(Barbaro nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarMago(Mago nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarFeiticeiro(Feiticeiro nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarClerigo(Clerigo nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarDruida(Druida nomeLutador, String nomeMachado) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * machadoUtilizado.Machado();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMachado +" e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        } else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }
        }
