public class Carro extends Veiculo {
    public int numeroDeRodas;
    public String combustivel;


    public Carro(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, int numeroDeRodas, String combustivel) {
        super(nome, "Terrestre", velocidadeMaxima, lotaçaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
        this.combustivel = combustivel;
    }
}
