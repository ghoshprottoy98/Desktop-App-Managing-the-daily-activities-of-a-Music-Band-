/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import Users.Admin;
import java.io.File;
import java.io.FileNotFoundException;
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
public class AdminLoginController implements Initializable {

    @FXML
    private TextField user;
    @FXML
    private PasswordField pass;
    @FXML
    private Label label;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButton(ActionEvent event) throws IOException  
    {
           Admin a=Admin.Login(user.getText(), pass.getText());
           
           if (a!=null)
           {
            Parent adminHomepage = FXMLLoader.load(getClass().getResource("AdminHomepage.fxml"));
            Scene adminHomepagescene = new Scene(adminHomepage);
        
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(adminHomepagescene);
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
