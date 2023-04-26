/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

/**
 *
 * @author User
 */
public class User {
    protected int userId;
    protected String username;
    protected String userEmail;
    protected String password;
    protected int age;
    protected Gender gender;
    protected String picturePath;
    protected String contact;
    protected String card;
    protected String address;
    protected UserRole role;

    public User(int userId, String username, String userEmail, String password, int age, Gender gender, String picturePath, String contact, String card, String address, UserRole role) {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.picturePath = picturePath;
        this.contact = contact;
        this.card = card;
        this.address = address;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
    


}
