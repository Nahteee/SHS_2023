/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.java.SHS;

import SHS.UI.UI_Login;

/**
 *
 * @author User
 */
public class Student_Hostel_System {

    
    private void initialize(){
        UI_Login lu = new UI_Login();
        lu.setVisible(true);

    }
    
    public static void main(String[] args) {
        Student_Hostel_System main = new Student_Hostel_System();
        main.initialize();
    }
}
