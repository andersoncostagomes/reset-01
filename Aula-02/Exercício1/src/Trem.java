public class Trem extends Veiculo {
    public int numeroDeRodas;
    public String combustivel;


    public Trem(String nome, String terreno, String combustivel, double velocidadeMaxima, int lotaçaoMaxima, int numeroDeRodas, String combustivel1) {
        super(nome, "Terrestre", combustivel, velocidadeMaxima, lotaçaoMaxima);
        this.numeroDeRodas = numeroDeRodas;
        this.combustivel = combustivel1;
    }
}
