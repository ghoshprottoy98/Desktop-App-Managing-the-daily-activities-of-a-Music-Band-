/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghosh
 */
public class MusicLabel {
     private String name, password, email;
    private int phone;
    
     public MusicLabel(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

     public static MusicLabel Login(String name, String password) 
    {
       
    
        try {
            File file = new File("MusicLabelLogin.txt");
            Scanner sc;
            String str = null;
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String[] tokens = str.split(",");
                if (tokens[0].equals(name)) {
                    if (tokens[1].equals(password))
                    {
                        
                        MusicLabel newMusicLabel = new MusicLabel(tokens[0],tokens[1]);
                        return newMusicLabel;
                        
                        
                        
                    }
                }
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MusicLabel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static void ViewProfile()
     {
         
     }
     
     public static void BandReports()
     {
         
     }
     public static void CreateContract()
     {
         
     }
     public static void BandList()
    {
        
    }
     public static void Help()
     {
         
    }
     public static void Logout()
     {
         
     }
     
     
    }

