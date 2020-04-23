package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.SerieAcervo;
import br.com.cwi.TinderEvolution.Dominio.Serie;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieGerenciador {
    private SerieAcervo acervo = new SerieAcervo();
    @PostMapping
    public Serie salvar(@RequestBody Serie serie){
        List<Serie> series = acervo.listar();

        for (Serie serieExistente : series){
            if (serie.getNome().equals(serieExistente.getNome())){
                return serieExistente;
            }
        }
        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getCategoriaSerie() == null || serie.getDataDeLançamento() == null || serie.getNumeroTemporadas() == 0 || serie.getNumeroEpisódios() == 0){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (serie.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(serie);
    }
    @PutMapping("/{id}")
    public Serie editar(@PathVariable int id, @RequestBody Serie serieAtualizada){
        Serie serieParaEditar = procurar(id);

        if (serieParaEditar == null){
            return null;
        } else {
            return acervo.editar(serieParaEditar, serieAtualizada);
        }
    }
    @GetMapping
    public List<Serie> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Serie procurar(@PathVariable int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        return false;
    }
}


