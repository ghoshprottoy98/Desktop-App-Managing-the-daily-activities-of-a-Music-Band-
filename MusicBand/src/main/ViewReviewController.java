
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


public class ViewReviewController implements Initializable {

    @FXML
    private TextField viewReview;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    
        
    }    

    @FXML
    private void readReview(ActionEvent event) throws IOException {
           try {
        Scanner s = new Scanner(new File("Review.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                viewReview.appendText(s.nextInt() + ""); 
            } else {
               viewReview.appendText(s.next() + ""); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    }
    

       
    }    
    

