package Gerenciador;

import Acervo.ListadeUsuários;
import Dominio.Musica;
import Dominio.Usuário;

import java.time.LocalDate;
import java.util.List;

public class UsuárioGerenciador {
    private ListadeUsuários listaUsuário = new ListadeUsuários();

    public Usuário cadastrar(Usuário usuário){
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
    public Usuário editar(int id, Usuário usuárioAtualizado){
        Usuário usuárioParaEditar = procurar(id);

        if (usuárioParaEditar == null){
            return null;
        } else {
            return listaUsuário.editar(usuárioParaEditar, usuárioAtualizado);
        }
    }
    public List<Usuário> listar(){

        return listaUsuário.listar();
    }
    public Usuário procurar(int id){
        if (id > 0){
            return listaUsuário.procurar(id);
        }
        return null;
    }
    public boolean deletar(int id){
        if (id > 0){
            return listaUsuário.deletar(id);
        }
        return false;
    }
}
