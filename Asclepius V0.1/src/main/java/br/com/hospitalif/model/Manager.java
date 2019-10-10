package br.com.hospitalif.model;

public class Manager extends Employee {

    private String cargo;

    public Gerente() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
