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


public class Admin {
    private String name, password, email;
    private int phone;
    
   

    public Admin(String name, String password) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static Admin Login(String name, String password) 
    {
       
    
        try {
            File file = new File("AdminLogin.txt");
            Scanner sc;
            String str = null;
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                str = sc.nextLine();
                String[] tokens = str.split(",");
                if (tokens[0].equals(name)) {
                    if (tokens[1].equals(password))
                    {
                        
                        Admin newAdmin = new Admin(tokens[0],tokens[1]);
                        return newAdmin;
                        
                        
                        
                    }
                }
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static void ViewFeedback()
    {
        
    }    
    
    public static void AdminNotice()
    {
        
    }
    public static void CheckSystem()
    {
        
    }
    public static void CreateBackup()
    {
        
    }
    
    public static void Logout()
    {
        
    }
    
}


