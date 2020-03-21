package exercício3;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        Item item1 = new Item("Costela",Segmento.ALIMENTACAO,25.5,2);
        Item item2 = new Item("Pasta de Dente",Segmento.HIGIENE,2.99,5);
        Item item3 = new Item("Detergente",Segmento.LIMPEZA,1.69,3);

        Lista<Item> itens = new ArrayList<>();
        itens.add(item1);
    }

}
