package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.ListadeUsuarios;
import br.com.cwi.TinderEvolution.Dominio.Usuario;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuarioGerenciador {
    private ListadeUsuarios listaUsuario = new ListadeUsuarios();
    MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
    FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
    SerieGerenciador serieGerenciador = new SerieGerenciador();
    JogoGerenciador jogoGerenciador = new JogoGerenciador();
    EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
    CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();


    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        List<Usuario> usuarios = listaUsuario.listar();

        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                System.out.println("O e-mail cadastrado já existe.");
                throw new RuntimeException("O e-mail cadastrado já existe.");
            }
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataDeNascimento() == null ||usuario.getLatitude() == null || usuario.getLongitude() == null || usuario.getBiografia().isEmpty()) {
            System.out.println("Campo obrigatório não informado.");
            throw new RuntimeException("Campo obrigatório não informado.");
        }
        if (usuario.getDataDeNascimento().plusYears(18).isAfter(LocalDate.now())) {
            throw new RuntimeException("O usuário possui menos de 18 anos.");

        }
        return listaUsuario.cadastrar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            throw new RuntimeException("Usuário não cadastrado.");
        } else {
            return listaUsuario.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    @GetMapping
    public List<Usuario> listar() {

        return listaUsuario.listar();
    }

    @GetMapping("/{id}")
    public Usuario procurar(@PathVariable int id) {
        if (id > 0) {
            return listaUsuario.procurar(id);
        }
        throw new RuntimeException("Usuário não cadastrado.");
    }

    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id) {
        if (id > 0) {
            return listaUsuario.deletar(id);

        }
        throw new RuntimeException("Usuário não cadastrado.");
    }

    public boolean curtirMusica(int idMusica, int idUsuario) {
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirMusica(idMusica);
        }
        throw new RuntimeException("Música não cadastrada.");
    }

    public Integer descurtirMusica(int idMusica, int idUsuario) {
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirMusica(idMusica);
        }
        throw new RuntimeException("Música não cadastrada.");    }

    public boolean curtirFilme(int idFilme, int idUsuario) {
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirFilme(idFilme);
        }
        throw new RuntimeException("Filme não cadastrado.");
    }

    public Integer descurtirFilme(int idFilme, int idUsuario) {
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirFilme(idFilme);
        }
        throw new RuntimeException("Filme não cadastrado.");
    }

    public boolean curtirSerie(int idSerie, int idUsuario) {
        if (serieGerenciador.procurar(idSerie) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirSerie(idSerie);
        }
        throw new RuntimeException("Série não cadastrada.");
    }

    public Integer descurtirSerie(int idSerie, int idUsuario) {
        if (serieGerenciador.procurar(idSerie) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirSerie(idSerie);
        }
        throw new RuntimeException("Série não cadastrada.");
    }

    public boolean curtirJogo(int idJogo, int idUsuario) {
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirJogo(idJogo);
        }
        throw new RuntimeException("Jogo não cadastrado.");
    }

    public Integer descurtirJogo(int idJogo, int idUsuario) {
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirJogo(idJogo);
        }
        throw new RuntimeException("Jogo não cadastrado.");
    }

    public boolean curtirEsporte(int idEsporte, int idUsuario) {
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirEsporte(idEsporte);
        }
        throw new RuntimeException("Esporte não cadastrado.");
    }

    public Integer descurtirEsporte(int idEsporte, int idUsuario) {
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirEsporte(idEsporte);
        }
        throw new RuntimeException("Esporte não cadastrado.");
    }

    public boolean definirCuriosidade(int idCuriosidade, int idUsuario) {
        if (curiosidadeGerenciador.procurar(idCuriosidade) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.definirCuriosidade(idCuriosidade);
        }
        throw new RuntimeException("Curiosidade não definida.");
    }

    public Integer apagarCuriosidade(int idCuriosidade, int idUsuario) {
        if (curiosidadeGerenciador.procurar(idCuriosidade) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.apagarCuriosidade(idCuriosidade);
        }
        throw new RuntimeException("Curiosidade não definida.");
    }

    public boolean curtirUsuario(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliado) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.curtirUsuario(idAvaliador);
        }
        throw new RuntimeException("Usuário não encontrado.");

    }

    public Integer removerCurtida(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliado) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.removerCurtida(idAvaliador);
        }
        throw new RuntimeException("Usuário não encontrado.");
    }

    public boolean descurtirUsuario(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliado) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.descurtirUsuario(idAvaliador);
        }
        throw new RuntimeException("Usuário não encontrado.");

    }

    public Integer removerDescurtida(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliado) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.removerDescurtida(idAvaliador);
        }
        throw new RuntimeException("Usuário não encontrado.");
    }

    public List<Usuario> criarMatches (int idUsuarioAvaliado){
        Usuario usuarioAvaliado = this.procurar(idUsuarioAvaliado);
        if (usuarioAvaliado == null){
            return null;
        }
        List<Usuario> listaMatches = new ArrayList<>();
        List<Usuario> listarUsuarios = listaUsuario.listar();
        for (Usuario usuario : listarUsuarios){
            if (usuarioAvaliado.usuariosCurtidos.contains(usuario.getId()) && usuario.usuariosCurtidos.contains(usuarioAvaliado.getId())){
                listaMatches.add(usuario);
            }
        }
        return listaMatches;
    }

    public List<Usuario> almasGemeas (int idUsuarioAvaliado){
        Usuario usuarioAvaliado = this.procurar(idUsuarioAvaliado);
        if (usuarioAvaliado == null){
            return null;
        }
        List<Usuario> listaAlmasGemeas = new ArrayList<>();
        List<Usuario> listarUsuarios = listaUsuario.listar();

        Usuario usuarioteste = null;
        int afinidadeElevada = 0;
        int afinidade = 0;
        int afinidadeMusicas = 0;
        int afinidadeFilmes = 0;
        int afinidadeSeries = 0;
        int afinidadeJogos = 0;
        int afinidadeEsportes = 0;
        int afinidadeCuriosidades = 0;

        for (Usuario usuario : listarUsuarios){
            if (!usuarioAvaliado.usuariosCurtidos.contains(usuario.getId()) && !usuarioAvaliado.usuariosDescurtidos.contains(usuario.getId())){
                for (Integer musicaAvaliada : usuarioAvaliado.getMusicasCurtidas()){
                    for (Integer musicaUsuarioPretendente : usuario.getMusicasCurtidas()){
                        if (musicaAvaliada.equals(musicaUsuarioPretendente)){
                            afinidadeMusicas++;
                        }
                    }
                }
                for (Integer filmeAvaliado : usuarioAvaliado.getFilmesCurtidos()){
                    for (Integer filmeUsuarioPretendente : usuario.getFilmesCurtidos()){
                        if (filmeAvaliado.equals(filmeUsuarioPretendente)){
                            afinidadeFilmes++;
                        }
                    }
                }
                for (Integer serieAvaliado : usuarioAvaliado.getSeriesCurtidas()){
                    for (Integer serieUsuarioPretendente : usuario.getSeriesCurtidas()){
                        if (serieAvaliado.equals(serieUsuarioPretendente)){
                            afinidadeSeries++;
                        }
                    }
                }
                for (Integer jogoAvaliado : usuarioAvaliado.getJogosCurtidos()){
                    for (Integer jogoUsuarioPretendente : usuario.getJogosCurtidos()){
                        if (jogoAvaliado.equals(jogoUsuarioPretendente)){
                            afinidadeJogos++;
                        }
                    }
                }
                for (Integer esporteAvalido : usuarioAvaliado.getEsportesCurtidos()){
                    for (Integer esporteUsuarioPretendente : usuario.getEsportesCurtidos()){
                        if (esporteAvalido.equals(esporteUsuarioPretendente)){
                            afinidadeEsportes++;
                        }
                    }
                }
                for (Integer curiosidadeAvalida : usuarioAvaliado.getCuriosidades()){
                    for (Integer curiosidadeUsuarioPretendente : usuario.getCuriosidades()){
                        if (curiosidadeAvalida.equals(curiosidadeUsuarioPretendente)){
                            afinidadeCuriosidades++;
                        }
                    }
                }
                afinidade = afinidadeMusicas + afinidadeFilmes + afinidadeSeries + afinidadeJogos + afinidadeEsportes + afinidadeCuriosidades;

                if (afinidade>afinidadeElevada){
                    usuarioteste = usuario;
                    afinidadeElevada = afinidade;
                    listaAlmasGemeas.add(usuario);
                }
            }
        }
        return listaAlmasGemeas;
    }
}

