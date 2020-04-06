package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.FilmeAcervo;
import br.com.cwi.TinderEvolution.Dominio.Filme;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeGerenciador {
    private FilmeAcervo acervo = new FilmeAcervo();

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        List<Filme> filmes = acervo.listar();

        for (Filme filmeExistente : filmes){
            if (filme.getNome().equals(filmeExistente.getNome())){
                return filmeExistente;
            }
        }
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoriaFilme() == null || filme.getDataDeLançamento() == null || filme.getSinopse().isEmpty()){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (filme.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(filme);
    }
    @PutMapping("/{id}")
    public Filme editar(@PathVariable int id,@RequestBody Filme filmeAtualizada){
        Filme filmeParaEditar = procurar(id);

        if (filmeParaEditar == null){
            return null;
        } else {
            return acervo.editar(filmeParaEditar, filmeAtualizada);
        }
    }
    @GetMapping
    public List<Filme> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Filme procurar(@PathVariable int id){
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

