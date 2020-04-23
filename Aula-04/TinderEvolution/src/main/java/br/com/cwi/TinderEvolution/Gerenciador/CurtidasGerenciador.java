package br.com.cwi.TinderEvolution.Gerenciador;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes")
public class CurtidasGerenciador {
    UsuarioGerenciador usuarioGerenciador = new UsuarioGerenciador();

    @PostMapping("/musica/{idMusica}/avaliador/{idUsuario}")
    public boolean curtirMusica (@PathVariable int idMusica, @PathVariable  int idUsuario){
        return usuarioGerenciador.curtirMusica(idMusica, idUsuario);
    }

    @DeleteMapping("/musica/{idMusica}/avaliador/{idUsuario}")
    public Integer descurtirMusica (@PathVariable  int idMusica, @PathVariable  int idUsuario){
        return usuarioGerenciador.descurtirMusica(idMusica, idUsuario);
    }

    @PostMapping("/filme/{idFilme}/avaliador/{idUsuario}")
    public boolean curtirFilme (@PathVariable int idFilme, @PathVariable  int idUsuario){
        return usuarioGerenciador.curtirFilme(idFilme, idUsuario);
    }

    @DeleteMapping("/filme/{idFilme}/avaliador/{idUsuario}")
    public Integer descurtirFilme (@PathVariable  int idFilme, @PathVariable  int idUsuario){
        return usuarioGerenciador.descurtirFilme(idFilme, idUsuario);
    }

    @PostMapping("/serie/{idSerie}/avaliador/{idUsuario}")
    public boolean curtirSerie (@PathVariable int idSerie, @PathVariable  int idUsuario){
        return usuarioGerenciador.curtirSerie(idSerie, idUsuario);
    }

    @DeleteMapping("/serie/{idSerie}/avaliador/{idUsuario}")
    public Integer descurtirSerie (@PathVariable  int idSerie, @PathVariable  int idUsuario){
        return usuarioGerenciador.descurtirSerie(idSerie, idUsuario);
    }

    @PostMapping("/jogo/{idJogo}/avaliador/{idUsuario}")
    public boolean curtirJogo (@PathVariable int idJogo, @PathVariable  int idUsuario){
        return usuarioGerenciador.curtirJogo(idJogo, idUsuario);
    }

    @DeleteMapping("/jogo/{idJogo}/avaliador/{idUsuario}")
    public Integer descurtirJogo (@PathVariable  int idJogo, @PathVariable  int idUsuario){
        return usuarioGerenciador.descurtirJogo(idJogo, idUsuario);
    }

    @PostMapping("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public boolean curtirEsporte (@PathVariable int idEsporte, @PathVariable  int idUsuario){
        return usuarioGerenciador.curtirEsporte(idEsporte, idUsuario);
    }

    @DeleteMapping("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public Integer descurtirEsporte (@PathVariable  int idEsporte, @PathVariable  int idUsuario){
        return usuarioGerenciador.descurtirEsporte(idEsporte, idUsuario);
    }
    @PostMapping("/curiosidade/{idCuriosidade}/avaliador/{idUsuario}")
    public boolean curtirCuriosidade (@PathVariable int idCuriosidade, @PathVariable  int idUsuario){
        return usuarioGerenciador.definirCuriosidade(idCuriosidade, idUsuario);
    }

    @DeleteMapping("/curiosidade/{idCuriosidade}/avaliador/{idUsuario}")
    public Integer descurtirCuriosidade (@PathVariable  int idCuriosidade, @PathVariable  int idUsuario){
        return usuarioGerenciador.apagarCuriosidade(idCuriosidade, idUsuario);    }
}

