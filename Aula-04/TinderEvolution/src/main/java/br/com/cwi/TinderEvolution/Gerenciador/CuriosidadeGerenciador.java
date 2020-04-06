package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.CuriosidadesAcervo;
import br.com.cwi.TinderEvolution.Dominio.Curiosidade;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/curiosidades")
public class CuriosidadeGerenciador {
    private CuriosidadesAcervo acervo = new CuriosidadesAcervo();
    @PostMapping
    public Curiosidade salvar(@RequestBody Curiosidade curiosidade){
        List<Curiosidade> curiosidades = acervo.listar();

        for (Curiosidade curiosidadeExistente : curiosidades){
            if (curiosidade.getDescrição().equals(curiosidadeExistente.getDescrição())){
                return curiosidadeExistente;
            }
        }
        if (curiosidade.getDescrição().isEmpty() || curiosidade.getCategoriaCuriosidade() == null){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        return acervo.salvar(curiosidade);
    }
    @PutMapping("/{id}")
    public Curiosidade editar(@PathVariable int id,@RequestBody Curiosidade curiosidadeAtualizada){
        Curiosidade curiosidadeParaEditar = procurar(id);

        if (curiosidadeParaEditar == null){
            return null;
        } else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }
    @GetMapping
    public List<Curiosidade> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Curiosidade procurar(@PathVariable int id){
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
