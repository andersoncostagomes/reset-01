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
                throw new RuntimeException("Esta música já foi cadastrada.");
            }
        }
        if (musica.getNome().isEmpty() || musica.getArtista().isEmpty() || musica.getEstiloMusical() == null || musica.getLançamento() == null){
            System.out.println("Campo obrigatório não informado.");
            throw new RuntimeException("Campo obrigatório não informado.");
        }
        if (musica.getLançamento().isAfter(LocalDate.now()) ){
            throw new RuntimeException("Não pode ser cadastrada uma música com data de lançamento futura.");
        }
        return acervo.salvar(musica);
    }
    @PutMapping("/{id}")
    public Musica editar(@PathVariable int id, @RequestBody Musica musicaAtualizada){
        Musica musicaParaEditar = procurar(id);

        if (musicaParaEditar == null){
            throw new RuntimeException("Música não cadastrada.");
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
        throw new RuntimeException("Música não cadastrada.");
    }
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable("id") int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        throw new RuntimeException("Música não cadastrada.");
    }
}
