
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainpageController implements Initializable {
    
    private Label label;
    @FXML
    private ComboBox<String> combobox;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.getItems().addAll("Admin","Band Manager", "Band Member","Client","Music Label");
    }    


    @FXML
    private void selectButton(ActionEvent event) throws IOException {
         if(combobox.getValue().toString().equals("Band Manager"))
        {
            Parent bandmanagerLogin = FXMLLoader.load(getClass().getResource("BandManagerLogin.fxml"));
            Scene bandmanagerLoginscene = new Scene(bandmanagerLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(bandmanagerLoginscene);
            window.show();
        }
        else if(combobox.getValue().toString().equals("Admin"))
        {
            Parent adminLogin = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
            Scene adminLoginscene = new Scene(adminLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(adminLoginscene);
            window.show();
        }
        else if(combobox.getValue().toString().equals("Band Member"))
        {
            Parent bandmemberLogin = FXMLLoader.load(getClass().getResource("BandMemberLogin.fxml"));
            Scene bandmemberLoginscene = new Scene(bandmemberLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(bandmemberLoginscene);
            window.show();
        }
        else if(combobox.getValue().toString().equals("Client"))
        {
            Parent clientLogin = FXMLLoader.load(getClass().getResource("ClientLogin.fxml"));
            Scene clientLoginscene = new Scene(clientLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(clientLoginscene);
            window.show();
        }
        else if(combobox.getValue().toString().equals("Music Label"))
        {
            Parent musiclabelLogin = FXMLLoader.load(getClass().getResource("MusicLabelLogin.fxml"));
            Scene musiclabelLoginscene = new Scene(musiclabelLogin);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(musiclabelLoginscene);
            window.show();
         }
    
}
}
