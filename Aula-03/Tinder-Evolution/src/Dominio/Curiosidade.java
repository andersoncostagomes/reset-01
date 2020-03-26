package Dominio;

public class Curiosidade {
    private int id;
    private CategoriaCuriosidade categoriaCuriosidade;
    private String descrição;

    public Curiosidade(CategoriaCuriosidade categoriaCuriosidade, String descrição) {
        this.categoriaCuriosidade = categoriaCuriosidade;
        this.descrição = descrição;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoriaCuriosidade getCategoriaCuriosidade() {
        return categoriaCuriosidade;
    }

    public void setCategoriaCuriosidade(CategoriaCuriosidade categoriaCuriosidade) {
        this.categoriaCuriosidade = categoriaCuriosidade;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    @Override
    public String toString(){
        return "Curiosidade { " +
                "id: " + id +
                ", Categoria: " + categoriaCuriosidade +
                ", Descrição: \n" + descrição + " }";
    }
}
