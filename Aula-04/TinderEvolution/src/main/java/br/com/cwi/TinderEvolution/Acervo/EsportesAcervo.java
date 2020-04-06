package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Esporte;

import java.util.ArrayList;
import java.util.List;

public class EsportesAcervo {
    public static int contador = 1;
    public static final List<Esporte> esportes = new ArrayList<>();

    public Esporte salvar(Esporte esporte){
        esporte.setId(contador++);
        esportes.add(esporte);
        return esporte;
    }

    public List<Esporte> listar(){
        return esportes;
    }

    public Esporte procurar(int id){
        for(Esporte esporte: esportes){
            if(esporte.getId() == id){
                return esporte;
            }
        }
        return null;
    }

    public boolean deletar(int id){
        Esporte esporteParaDeletar = procurar(id);
        if(esporteParaDeletar != null){
            return esportes.remove(esporteParaDeletar);
        }
        return false;
    }
    public Esporte editar(Esporte esporteParaEditar, Esporte esporteAtualizada){
        esporteParaEditar.setNome(esporteAtualizada.getNome());

        return esporteParaEditar;
    }
}
