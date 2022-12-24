
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
public class MusicLabelHomepageController implements Initializable {

    @FXML
    private TextArea Notice;

    /**
     * Initializes the controller class.
     */
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

        Parent root = FXMLLoader.load(getClass().getResource("ViewProfile5.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("UserProfile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void bandReport(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("BandSummary.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Band Report");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void createContract(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Create Contract.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Create Contract");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    @FXML
    private void bandList(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Bandlist.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Bandlist");
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
        
    }

    @FXML
    private void helpButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Help4.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Help");
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }

    @FXML
    private void logOut(ActionEvent event) {
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
