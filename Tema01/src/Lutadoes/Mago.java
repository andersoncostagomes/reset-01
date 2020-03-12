package Lutadoes;

import PoderesDivinosArmasMagias.Magia1;

public class Mago {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int mana;
    public String classe = "Mago";
    public Magia1 magiaUtilizada = new Magia1("fogoMaldito", 16, 12);

    public Mago(String nome, int vida, int ataque, int defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    public int atacarGuerreiro(Guerreiro nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarBarbaro(Barbaro nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarMago(Mago nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarFeiticeiro(Feiticeiro nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarClerigo(Clerigo nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarDruida(Druida nomeLutador, String nomeMagia) {
        if (this.vida > 0) {
            Magia1 magiaUtilizada = new Magia1("FogoMaldito", 16, 12);
            if (this.mana >= magiaUtilizada.custoDeMana) {
                int poderFinalAtaque = this.ataque * magiaUtilizada.poder;
                this.mana = this.mana - magiaUtilizada.custoDeMana;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomeMagia + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais mana!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }
}
