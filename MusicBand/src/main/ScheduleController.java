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
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class ScheduleController implements Initializable {

    @FXML
    private TextField schedule;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void viewButton(ActionEvent event) throws FileNotFoundException {
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
            
            schedule.setText(str);
            
            
        }
     
    }

    @FXML
    private void createButton(ActionEvent event) {
      try{
          File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
          
          
      
        
  

    @FXML
    private void saveButton(ActionEvent event) {
         File f = null;
        FileWriter fw = null;
        
        try {
            
            f = new File("schedule.txt");      
            
            if(f.exists()) fw = new FileWriter(f,true);
            
            else fw = new FileWriter(f);
           
            fw.write(schedule.getText()+" -- " );           
            
        } catch (IOException ex) {
            
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
               
            }
        }
        
    }
    
}
