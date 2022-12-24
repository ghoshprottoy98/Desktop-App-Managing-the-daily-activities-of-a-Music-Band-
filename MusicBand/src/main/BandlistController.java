
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;


public class BandlistController implements Initializable {

    @FXML
    private TextArea Bandlist;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void showList(ActionEvent event) throws IOException {
        
           try {
        Scanner s = new Scanner(new File("BandList.txt")).useDelimiter("\\s+");
        while (s.hasNext()) {
            if (s.hasNextInt()) { 
                Bandlist.appendText(s.nextInt() + " "); 
            } else {
               Bandlist.appendText(s.next() + "."); 
            }
        }
    } catch (FileNotFoundException ex) {
        System.err.println(ex);
    }

    

}
}

