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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class ViewProfile5Controller implements Initializable {

    @FXML
    private TextArea userInfo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userInfo.setText("");
        File f = null;
        FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        
     try {
            f = new File("MusicLabelInfo.txt");
            sc = new Scanner(f);
            if(f.exists()){
 
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    userInfo.appendText(
                            "Name="+tokens[0]
                            +", D.O.C="+tokens[1]
                            +", Email="+tokens[2]
                            +", Phone="+tokens[3]+"\n"                    
                    );
                }
            }
            else 
                userInfo.setText("oops! MusicLabelInfo.txt does not exist...");
        } 

      catch (IOException ex) {
      }
      }
        
    }    
    

