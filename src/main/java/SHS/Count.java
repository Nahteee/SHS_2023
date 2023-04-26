/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SHS;

import java.io.*;

/**
 *
 * @author User
 */
public class Count {
    protected String str;
    protected int index;
    
    int Users() {
        try{
        BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            int rows = 0;
            while((str = br.readLine()) != null) //Count Lines in file
            {   
                rows = rows + 1;
            }
            br.close();
            return rows;
        }
        catch(IOException ioe) 
         {
            ioe.printStackTrace();
            return 0;
        }
        
    }
}
