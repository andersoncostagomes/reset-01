package br.com.cwi.TinderEvolution.Acervo;

import br.com.cwi.TinderEvolution.Dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class MusicaAcervo {
    private static int contador = 1;
    private static final List<Musica> musicas = new ArrayList<>();

    public Musica salvar(Musica musica) {
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {
        return musicas;
    }

    public static Musica procurar(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }
        return null;
    }
    public boolean deletar(int id){
        Musica musicaParaDeletar = procurar(id);
        if (musicaParaDeletar != null){
            return musicas.remove(musicaParaDeletar);
        }
        return false;
    }
    public Musica editar(Musica musicaParaEditar, Musica musicaAtualizada){
        musicaParaEditar.setNome(musicaAtualizada.getNome());
        musicaParaEditar.setArtista(musicaAtualizada.getArtista());
        musicaParaEditar.setLançamento(musicaAtualizada.getLançamento());
        musicaParaEditar.setEstiloMusical(musicaAtualizada.getEstiloMusical());

        return musicaParaEditar;
    }
}

