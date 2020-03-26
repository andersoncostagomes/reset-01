package Gerenciador;

import Acervo.SérieAcervo;
import Dominio.Série;

import java.time.LocalDate;
import java.util.List;

public class SérieGerenciador {
    private SérieAcervo acervo = new SérieAcervo();

    public Série salvar(Série série){
        List<Série> séries = acervo.listar();

        for (Série sérieExistente : séries){
            if (série.getNome().equals(sérieExistente.getNome())){
                return sérieExistente;
            }
        }
        if (série.getNome().isEmpty() || série.getDiretor().isEmpty() || série.getCategoriaSérie() == null || série.getDataDeLançamento() == null || série.getNumeroTemporadas() == 0 || série.getNumeroEpisódios() == 0){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (série.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(série);
    }
    public Série editar(int id, Série sérieAtualizada){
        Série sérieParaEditar = procurar(id);

        if (sérieParaEditar == null){
            return null;
        } else {
            return acervo.editar(sérieParaEditar, sérieAtualizada);
        }
    }
    public List<Série> listar(){

        return acervo.listar();
    }
    public Série procurar(int id){
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


