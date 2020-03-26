package Gerenciador;

import Acervo.FilmeAcervo;
import Dominio.Filme;

import java.time.LocalDate;
import java.util.List;

public class FilmeGerenciador {
    private FilmeAcervo acervo = new FilmeAcervo();

    public Filme salvar(Filme filme){
        List<Filme> filmes = acervo.listar();

        for (Filme filmeExistente : filmes){
            if (filme.getNome().equals(filmeExistente.getNome())){
                return filmeExistente;
            }
        }
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoriaFilme() == null || filme.getDataDeLançamento() == null || filme.getSinopse().isEmpty()){
            System.out.println("Campo obrigatório não informado.");
            return null;
        }
        if (filme.getDataDeLançamento().isAfter(LocalDate.now()) ){
            return null;
        }
        return acervo.salvar(filme);
    }
    public Filme editar(int id, Filme filmeAtualizada){
        Filme filmeParaEditar = procurar(id);

        if (filmeParaEditar == null){
            return null;
        } else {
            return acervo.editar(filmeParaEditar, filmeAtualizada);
        }
    }
    public List<Filme> listar(){

        return acervo.listar();
    }
    public Filme procurar(int id){
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

