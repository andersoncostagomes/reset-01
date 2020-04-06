package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Usuário;

import java.util.ArrayList;
import java.util.List;

public class ListadeUsuários {
    private static int contador = 1;
    private static final List<Usuário> usuários = new ArrayList<>();

    public Usuário cadastrar(Usuário usuário) {
        usuário.setId(contador++);
        usuários.add(usuário);
        return usuário;
    }

    public List<Usuário> listar() {
        return usuários;
    }

    public Usuário procurar(int id) {
        for (Usuário usuário : usuários) {
            if (usuário.getId() == id) {
                return usuário;
            }
        }
        return null;
    }
    public boolean deletar(int id){
        Usuário usuárioParaDeletar = procurar(id);
        if (usuárioParaDeletar != null){
            return usuários.remove(usuárioParaDeletar);
        }
        return false;
    }
    public Usuário editar(Usuário usuárioParaEditar, Usuário usuárioAtualizado){
        usuárioParaEditar.setNome(usuárioAtualizado.getNome());
        usuárioParaEditar.setEmail(usuárioAtualizado.getEmail());
        usuárioParaEditar.setTelefone(usuárioAtualizado.getTelefone());
        usuárioParaEditar.setDataDeNascimento(usuárioAtualizado.getDataDeNascimento());
        usuárioParaEditar.setLatitude(usuárioAtualizado.getLatitude());
        usuárioParaEditar.setLongitude(usuárioAtualizado.getLongitude());
        usuárioParaEditar.setBiografia(usuárioAtualizado.getBiografia());

        return usuárioParaEditar;
    }
}

