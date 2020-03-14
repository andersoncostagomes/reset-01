package Lutadoes;

import PoderesDivinosArmasMagias.Espada;

public class Guerreiro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public String classe = "Guerreiro";
    public Espada espadaUtilizada = new Espada("Anduril",15 );

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public int atacarGuerreiro(Guerreiro nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
                    System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
                }
                return 0;
            }
    public int atacarBarbaro(Barbaro nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarMago(Mago nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarFeiticeiro(Feiticeiro nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarClerigo(Clerigo nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarDruida(Druida nomeLutador, String nomeEspada) {
        if (this.vida > 0) {
            int poderFinalAtaque = this.ataque * espadaUtilizada.Espada();
            int danoFinal = poderFinalAtaque - nomeLutador.defesa;
            nomeLutador.vida = nomeLutador.vida - danoFinal;
            if (nomeLutador.vida > 0) {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + "  e causou " + danoFinal + " de dano.");
            } else {
                System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeEspada + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
            }
        }else{
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }
        }

