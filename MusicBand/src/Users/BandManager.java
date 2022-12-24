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
public class BandManager {
     private String name, password;
 
   
   

    public BandManager(String name, String password) {
        this.password = password;
        this.name = name;
       
    }
    

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    
   
    
    
    
      public static BandManager Login(String name, String password) 
    {
        try {
            File file = new File("BandManagerLogin.txt");
            Scanner sc;
            String str = null;
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String[] tokens = str.split(",");
                if (tokens[0].equals(name)) {
                    if (tokens[1].equals(password))
                    {
                        
                        BandManager newBandManager = new BandManager(tokens[0],tokens[1]);
                        return newBandManager;
                        
                        
                        
                    }
                }
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BandManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static void ViewProfile()
     {
         
     }
    
     public static void CreateBooking()
     {
         
     }
     
     public static void CreateSchedule()
     {
         
     }
     
     public static void SendMessage()
     {
         
     }
     
     public static void Review()
     {
         
     }
     
     public static void Help()
     {
         
     }
     
     public static void Logout()
     {
         
     }

}
