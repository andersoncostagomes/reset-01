package Gerenciador;

import Acervo.JogosAcervo;
import Dominio.Jogo;

import java.time.LocalDate;
import java.util.List;

public class JogoGerenciador {
    private JogosAcervo acervo = new JogosAcervo();

    public Jogo salvar(Jogo jogo){
        List<Jogo> jogos = acervo.listar();

        for (Jogo jogoExistente : jogos){
            if (jogo.getNome().equals(jogoExistente.getNome()) || jogo.getPlataformaJogo().equals(jogoExistente.getPlataformaJogo())){
                return jogoExistente;
            }
        }
        if (jogo.getNome().isEmpty() || jogo.getDataDeLançamento() == null || jogo.getCategoriaJogo() == null || jogo.getPlataformaJogo() == null){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (jogo.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(jogo);
    }
    public Jogo editar(int id, Jogo jogoAtualizada){
        Jogo jogoParaEditar = procurar(id);

        if (jogoParaEditar == null){
            return null;
        } else {
            return acervo.editar(jogoParaEditar, jogoAtualizada);
        }
    }
    public List<Jogo> listar(){

        return acervo.listar();
    }
    public Jogo procurar(int id){
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
