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

public class ControllerProfileDLH {
    @FXML
    private Button butToKembali;

    @FXML
    public void ToKembali(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


}
