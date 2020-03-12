package Lutadoes;

import PoderesDivinosArmasMagias.Poder1;
import PoderesDivinosArmasMagias.Poder2;

public class Druida {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int fe;
    public String classe ="Druida";
    public Poder2 poderUtilizado = new Poder2("presaMagica",19, 20 );

    public Druida(String nome, int vida, int ataque, int defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }
    public int atacarGuerreiro(Guerreiro nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarBarbaro(Barbaro nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarMago(Mago nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarFeiticeiro(Feiticeiro nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarClerigo(Clerigo nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }public int atacarDruida(Druida nomeLutador, String nomePoder) {
        if (this.vida > 0) {
            Poder2 poderUtilizado = new Poder2("presaMagica", 19, 20);
            if (this.fe >= poderUtilizado.custoDeFe) {
                int poderFinalAtaque = this.ataque * poderUtilizado.poder;
                this.fe = this.fe - poderUtilizado.custoDeFe;
                int danoFinal = poderFinalAtaque - nomeLutador.defesa;
                nomeLutador.vida = nomeLutador.vida - danoFinal;
                if (nomeLutador.vida > 0) {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + "  e causou " + danoFinal + " de dano.");
                } else {
                    System.out.println(this.nome + " atacou " + nomeLutador.nome + " com " + nomePoder + " e causou " + danoFinal + " de dano. O Lutador " + nomeLutador.nome + " está fora de combate");
                }
            } else {
                System.out.println("O Lutador" + this.nome + " não possui mais fé!");
            }
        } else {
            System.out.println("O lutador " + this.nome + " morreu e retornou ao seu Mundo!");
        }
        return 0;
    }
}
