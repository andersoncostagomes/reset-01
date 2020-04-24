package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Dominio.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchesGerenciador {
    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/{idAvaliado}/avaliador/{idAvaliador}/like")
    public boolean curtirUsuario (@PathVariable int idAvaliado, @PathVariable int idAvaliador){
        return usuarioGerenciador.curtirUsuario(idAvaliado, idAvaliador);
    }

    @DeleteMapping ("/{idAvaliado}/avaliador/{idAvaliador}/like")
    public String removerCurtidaUsuario (@PathVariable int idAvaliado, @PathVariable  int idAvaliador){
        usuarioGerenciador.removerCurtida(idAvaliado, idAvaliador);
        return null;
    }

    @PostMapping("/{idAvaliado}/avaliador/{idAvaliador}/dislike")
    public boolean descurtirUsuario (@PathVariable int idAvaliado, @PathVariable int idAvaliador){
        return usuarioGerenciador.descurtirUsuario(idAvaliado, idAvaliador);
    }

    @DeleteMapping ("/{idAvaliado}/avaliador/{idAvaliador}/dislike")
    public String removerDescurtidaUsuario (@PathVariable int idAvaliado, @PathVariable  int idAvaliador){
        usuarioGerenciador.removerDescurtida(idAvaliado, idAvaliador);
        return null;
    }

    @GetMapping ("/{idUsuarioAvaliado}")
    public List<Usuario> listarMatches (@PathVariable int idUsuarioAvaliado){
        return usuarioGerenciador.criarMatches(idUsuarioAvaliado);
    }

    @GetMapping ("/{idUsuario}/best")
    public List<Usuario> listarUsuarioBest (@PathVariable int idUsuario){
        return usuarioGerenciador.almasGemeas(idUsuario);
    }

}
