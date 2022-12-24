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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class NotesController implements Initializable {

    @FXML
    private TextArea notes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openFile(ActionEvent event) throws FileNotFoundException {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter
        ("Text files", "*.txt"));
        File f = fc.showOpenDialog(null);
        String str = "";
        if(f != null){
            Scanner sc = new Scanner(f);
            
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                if(s.equals("--"))
                    str+="\n";
                else
                    str+= s;
            }
            
            notes.setText(str);
            
            
        }
     
    }


    @FXML
    private void saveFile(ActionEvent event) throws IOException {
         File f = null;
        FileWriter fw = null;
        
        try {
            
            f = new File("Notes.txt");      
            
            if(f.exists()) fw = new FileWriter(f,true);
            
            else fw = new FileWriter(f);
           
            fw.write( notes.getText()+"--" );           
            
        } catch (IOException ex) {
            
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
               
            }
        }
        
    }
    
}
