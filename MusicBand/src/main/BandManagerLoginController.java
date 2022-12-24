/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Users.BandManager;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class BandManagerLoginController implements Initializable {

    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButton(ActionEvent event) throws IOException 
    {
      BandManager b=BandManager.Login(user.getText(), pass.getText());
           
           if (b!=null)
        {
            Parent bandmanagerHomepage = FXMLLoader.load(getClass().getResource("BandmanagerHomepage.fxml"));
            Scene bandmanagerHomepagescene = new Scene(bandmanagerHomepage);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(bandmanagerHomepagescene);
            window.show();
        }
           
           else
           {
               label.setText("Re-Enter Valid Username And Or Password");
           }
           
 }

    @FXML
    private void backButton(ActionEvent event) {
         try {
            Parent mainPage = FXMLLoader.load(getClass().getResource("Mainpage.fxml"));
            Scene mainPagescene = new Scene(mainPage);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(mainPagescene);
            window.show();
        } catch (IOException ex){
        
        }
    }
    
}
