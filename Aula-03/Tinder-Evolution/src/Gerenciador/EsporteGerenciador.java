package Gerenciador;

import Acervo.EsportesAcervo;
import Dominio.Esporte;

import java.time.LocalDate;
import java.util.List;

public class EsporteGerenciador {
    private EsportesAcervo acervo = new EsportesAcervo();

    public Esporte salvar(Esporte esporte){
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
    public Esporte editar(int id, Esporte esporteAtualizada){
        Esporte esporteParaEditar = procurar(id);

        if (esporteParaEditar == null){
            return null;
        } else {
            return acervo.editar(esporteParaEditar, esporteAtualizada);
        }
    }
    public List<Esporte> listar(){

        return acervo.listar();
    }
    public Esporte procurar(int id){
        if (id > 0){
            return acervo.procurar(id);
        }
        return null;
    }
    public boolean deletar(int id){
        if (id > 0){
            return acervo.deletar(id);
        }
        return false;
    }
}
