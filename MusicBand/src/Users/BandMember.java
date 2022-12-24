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
public class BandMember {
     private String name, password, email;
    private int phone;
    
 
    public BandMember(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

     public static BandMember Login(String name, String password) 
    {
       
    
        try {
            File file = new File("BandMemberLogin.txt");
            Scanner sc;
            String str = null;
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String[] tokens = str.split(",");
                if (tokens[0].equals(name)) {
                    if (tokens[1].equals(password))
                    {
                        
                        BandMember newBandMember = new BandMember(tokens[0],tokens[1]);
                        return newBandMember;
                        
                        
                        
                    }
                }
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BandMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static void Notes()
    { 
        
    }
    
    public static void ViewProfile()
    {
        
    }
    
    public static void Schedule()
    {
    }
    
    
   public static void Help()
    {
        
        
    }
   
   public static void Contract()
   {
   
   }
   
   public static void Logout()
   {
   
   }
    
    }
