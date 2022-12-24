/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class BandMemberHomepageController implements Initializable {

    @FXML
    private TextArea Notice;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
        Scanner s = new Scanner(new File("Notice.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                Notice.appendText(s.nextInt() + " "); 
            } else {
               Notice.appendText(s.next() + " "); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    
    }    

    @FXML
    private void profileView(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("ViewProfile4.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("UserProfile");
        primaryStage.setScene(scene);
        primaryStage.show();
          
      }

    @FXML
    private void notesButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Notes.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Notes");
        primaryStage.setScene(scene);
        primaryStage.show();
          
    }

    @FXML
    private void scheduleButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Schedule");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @FXML
    private void contractButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Contracts.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Contracts");
        primaryStage.setScene(scene);
        primaryStage.show();
       
     }

    @FXML
    private void logoutButton(ActionEvent event) {
          try {
            Parent mainPage = FXMLLoader.load(getClass().getResource("Mainpage.fxml"));
            Scene mainPagescene = new Scene(mainPage);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(mainPagescene);
            window.show();
        } catch (IOException ex){
        
        }
    }

    @FXML
    private void helpButton(ActionEvent event)  throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Help3.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Help");
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }
    
}
