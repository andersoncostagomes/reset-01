package exercício3;

public class Item {
    public String nome;
    public Segmento segmento;
    public double valor;
    public int quantidade;

    public Item(String nome, Segmento segmento, double valor, int quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
