/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class SearchBandController implements Initializable {

    @FXML
    private TextArea showBandList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showBand(ActionEvent event) {
        
       showBandList.setText("");
        File f = null;
        FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        
     try {
            f = new File("Bookings.txt");
            sc = new Scanner(f);
            if(f.exists()){
 
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    showBandList.appendText(
                            
                            "Band Name="+tokens[0]
                            +", Date & Time="+tokens[1]
                            +", Location="+tokens[2]
                            +", Phone="+tokens[3]
                            +", Band Name="+tokens[4]
                            +", Date & Time="+tokens[5]
                            +", Location="+tokens[6]
                            +", Phone="+tokens[7]+"\n" 
                                   
                     );
                }
            }
            else 
                showBandList.setText("oops! MusicLabelInfo.txt does not exist...");
        } 

      catch (IOException ex) {
      }
      }
    
}
