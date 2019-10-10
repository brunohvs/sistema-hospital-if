package br.com.hospitalif.model;

public class PersonalDisease extends Disease {

    private int idEnfermidadePessoal;
    private String comentario;
    private String statusDeEnfermidade;

    public PersonalDisease() {
    }

    public int getIdEnfermidadePessoal() {
        return idEnfermidadePessoal;
    }

    public void setIdEnfermidadePessoal(int idEnfermidadePessoal) {
        this.idEnfermidadePessoal = idEnfermidadePessoal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getStatusDeEnfermidade() {
        return statusDeEnfermidade;
    }

    public void setStatusDeEnfermidade(String statusDeEnfermidade) {
        this.statusDeEnfermidade = statusDeEnfermidade;
    }

}
