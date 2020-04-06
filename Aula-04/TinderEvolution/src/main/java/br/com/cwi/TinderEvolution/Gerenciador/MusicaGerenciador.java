package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.MusicaAcervo;
import br.com.cwi.TinderEvolution.Dominio.Musica;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaGerenciador {
    private MusicaAcervo acervo = new MusicaAcervo();

    @PostMapping
    public Musica salvar(@RequestBody Musica musica){
        List<Musica> musicas = acervo.listar();

        for (Musica musicaExistente : musicas){
            if (musica.getNome().equals(musicaExistente.getNome())){
                return musicaExistente;
            }
        }
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getEstiloMusical() == null || musica.getLançamento() == null){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (musica.getLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(musica);
    }
    @PutMapping("/{id}")
    public Musica editar(@PathVariable int id, @RequestBody Musica musicaAtualizada){
        Musica musicaParaEditar = procurar(id);

        if (musicaParaEditar == null){
            return null;
        } else {
            return acervo.editar(musicaParaEditar, musicaAtualizada);
        }
    }
    @GetMapping
    public List<Musica> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Musica procurar(@PathVariable("id") int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable("id") int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        return false;
    }
}
