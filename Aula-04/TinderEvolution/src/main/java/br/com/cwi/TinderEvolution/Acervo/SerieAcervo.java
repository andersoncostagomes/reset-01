package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Serie;

import java.util.ArrayList;
import java.util.List;

public class SerieAcervo {
    public static int contador = 1;
    public static final List<Serie> séries = new ArrayList<>();

    public Serie salvar(Serie série){
        série.setId(contador++);
        séries.add(série);
        return série;
    }

    public List<Serie> listar(){
        return séries;
    }

    public Serie procurar(int id){
        for(Serie série: séries){
            if(série.getId() == id){
                return série;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Serie sérieParaDeletar = procurar(id);
        if(sérieParaDeletar != null){
            return séries.remove(sérieParaDeletar);
        }
        return false;
    }
    public Serie editar(Serie sérieParaEditar, Serie sérieAtualizada){
        sérieParaEditar.setNome(sérieAtualizada.getNome());
        sérieParaEditar.setDiretor(sérieAtualizada.getDiretor());
        sérieParaEditar.setDataDeLançamento(sérieAtualizada.getDataDeLançamento());
        sérieParaEditar.setNumeroTemporadas(sérieAtualizada.getNumeroTemporadas());
        sérieParaEditar.setNumeroEpisódios(sérieAtualizada.getNumeroEpisódios());
        sérieParaEditar.setCategoriaSerie(sérieAtualizada.getCategoriaSerie());
        sérieParaEditar.setSinopse(sérieAtualizada.getSinopse());

        return sérieParaEditar;
    }

}
