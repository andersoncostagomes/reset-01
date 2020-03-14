public class Navio extends Veiculo {
    public String combustivel;

    public Navio(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, String combustivel) {
        super(nome, "Aquatico", velocidadeMaxima, lotaçaoMaxima);
        this.combustivel = combustivel;
    }
}
