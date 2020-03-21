package PoderesDivinosArmasMagias;

public enum Tipo {

    ATAQUE_EM_AREA("Ataque em Area"),
    ATAQUE_COMUM("Ataque Comum");

    private String Tipo;
    Tipo(String Tipo){
        this.Tipo = Tipo;
    }
    public String getTipoDeAtaque(){
        return Tipo;
    }
}
