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
                return esporteExistente;
            }
        }
        if (esporte.getNome().isEmpty()){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        return acervo.salvar(esporte);
    }
    @PutMapping("/{id}")
    public Esporte editar(@PathVariable int id,@RequestBody Esporte esporteAtualizada){
        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null){
            return null;
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
