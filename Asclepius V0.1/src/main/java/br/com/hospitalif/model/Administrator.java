package br.com.hospitalif.model;

public class Administrator extends Manager {

    private int idAdministrador;

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public int cadastrarFuncionario(){
        return 1;
    }
}
