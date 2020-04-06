package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.JogosAcervo;
import br.com.cwi.TinderEvolution.Dominio.Jogo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoGerenciador {
    private JogosAcervo acervo = new JogosAcervo();

    @PostMapping
    public Jogo salvar(@RequestBody Jogo jogo){
        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente : jogos){
            if (jogo.getNome().equals(jogoExistente.getNome()) || jogo.getPlataformaJogo().equals(jogoExistente.getPlataformaJogo())){
                return jogoExistente;
            }
        }
        if (jogo.getNome().isEmpty() || jogo.getDataDeLançamento() == null || jogo.getCategoriaJogo() == null || jogo.getPlataformaJogo() == null){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (jogo.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(jogo);
    }
    @PutMapping("/{id}")
    public Jogo editar(@PathVariable int id,@RequestBody Jogo jogoAtualizada){
        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null){
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizada);
        }
    }
    @GetMapping
    public List<Jogo> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Jogo procurar(@PathVariable int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }@DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        return false;
    }
}
