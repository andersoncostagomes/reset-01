import Lutadoes.*;

import java.sql.SQLOutput;

public class Batalha {
    public static void main(String[] args) {

        System.out.println("Uma voz surge na escuridão:");
        System.out.println("- Bem vindos campeões!");
        System.out.println("- Vocês foram escolhidos por serem os lutadores mais poderosos dos seus Mundos!");
        System.out.println();
        System.out.println("As luzes acendem e o cenário se revela:");
        System.out.println("É uma arena medieval, porém comletamente limpa e em perfeito estado de conservação, como se tivesse sido construída para aquela situação.");
        System.out.println("Ao centro da arena se encontram seis pessoas, essas pessoas não se conecem e não sabem como foram chegar la.");
        System.out.println();
        System.out.println(" A voz volta a falar:");
        System.out.println("-Esta é a Arena dos Mundos!");
        System.out.println("Esta tela mostra o status de cada lutador:");
        System.out.println();

        Barbaro Thor = new Barbaro("Thor", 5000,80,70);
        Guerreiro Aragorn = new Guerreiro("Aragorn",4700, 65,100);
        Mago Dumbledore = new Mago("Dumbledore", 6000,68,110,100);
        Feiticeiro Zatanna = new Feiticeiro("Zatanna", 5800, 73, 90, 90);
        Clerigo Arduin = new Clerigo("Arduin",4600,66,110,92);
        Druida Nissa = new Druida("Nissa",5500,69, 115, 98 );

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("-As regras são simples:");
        System.out.println("-Para voltar para seu Mundo vocês precisam lutar uns contra os outros;");
        System.out.println("-Vocês devem atacar outro lutador a cada round;");
        System.out.println("-O lutador que se recusar a lutar ficará na arena para sempre e nunca mais reornará ao seu Mundo;");
        System.out.println("-Quando um lutador for derrotado ele retornará ao seu Mundo, desde que tenha lutado de verdade;");
        System.out.println("-O últmo lutador que restar na arena será considerado o grande campeão da Arena dos Mundos e receberá o maior prêmio já concedido à um campeão!");
        System.out.println("-Como os lutadores e as regras já foram apresentados, Que os jogos Começem!");
        System.out.println();

        System.out.println("Round 1");
        System.out.println();

        Nissa.atacarMago(Dumbledore,"presaMagica");
        Zatanna.atacarBarbaro(Thor,"chicoteEletrico");
        Aragorn.atacarDruida(Nissa, "Anduril");
        Thor.atacarGuerreiro(Aragorn,"StormBreaker");
        Dumbledore.atacarGuerreiro(Aragorn, "fogoMaldito");
        Arduin.atacarFeiticeiro(Zatanna,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("A voz volta a falar:");
        System.out.println("-Começamos com grande Estilo! Essa promete ser uma competição incrível");
        System.out.println();

        System.out.println("Round 2");
        System.out.println();

        Nissa.atacarBarbaro(Thor,"presaMagica");
        Zatanna.atacarMago(Dumbledore,"chicoteEletrico");
        Aragorn.atacarBarbaro(Thor, "Anduril");
        Thor.atacarFeiticeiro(Zatanna,"StormBreaker");
        Dumbledore.atacarDruida(Nissa, "fogoMaldito");
        Arduin.atacarGuerreiro(Aragorn,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("Round 3");
        System.out.println();

        Nissa.atacarMago(Dumbledore,"presaMagica");
        Zatanna.atacarClerigo(Arduin,"chicoteEletrico");
        Aragorn.atacarFeiticeiro(Zatanna, "Anduril");
        Thor.atacarClerigo(Arduin,"StormBreaker");
        Dumbledore.atacarBarbaro(Thor, "fogoMaldito");
        Arduin.atacarDruida(Nissa,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("Round 4");
        System.out.println();

        Nissa.atacarGuerreiro(Aragorn,"presaMagica");
        Zatanna.atacarDruida(Nissa,"chicoteEletrico");
        Aragorn.atacarMago(Dumbledore, "Anduril");
        Thor.atacarFeiticeiro(Zatanna,"StormBreaker");
        Dumbledore.atacarDruida(Nissa, "fogoMaldito");
        Arduin.atacarBarbaro(Thor,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("A voz retorna depois de uma grande pausa:");
        System.out.println("- THOR O BÁRBARO FOI DERROTADO!!! ESSA BATALHA ESTÁ CADA VEZ MELHOR!!!");
        System.out.println();

        System.out.println("Round 5");
        System.out.println();

        Nissa.atacarMago(Dumbledore,"presaMagica");
        Zatanna.atacarGuerreiro(Aragorn,"chicoteEletrico");
        Aragorn.atacarClerigo(Arduin, "Anduril");
        Thor.atacarFeiticeiro(Zatanna,"StormBreaker");
        Dumbledore.atacarClerigo(Arduin, "fogoMaldito");
        Arduin.atacarMago(Dumbledore,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("A voz volta a falar em um tom emocionado:");
        System.out.println("- Aragorn O BÁRBARO CAIU!!! MENOS UM, AGORA SÓ RESTAM QUATRO LUTADORES!!!");
        System.out.println();

        System.out.println("Round 6");
        System.out.println();

        Nissa.atacarClerigo(Arduin,"presaMagica");
        Zatanna.atacarClerigo(Arduin,"chicoteEletrico");
        Aragorn.atacarClerigo(Arduin, "Anduril");
        Thor.atacarFeiticeiro(Zatanna,"StormBreaker");
        Dumbledore.atacarFeiticeiro(Zatanna, "fogoMaldito");
        Arduin.atacarDruida(Nissa,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("A voz volta a falar aos berros:");
        System.out.println("- MENOS DOIS!!! RESTAM APENAS DOIS LUTADORES!!!");
        System.out.println();

        System.out.println("Round 7");
        System.out.println();

        Nissa.atacarMago(Dumbledore,"presaMagica");
        Zatanna.atacarClerigo(Arduin,"chicoteEletrico");
        Aragorn.atacarClerigo(Arduin, "Anduril");
        Thor.atacarFeiticeiro(Zatanna,"StormBreaker");
        Dumbledore.atacarDruida(Nissa, "fogoMaldito");
        Arduin.atacarDruida(Nissa,"calamidadeDeDeus");
        System.out.println();

        System.out.println(Thor.nome + ", Classe = " + Thor.classe + ", Vida = " + Thor.vida);
        System.out.println(Aragorn.nome + ", Classe = " + Aragorn.classe + ", Vida = " + Aragorn.vida);
        System.out.println(Dumbledore.nome + ", Classe = " + Dumbledore.classe + ", Vida = " + Dumbledore.vida + ", Mana = " + Dumbledore.mana);
        System.out.println(Zatanna.nome + ", Classe = " + Zatanna.classe + ", Vida = " + Zatanna.vida + ", Mana = " + Zatanna.mana);
        System.out.println(Arduin.nome + ", Classe = " + Arduin.classe + ", Vida = " + Arduin.vida + ", Fé = " + Arduin.fe);
        System.out.println(Nissa.nome + ", Classe = " + Nissa.classe + ", Vida = " + Nissa.vida + ", Fé = " + Nissa.fe);
        System.out.println();

        System.out.println("A voz volta em um tom clamo e sombrio:");
        System.out.println("-O Mago Dumbledore é o grande campeão da Arena do Mundos!");
        System.out.println("-E o grande prêmio é... se tornar meu troféu para toda a eternidade!");
        System.out.println();

        System.out.println("As luzes se apagam e a competição chega ao fim!");



    }
}
