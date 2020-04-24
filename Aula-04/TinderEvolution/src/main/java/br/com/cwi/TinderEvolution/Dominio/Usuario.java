package br.com.cwi.TinderEvolution.Dominio;

import com.sun.deploy.net.MessageHeader;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    private Double latitude;
    private Double longitude;
    private String biografia;
    private String foto;
    private List<Integer> musicasCurtidas = new ArrayList();
    private List<Integer> filmesCurtidos = new ArrayList<>();
    private List<Integer> seriesCurtidas = new ArrayList<>();
    private List<Integer> jogosCurtidos = new ArrayList<>();
    private List<Integer> esportesCurtidos = new ArrayList<>();
    private List<Integer> curiosidades = new ArrayList<>();
    public List<Integer> usuariosCurtidos = new ArrayList<>();
    public List<Integer> usuariosDescurtidos = new ArrayList<>();

    public Usuario(String nome, String email, String telefone, LocalDate dataDeNascimento, Double longitude, Double latitude, String biografia, String foto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.latitude = latitude;
        this.longitude = longitude;
        this.biografia = biografia;
        this.foto = foto;
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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Integer> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void setMusicasCurtidas(List<Integer> musicasCurtidas) {
        this.musicasCurtidas = musicasCurtidas;
    }

    public List<Integer> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public void setFilmesCurtidos(List<Integer> filmesCurtidos) {
        this.filmesCurtidos = filmesCurtidos;
    }

    public List<Integer> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public void setSeriesCurtidas(List<Integer> seriesCurtidas) {
        this.seriesCurtidas = seriesCurtidas;
    }

    public List<Integer> getJogosCurtidos() {
        return jogosCurtidos;
    }

    public void setJogosCurtidos(List<Integer> jogosCurtidos) {
        this.jogosCurtidos = jogosCurtidos;
    }

    public List<Integer> getEsportesCurtidos() {
        return esportesCurtidos;
    }

    public void setEsportesCurtidos(List<Integer> esportesCurtidos) {
        this.esportesCurtidos = esportesCurtidos;
    }

    public List<Integer> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(List<Integer> curiosidades) {
        this.curiosidades = curiosidades;
    }



    //Músicas
    public boolean curtirMusica (int idMusica) {
        if (!musicasCurtidas.contains(idMusica)) {
            return musicasCurtidas.add(idMusica);
        }
        return false;
    }

    public Integer descurtirMusica (int idMusica){
        if (musicasCurtidas.contains(idMusica)){
            int musica = musicasCurtidas.indexOf(idMusica);
            return musicasCurtidas.remove(musica);
        }
        return null;
    }

    //Filmes
    public boolean curtirFilme (int idFilme) {
        if (!filmesCurtidos.contains(idFilme)) {
            filmesCurtidos.add(idFilme);
        }
        return false;
    }

    public Integer descurtirFilme (int idFilme){
        if (filmesCurtidos.contains(idFilme)){
            int filme = filmesCurtidos.indexOf(idFilme);
            return filmesCurtidos.remove(filme);
        }
        return null;
    }
    //Séries
    public boolean curtirSerie (int idSerie) {
        if (!seriesCurtidas.contains(idSerie)) {
            seriesCurtidas.add(idSerie);
        }
        return false;
    }

    public Integer descurtirSerie (int idSerie){
        if (seriesCurtidas.contains(idSerie)){
            int serie = seriesCurtidas.indexOf(idSerie);
            return seriesCurtidas.remove(serie);
        }
        return null;
    }
    //Jogos
    public boolean curtirJogo (int idJogo) {
        if (!jogosCurtidos.contains(idJogo)) {
            jogosCurtidos.add(idJogo);
        }
        return false;
    }

    public Integer descurtirJogo (int idJogo){
        if (jogosCurtidos.contains(idJogo)){
            int jogo = jogosCurtidos.indexOf(idJogo);
            return jogosCurtidos.remove(jogo);
        }
        return null;
    }
    //Esportes
    public boolean curtirEsporte (int idEsporte) {
        if (!esportesCurtidos.contains(idEsporte)) {
            esportesCurtidos.add(idEsporte);
        }
        return false;
    }

    public Integer descurtirEsporte (int idEsporte){
        if (esportesCurtidos.contains(idEsporte)){
            int esporte = esportesCurtidos.indexOf(idEsporte);
            return esportesCurtidos.remove(esporte);
        }
        return null;
    }
    //Curiosidades
    public boolean definirCuriosidade (int idCuriosidade) {
        if (!curiosidades.contains(idCuriosidade)) {
            curiosidades.add(idCuriosidade);
        }
        return false;
    }

    public Integer apagarCuriosidade (int idCuriosidade){
        if (curiosidades.contains(idCuriosidade)){
            int curiosidade = curiosidades.indexOf(idCuriosidade);
            return curiosidades.remove(curiosidade);
        }
        return null;
    }
    //Curtir Usuário
    public boolean curtirUsuario (int idUsuario) {
        if (!usuariosCurtidos.contains(idUsuario)) {
            usuariosCurtidos.add(idUsuario);
        }
        return false;
    }

    public Integer removerCurtida (int idUsuario){
        if (usuariosCurtidos.contains(idUsuario)){
            int usuario = usuariosCurtidos.indexOf(idUsuario);
            return usuariosCurtidos.remove(usuario);
        }
        return null;
    }

    //Descurtir Usuário
    public boolean descurtirUsuario (int idUsuario) {
        if (!usuariosDescurtidos.contains(idUsuario)) {
            usuariosDescurtidos.add(idUsuario);
        }
        return false;
    }

    public Integer removerDescurtida (int idUsuario){
        if (usuariosDescurtidos.contains(idUsuario)){
            int usuario = usuariosDescurtidos.indexOf(idUsuario);
            return usuariosDescurtidos.remove(usuario);
        }
        return null;
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
                ", Biografia: \n" + biografia +
                ", Foto: " + foto +
                ", músicas curtidas: " + musicasCurtidas +
                ", filmes curtidos: " + filmesCurtidos +
                ", séries curtidas: " + seriesCurtidas +
                ", jogos curtidos: " + jogosCurtidos +
                ", usuários curtidos: " + usuariosCurtidos +
                ", usuários descurtidos: " + usuariosDescurtidos +
                ", esportes curtidos: " + esportesCurtidos +
                ", curiosidades definidas: " + curiosidades +
                " }";
    }
}
