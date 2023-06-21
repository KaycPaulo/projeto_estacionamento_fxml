package ifpr.pgua.eic.exemplo.controllers;
import javafx.fxml.FXML;
import ifpr.pgua.eic.exemplo.App;
import javafx.event.ActionEvent;

public class TelaPrincipal {

    @FXML
    void abrirTelaCadastro(ActionEvent event) 
    {
        App.pushScreen("CADASTRO");
    }

    @FXML
    void abrirTelaVisualizar(ActionEvent event) 
    {
        App.pushScreen("VISUALIZAR");
    }

}
