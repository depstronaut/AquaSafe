package AquaSafeFXML;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.awt.Desktop;

public class ControllerLogin {
    @FXML
    private Button butToDaftar;

    @FXML
    private Button butToKembali;

    @FXML
    private Button butToGoogle;

    @FXML
    public void ToDaftar(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butToDaftar.getScene().getWindow();
        p.close();
    }

    @FXML
    public void ToKembali(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butToDaftar.getScene().getWindow();
        p.close();
    }

    @FXML
    void loginGoogle(ActionEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&flowName=GlifWebSignIn&flowEntry=AddSession"));
    }

}
