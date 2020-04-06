package br.com.cwi.TinderEvolution.Gerenciador;

import br.com.cwi.TinderEvolution.Acervo.ListadeUsuários;
import br.com.cwi.TinderEvolution.Dominio.Usuário;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuárioGerenciador {
    private ListadeUsuários listaUsuário = new ListadeUsuários();
    @PostMapping
    public Usuário cadastrar(@RequestBody Usuário usuário){
        List<Usuário> usuários = listaUsuário.listar();

        for (Usuário usuárioExistente : usuários){
            if (usuário.getEmail().equals(usuárioExistente.getEmail())){
                System.out.println("O e-mail cadastrado já existe.");
                return usuárioExistente;
            }
        }
        if (usuário.getNome().isEmpty() || usuário.getEmail().isEmpty() || usuário.getTelefone().isEmpty() || usuário.getDataDeNascimento() == null || usuário.getBiografia().isEmpty() ){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (usuário.getDataDeNascimento().plusYears(18).isAfter(LocalDate.now())){
            return null;
        }
        return listaUsuário.cadastrar(usuário);
    }
    @PutMapping("/{id}")
    public Usuário editar(@PathVariable int id,@RequestBody Usuário usuárioAtualizado){
        Usuário usuárioParaEditar = procurar(id);

        if (usuárioParaEditar == null){
            return null;
        } else {
            return listaUsuário.editar(usuárioParaEditar, usuárioAtualizado);
        }
    }
    @GetMapping
    public List<Usuário> listar(){

        return listaUsuário.listar();
    }
    @GetMapping("/{id}")
    public Usuário procurar(@PathVariable int id){
        if (id > 0){
            return listaUsuário.procurar(id);
        }
        return null;
    }
    @DeleteMapping
    public boolean deletar(@PathVariable int id){
        if (id > 0){
            return listaUsuário.deletar(id);
        }
        return false;
    }
}
