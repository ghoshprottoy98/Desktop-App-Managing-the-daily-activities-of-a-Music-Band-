/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class AdminNoticeController implements Initializable {

    @FXML
    private TextArea notice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendButton(ActionEvent event) {
        File f = null;
        FileWriter fw = null;
        
        try {
            
            f = new File("Notice.txt");      
            
            if(f.exists()) fw = new FileWriter(f,true);
            
            else fw = new FileWriter(f);
           
            fw.write(notice.getText()+" -- " );           
            
        } catch (IOException ex) {
            
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
               
            }
        }
        
    }
    
}
