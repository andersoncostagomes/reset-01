package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.SérieAcervo;
import br.com.cwi.TinderEvolution.Dominio.Série;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/series")
public class SérieGerenciador {
    private SérieAcervo acervo = new SérieAcervo();
    @PostMapping
    public Série salvar(@RequestBody Série série){
        List<Série> séries = acervo.listar();

        for (Série sérieExistente : séries){
            if (série.getNome().equals(sérieExistente.getNome())){
                return sérieExistente;
            }
        }
        if (série.getNome().isEmpty() || série.getDiretor().isEmpty() || série.getCategoriaSérie() == null || série.getDataDeLançamento() == null || série.getNumeroTemporadas() == 0 || série.getNumeroEpisódios() == 0){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (série.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(série);
    }
    @PutMapping("/{id}")
    public Série editar(@PathVariable int id,@RequestBody Série sérieAtualizada){
        Série sérieParaEditar = procurar(id);

        if (sérieParaEditar == null){
            return null;
        } else {
            return acervo.editar(sérieParaEditar, sérieAtualizada);
        }
    }
    @GetMapping
    public List<Série> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Série procurar(@PathVariable int id){
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


