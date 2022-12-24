/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class FeedbackController implements Initializable {

    private TextArea feedback;
    @FXML
    private TextArea client;
    @FXML
    private TextArea bandmanager;
    @FXML
    private TextArea musiclabel;
    @FXML
    private TextArea bandmember;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    private void feedback(MouseEvent event) {
          try {
        Scanner s = new Scanner(new File("ClientFeedback.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                client.appendText(s.nextInt() + ""); 
            } else {
               client.appendText(s.next() + ""); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }

 }
        
    
     @FXML
    private void feedback1(MouseEvent event) {
     try {
        Scanner s = new Scanner(new File("BandManagerFeedback.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                bandmanager.appendText(s.nextInt() + ""); 
            } else {
               bandmanager.appendText(s.next() + ""); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    }

    @FXML
    private void feedback2(MouseEvent event) {
      try {
        Scanner s = new Scanner(new File("BandMemberFeedback.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                bandmember.appendText(s.nextInt() + ""); 
            } else {
               bandmember.appendText(s.next() + ""); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    }

    @FXML
    private void feedback3(MouseEvent event) {
           try {
        Scanner s = new Scanner(new File("MusicLabelFeedback.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                musiclabel.appendText(s.nextInt() + ""); 
            } else {
               musiclabel.appendText(s.next() + ""); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    }

}
