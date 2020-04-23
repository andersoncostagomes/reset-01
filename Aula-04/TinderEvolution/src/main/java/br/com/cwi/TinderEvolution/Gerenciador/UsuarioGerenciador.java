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
    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();
    List<Usuario> match = new ArrayList<>();
    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        List<Usuario> usuarios = listaUsuario.listar();

        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                System.out.println("O e-mail cadastrado já existe.");
                return usuarioExistente;
            }
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataDeNascimento() == null || usuario.getBiografia().isEmpty()) {
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (usuario.getDataDeNascimento().plusYears(18).isAfter(LocalDate.now())) {
            return null;
        }
        return listaUsuario.cadastrar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable int id, @RequestBody Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
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
        return null;
    }

    @DeleteMapping
    public boolean deletar(@PathVariable int id) {
        if (id > 0) {
            return listaUsuario.deletar(id);
        }
        return false;
    }

    public boolean curtirMusica(int idMusica, int idUsuario) {
        MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirMusica(idMusica);
        }
        return false;
    }

    public Integer descurtirMusica(int idMusica, int idUsuario) {
        MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirMusica(idMusica);
        }
        return null;
    }

    public boolean curtirFilme(int idFilme, int idUsuario) {
        FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirFilme(idFilme);
        }
        return false;
    }

    public Integer descurtirFilme(int idFilme, int idUsuario) {
        FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirFilme(idFilme);
        }
        return null;
    }

    public boolean curtirSerie(int idSerie, int idUsuario) {
        SerieGerenciador serieGerenciador = new SerieGerenciador();
        if (serieGerenciador.procurar(idSerie) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirSerie(idSerie);
        }
        return false;
    }

    public Integer descurtirSerie(int idSerie, int idUsuario) {
        SerieGerenciador serieGerenciador = new SerieGerenciador();
        if (serieGerenciador.procurar(idSerie) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirSerie(idSerie);
        }
        return null;
    }

    public boolean curtirJogo(int idJogo, int idUsuario) {
        JogoGerenciador jogoGerenciador = new JogoGerenciador();
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirJogo(idJogo);
        }
        return false;
    }

    public Integer descurtirJogo(int idJogo, int idUsuario) {
        JogoGerenciador jogoGerenciador = new JogoGerenciador();
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirJogo(idJogo);
        }
        return null;
    }

    public boolean curtirEsporte(int idEsporte, int idUsuario) {
        EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirEsporte(idEsporte);
        }
        return false;
    }

    public Integer descurtirEsporte(int idEsporte, int idUsuario) {
        EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.descurtirEsporte(idEsporte);
        }
        return null;
    }

    public boolean definirCuriosidade(int idCuriosidade, int idUsuario) {
        CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();
        if (curiosidadeGerenciador.procurar(idCuriosidade) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.definirCuriosidade(idCuriosidade);
        }
        return false;
    }

    public Integer apagarCuriosidade(int idCuriosidade, int idUsuario) {
        CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();
        if (curiosidadeGerenciador.procurar(idCuriosidade) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.apagarCuriosidade(idCuriosidade);
        }
        return null;
    }

    public boolean curtirUsuario(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliador) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.curtirUsuario(idAvaliador);
        }
        return false;
    }

    public Integer removerCurtida(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliador) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.removerCurtida(idAvaliador);
        }
        return null;
    }

    public boolean descurtirUsuario(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliado) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.descurtirUsuario(idAvaliador);
        }
        return false;

    }

    public Integer removerDescurtida(int idAvaliado, int idAvaliador) {
        if (this.procurar(idAvaliador) != null) {
            Usuario usuario = this.procurar(idAvaliado);
            return usuario.removerDescurtida(idAvaliador);
        }
        return null;
    }

    public List<Usuario> ativarMatch(int id1) {
        Usuario usuario1 = this.procurar(id1);
        if (usuario1 != null) {
            ListadeUsuarios listadeUsuarios = new ListadeUsuarios();
            List<Usuario> apresentarUsuarios = listadeUsuarios.listar();
            for (Usuario usuario : apresentarUsuarios) {
                if (usuario.usuariosCurtidos.contains(usuario1.getId()) && usuario1.usuariosCurtidos.contains(usuario1.getId())) {
                    match.add(usuario);
                }
            }
            return match;
        }
        return null;
    }

    public Usuario evolution (int idUsuario) {
        Usuario usuarioAvaliado = this.procurar(idUsuario);
        if (usuarioAvaliado != null) {
            List<Usuario> apresentarUsuarios = listaUsuario.listar();
            int afinidadeMelhorUsuario = 0;
            int afinidadeMusicas = 0;
            int afinidadeFilmes = 0;
            int afinidadeSeries = 0;
            int afinidadeJogos = 0;
            int afinidadeEsportes = 0;
            int afinidadeCuriosidades = 0;

            for (Usuario usuario1 : apresentarUsuarios) {

                    for (Integer musicaAvaliada : usuarioAvaliado.getMusicasCurtidas()) {
                        for (Integer musicaUsuario : usuario1.getMusicasCurtidas()) {
                            if (musicaAvaliada.equals(musicaUsuario)) {
                                afinidadeMusicas++;
                            }
                        }
                    }
                    for (Integer filmeAvaliado : usuarioAvaliado.getFilmesCurtidos()) {
                        for (Integer filmeUsuario1 : usuario1.getFilmesCurtidos()) {
                            if (filmeAvaliado.equals(filmeUsuario1)) {
                                afinidadeFilmes++;
                            }
                        }
                    }
                    for (Integer serieAvaliado : usuarioAvaliado.getFilmesCurtidos()) {
                        for (Integer serieUsuario : usuario1.getFilmesCurtidos()) {
                            if (serieAvaliado.equals(serieUsuario)) {
                                afinidadeSeries++;
                            }
                        }
                    }
                    for (Integer jogoAvaliado : usuarioAvaliado.getJogosCurtidos()) {
                        for (Integer jogoUsuario : usuario1.getJogosCurtidos()) {
                            if (jogoAvaliado.equals(jogoUsuario)) {
                                afinidadeJogos++;
                            }
                        }
                    }
                    for (Integer esporteAvalido : usuarioAvaliado.getEsportesCurtidos()) {
                        for (Integer esporteUsuario : usuario1.getEsportesCurtidos()) {
                            if (esporteAvalido.equals(esporteUsuario)) {
                                afinidadeEsportes++;
                            }
                        }
                    }
                for (Integer curiosidadeAvalida : usuarioAvaliado.getEsportesCurtidos()) {
                    for (Integer curiosidadeUsuario : usuario1.getCuriosidades()) {
                        if (curiosidadeAvalida.equals(curiosidadeUsuario)) {
                            afinidadeCuriosidades++;
                        }
                    }
                }

                    afinidadeMelhorUsuario = afinidadeMusicas + afinidadeFilmes + afinidadeSeries + afinidadeJogos + afinidadeEsportes + afinidadeCuriosidades;

                if (afinidadeMelhorUsuario > 0) {
                    match.add(usuarioAvaliado);

                }
            }
        }
        return null;
    }
}
