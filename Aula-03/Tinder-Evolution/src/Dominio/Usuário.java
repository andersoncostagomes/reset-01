package Dominio;

import java.time.LocalDate;

public class Usuário {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private double latitude;
    private double longitude;
    private String biografia;

    public Usuário(String nome, String email, String telefone, LocalDate dataDeNascimento, double longitude, double latitude, String biografia) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.biografia = biografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    @Override
    public String toString(){
        return "Usuário { " +
                "id: " + id +
                ", Nome: " + nome +
                ", E-mail: " + email +
                ", Telefone: " + telefone +
                ", Data de Nascimento: " + dataDeNascimento +
                ", Localização: " + latitude + longitude +
                ", Biografia: \n" + biografia + " }";
    }
}
