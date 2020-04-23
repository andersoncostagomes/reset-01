package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Dominio.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchesGerenciador {
    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/{idAvaliado}/avaliador/{idAvaliador}/like")
    public boolean curtirUsuario (@PathVariable int idUsuarioAvalido, @PathVariable  int idUsuarioAvaliador){
        return usuarioGerenciador.curtirUsuario(idUsuarioAvalido, idUsuarioAvaliador);
    }

    @DeleteMapping("/{idAvaliado}/avaliador/{idAvaliador}/like")
    public String removerCurtida (@PathVariable  int idUsuarioAvaliado, @PathVariable  int idUsuarioAvaliador){
        usuarioGerenciador.removerCurtida(idUsuarioAvaliado,idUsuarioAvaliador);
        return "Like deletado";
    }

    @PostMapping("/{idAvaliado}/avaliador/{idAvaliador}/dislike")
    public boolean descurtirUsuario (@PathVariable int idUsuarioAvaliado, @PathVariable int idUsuarioAvaliador){
        return usuarioGerenciador.descurtirUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
    }

    @DeleteMapping ("/{idAvaliado}/avaliador/{idAvaliador}/dislike")
    public String removerDescurtidaUsuario (@PathVariable int idUsuarioAvaliado, @PathVariable  int idUsuarioAvaliador){
        usuarioGerenciador.removerDescurtida(idUsuarioAvaliado, idUsuarioAvaliador);
        return "Dislike deletado";
    }

    @GetMapping ("/{id}")
    public List<Usuario> listarMatches (@PathVariable int idUsuarioAvaliado){
        return usuarioGerenciador.ativarMatch(idUsuarioAvaliado);
    }
    @GetMapping ("/{idUsuario}/best")
    public Usuario listarUsuarioBest (@PathVariable  int idUsuario){
        return usuarioGerenciador.evolution(idUsuario);
    }

}
