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

    
    public Student(int userId, String username, String userEmail, String password, int age, Gender gender, String contact, String card, UserRole role) {
        super(userId, username, userEmail, password, age, gender, contact, card, role);
    }

    public Student(int user_id) {
        super(user_id);
    }

    public int getUserId() {
        return super.userId;
    }

    public void setUserId(int userId) {
        super.userId = userId;
    }

    public String getUsername() {
        return super.username;
    }

    public void setUsername(String username) {
        super.username = username;
    }

    public String getUserEmail() {
        return super.userEmail;
    }

    public void setUserEmail(String userEmail) {
        super.userEmail = userEmail;
    }

    public String getPassword() {
        return super.password;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    public int getAge() {
        return super.age;
    }

    public void setAge(int age) {
        super.age = age;
    }

    public Gender getGender() {
        return super.gender;
    }

    public void setGender(Gender gender) {
        super.gender = gender;
    }

    public String getContact() {
        return super.contact;
    }

    public void setContact(String contact) {
        super.contact = contact;
    }

    public String getCard() {
        return super.card;
    }

    public void setCard(String card) {
        super.card = card;
    }

    public UserRole getRole() {
        return super.role;
    }

    public void setRole(UserRole role) {
        super.role = role;
    }
    
    
     
    

    
    
}
