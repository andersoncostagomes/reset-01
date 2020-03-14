public class Submarino extends Veiculo {
    public String combustivel;
    public double profundidadeMaxima;

    public Submarino(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, String combustivel, double profundidadeMaxima) {
        super(nome, "Aquatico", velocidadeMaxima, lotaçaoMaxima);
        this.combustivel = combustivel;
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
