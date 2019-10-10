package br.com.hospitalif.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import util.Rotas;

public class SystemIFController {

    @FXML
    private Button btnCad1;

    @FXML
    private Button btnCad2;

    @FXML
    private Button btnCad3;

    @FXML
    private Button btnCad4;

    @FXML
    private Button btnCad5;

    @FXML
    private Button btnCad6;

    @FXML
    private Button btnCad7;

    @FXML
    private Button btnCad8;

    @FXML
    void cadastrarAdministrador(ActionEvent event) throws Exception {
        Main.openPage(Route.ADMINISTRATOR);
    }

    @FXML
    void cadastrarAtendente(ActionEvent event) throws Exception {
        Main.openPage(Route.ATTENDANT);
    }

    @FXML
    void cadastrarAtendimento(ActionEvent event) throws Exception {
        Main.openPage(Route.ATTENDANCE);
    }

    @FXML
    void cadastrarEnferPes(ActionEvent event) throws Exception {
        Main.openPage(Route.PERSONALDISEASE);
    }

    @FXML
    void cadastrarEnfermeiro(ActionEvent event) throws Exception {
        Main.openPage(Route.NURSE);
    }

    @FXML
    void cadastrarGerente(ActionEvent event) throws Exception {
        Main.openPage(Route.MANAGER);
    }

    @FXML
    void cadastrarMedico(ActionEvent event) throws Exception {
        Main.openPage(Route.DOCTOR);
    }

    @FXML
    void cadastrarPaciente(ActionEvent event) throws Exception {
        Main.openPage(Route.PATIENT);
    }

}
