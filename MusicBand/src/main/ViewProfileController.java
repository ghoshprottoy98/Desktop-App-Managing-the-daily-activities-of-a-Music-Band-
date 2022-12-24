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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class ViewProfileController implements Initializable {

    @FXML
    private TextArea userInfo;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     * @throws java.io.IOException
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        userInfo.setText("");
        File f = null;
        FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        
     try {
            f = new File("ClientInfo.txt");
            sc = new Scanner(f);
            if(f.exists()){
                
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    userInfo.appendText(
                            "Name="+tokens[0]
                            +", D.O.B="+tokens[1]
                            +", Email="+tokens[2]
                            +", Phone="+tokens[3]+"\n"                    
                    );
                }
            }
            else 
                userInfo.setText("oops! ClientInfo.txt does not exist...");
        } 

      catch (IOException ex) {
      }
      }
}
