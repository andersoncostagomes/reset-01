public class Bicicleta extends Veiculo {
    public int numeroDeRodas;

    public Bicicleta(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, int numeroDeRodas) {
        super(nome, "Terrestre", velocidadeMaxima, lotaçaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
    }
}
