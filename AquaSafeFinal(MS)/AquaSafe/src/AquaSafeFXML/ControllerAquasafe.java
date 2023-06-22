package AquaSafeFXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerAquasafe {

    @FXML
    private Button butTamu;

    @FXML
    private Button butDaftar;

    @FXML
    public void tamu(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butTamu.getScene().getWindow();
        p.close();
    }
    @FXML
    public void daftar(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butDaftar.getScene().getWindow();
        p.close();
    }
    

    
}
