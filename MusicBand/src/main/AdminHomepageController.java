
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
import javafx.stage.Stage;


public class AdminHomepageController implements Initializable {

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
    }    

    @FXML
    private void createBackup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Alert2.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void logoutButton(ActionEvent event) {  try {
            Parent mainPage = FXMLLoader.load(getClass().getResource("Mainpage.fxml"));
            Scene mainPagescene = new Scene(mainPage);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(mainPagescene);
            window.show();
        } catch (IOException ex){
        
        }
        
    }

    @FXML
    private void noticeButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminNotice.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("AdminNotice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void checkSystem(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Alert1.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    @FXML
    private void feedbackButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Feedback.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Feedback");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void viewProfile(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("ViewProfile6.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("View Profile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        
        
        
    
}

    

