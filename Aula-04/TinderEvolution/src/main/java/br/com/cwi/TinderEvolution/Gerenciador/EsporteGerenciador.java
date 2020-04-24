package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.EsportesAcervo;
import br.com.cwi.TinderEvolution.Dominio.Esporte;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/esportes")

public class EsporteGerenciador {
    private EsportesAcervo acervo = new EsportesAcervo();
    @PostMapping
    public Esporte salvar(@RequestBody Esporte esporte){
        List<Esporte> esportes = acervo.listar();

        for (Esporte esporteExistente : esportes){
            if (esporte.getNome().equals(esporteExistente.getNome())){
                throw new RuntimeException("Este esporte já foi cadastrado.");
            }
        }
        if (esporte.getNome().isEmpty()){
            System.out.println("Campo obrigatório não informado.");
            throw new RuntimeException("Campo obrigatório não informado.");
        }
        return acervo.salvar(esporte);
    }
    @PutMapping("/{id}")
    public Esporte editar(@PathVariable int id,@RequestBody Esporte esporteAtualizada){
        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null){
            throw new RuntimeException("Esporte não cadastrado.");
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizada);
        }
    }
    @GetMapping
    public List<Esporte> listar(){

        return acervo.listar();
    }
    @GetMapping("/{id}")
    public Esporte procurar(@PathVariable int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        throw new RuntimeException("Esporte não cadastrado.");
    }
    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        throw new RuntimeException("Esporte não cadastrado.");
    }
}
