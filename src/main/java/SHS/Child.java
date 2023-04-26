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
public class Child extends User{

    
    public Child(int userId, String username, String userEmail, String password, int age, Gender gender, String picturePath, String contact, String card, String address, UserRole role) {
        super(userId, username, userEmail, password, age, gender, picturePath, contact, card, address, role);
    }
    
    
    
}
