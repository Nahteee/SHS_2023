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
public class AllArrays extends Count {
    String[][] getUsers () {
        try {
            Count c = new Count();
//            String str;
            index = 0;
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String[] users = new String[c.Users()];
            while((str = br.readLine()) != null) //Same with -1
            {   
                  users[index] = str;
                  index = index + 1;
            }
//             System.out.println(Arrays.toString(users));
             br.close();
             
             String [][] usersArray = new String[c.Users()][6];
             index = 0;
             for (String user: users) {
                 String part[] = user.split("/");
//                 System.out.println(Arrays.toString(part));
                 usersArray[index] = part;
                 index = index + 1;
             }
             return usersArray;
//             for (String[] thing: usersArray) {
//                 System.out.println(Arrays.toString(thing));
//             }
        }
        catch(IOException ioe) 
         {
            ioe.printStackTrace();
            System.out.println("Error");
            return null;
        }
    }
}
