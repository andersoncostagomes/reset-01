package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Série;

import java.util.ArrayList;
import java.util.List;

public class SérieAcervo {
    public static int contador = 1;
    public static final List<Série> séries = new ArrayList<>();

    public Série salvar(Série série){
        série.setId(contador++);
        séries.add(série);
        return série;
    }

    public List<Série> listar(){
        return séries;
    }

    public Série procurar(int id){
        for(Série série: séries){
            if(série.getId() == id){
                return série;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Série sérieParaDeletar = procurar(id);
        if(sérieParaDeletar != null){
            return séries.remove(sérieParaDeletar);
        }
        return false;
    }
    public Série editar(Série sérieParaEditar, Série sérieAtualizada){
        sérieParaEditar.setNome(sérieAtualizada.getNome());
        sérieParaEditar.setDiretor(sérieAtualizada.getDiretor());
        sérieParaEditar.setDataDeLançamento(sérieAtualizada.getDataDeLançamento());
        sérieParaEditar.setNumeroTemporadas(sérieAtualizada.getNumeroTemporadas());
        sérieParaEditar.setNumeroEpisódios(sérieAtualizada.getNumeroEpisódios());
        sérieParaEditar.setCategoriaSérie(sérieAtualizada.getCategoriaSérie());
        sérieParaEditar.setSinopse(sérieAtualizada.getSinopse());

        return sérieParaEditar;
    }

}
