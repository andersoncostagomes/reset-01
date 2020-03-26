package Gerenciador;

import Acervo.CuriosidadesAcervo;
import Dominio.Curiosidade;

import java.time.LocalDate;
import java.util.List;

public class CuriosidadeGerenciador {
    private CuriosidadesAcervo acervo = new CuriosidadesAcervo();

    public Curiosidade salvar(Curiosidade curiosidade){
        List<Curiosidade> curiosidades = acervo.listar();

        for (Curiosidade curiosidadeExistente : curiosidades){
            if (curiosidade.getDescrição().equals(curiosidadeExistente.getDescrição())){
                return curiosidadeExistente;
            }
        }
        if (curiosidade.getDescrição().isEmpty() || curiosidade.getCategoriaCuriosidade() == null){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        return acervo.salvar(curiosidade);
    }
    public Curiosidade editar(int id, Curiosidade curiosidadeAtualizada){
        Curiosidade curiosidadeParaEditar = procurar(id);

        if (curiosidadeParaEditar == null){
            return null;
        } else {
            return acervo.editar(curiosidadeParaEditar, curiosidadeAtualizada);
        }
    }
    public List<Curiosidade> listar(){

        return acervo.listar();
    }
    public Curiosidade procurar(int id){
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
