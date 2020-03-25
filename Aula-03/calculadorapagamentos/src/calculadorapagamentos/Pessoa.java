package calculadorapagamentos;

public class Pessoa {

    protected static int populacao = 0;

    protected String nome;
    protected int altura;
    protected int idade;
    protected char sexo;

    public Pessoa(String nome, int altura, int idade, char sexo) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        populacao++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
