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
                throw new RuntimeException("Este filme já foi cadastrado.");
            }
        }
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoriaFilme() == null || filme.getDataDeLançamento() == null || filme.getSinopse().isEmpty()){
            System.out.println("Campo obrigatório não informado.");
            throw new RuntimeException("Campo obrigatório não informado.");

        }
        if (filme.getDataDeLançamento().isAfter(LocalDate.now()) ){
            throw new RuntimeException("Não pode ser cadastrado um filme com data de lançamento futura.");
        }
        return acervo.salvar(filme);
    }
    @PutMapping("/{id}")
    public Filme editar(@PathVariable int id,@RequestBody Filme filmeAtualizada){
        Filme filmeParaEditar = procurar(id);

        if (filmeParaEditar == null){
            throw new RuntimeException("Filme não cadastrado.");
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
        throw new RuntimeException("Filme não cadastrado.");
    }
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        throw new RuntimeException("Filme não cadastrado.");
    }
}

