public class Avião extends Veiculo {
    public String combustivel;
    public int numeroDeRodas;
    public double altitudeMaxima;

    public Avião(String nome, String terreno, double velocidadeMaxima, int lotaçaoMaxima, String combustivel, int numeroDeRodas, double altitudeMaxima) {
        super(nome, "Aéreo", velocidadeMaxima, lotaçaoMaxima);
        this.combustivel = combustivel;
        this.numeroDeRodas = numeroDeRodas;
        this.altitudeMaxima = altitudeMaxima;
    }
}
