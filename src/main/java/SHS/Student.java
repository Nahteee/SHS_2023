/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

import main.java.SHS.User;

/**
 *
 * @author User
 */
public class Student extends User{

    
    public Student(int userId, String username, String userEmail, String password, int age, Gender gender, String picturePath, String contact, String card, String address, UserRole role) {
        super(userId, username, userEmail, password, age, gender, picturePath, contact, card, address, role);
    }

    public Student(int user_id) {
        super(user_id);
    }
    
    
    
}
