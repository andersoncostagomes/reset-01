public class Caminhão extends Veiculo {
     public int numeroDeRodas;
    public String combustivel;


    public Caminhão(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, int numeroDeRodas, String combustivel) {
        super(nome, "Terrestre", velocidadeMaxima, lotaçaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
        this.combustivel = combustivel;
    }
}
