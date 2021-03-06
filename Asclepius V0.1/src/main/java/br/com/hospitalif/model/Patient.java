package br.com.hospitalif.model;

import java.util.List;

public class Patient extends Person{

    private int idPaciente;
    private List<EnfermidadePessoal> doenca;
    private List<Entrada> historico;


    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public List<EnfermidadePessoal> getDoenca() {
        return doenca;
    }

    public void setDoenca(List<EnfermidadePessoal> doenca) {
        this.doenca = doenca;
    }

    public List<Entrada> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Entrada> historico) {
        this.historico = historico;
    }

}
