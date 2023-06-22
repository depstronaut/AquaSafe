package AquaSafeFXML;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerHome {
    @FXML
    private Button butToUnggahButton;

    @FXML
    private Button butToProfile;


    @FXML
    public void toUnggah(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butToUnggahButton.getScene().getWindow();
        p.close();
    }
    @FXML
    public void toProfile(ActionEvent event) throws IOException{
        Parent scene1 = FXMLLoader.load(getClass().getResource("ProfileDLH.fxml"));
        Scene scene = new Scene(scene1);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        Stage p = (Stage) butToProfile.getScene().getWindow();
        p.close();
    }
}
