package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Curiosidade;

import java.util.ArrayList;
import java.util.List;

public class CuriosidadesAcervo {
    public static int contador = 1;
    public static final List<Curiosidade> curiosidades = new ArrayList<>();

    public Curiosidade salvar(Curiosidade curiosidade){
        curiosidade.setId(contador++);
        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar(){
        return curiosidades;
    }

    public Curiosidade procurar(int id){
        for(Curiosidade curiosidade: curiosidades){
            if(curiosidade.getId() == id){
                return curiosidade;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Curiosidade curiosidadeParaDeletar = procurar(id);
        if(curiosidadeParaDeletar != null){
            return curiosidades.remove(curiosidadeParaDeletar);
        }
        return false;
    }
    public Curiosidade editar(Curiosidade curiosidadeParaEditar, Curiosidade curiosidadeAtualizada){
        curiosidadeParaEditar.setCategoriaCuriosidade(curiosidadeAtualizada.getCategoriaCuriosidade());
        curiosidadeParaEditar.setDescrição(curiosidadeAtualizada.getDescrição());

        return curiosidadeParaEditar;
    }
}
