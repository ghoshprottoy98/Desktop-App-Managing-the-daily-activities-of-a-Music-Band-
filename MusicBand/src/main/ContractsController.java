/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class ContractsController implements Initializable {

    @FXML
    private TextField viewContract;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
        Scanner s = new Scanner(new File("Contract.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                viewContract.appendText(s.nextInt() + " "); 
            } else {
               viewContract.appendText(s.next() + " "); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }
    
        
    }    


   
        
    
    
}
