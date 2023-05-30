/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private boolean availability;
    private double price;

    // Constructor
public Room(int roomNumber,RoomType roomType, String availability, double price) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.availability = true;
    this.price = price;
    
}

    // Getter and setter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Methods


    public String toString() {
        return  "Room Number: " + roomNumber + "\n"
                + "Room Type: " + roomType + "\n"
                + "Availability: " + availability + "\n"
                + "Price: " + price;
    }

    public double calculatePrice(int days) {
        return price * days;
    }

    public boolean isAvailable() {
        return availability;
    }

    public String getRoomDetails() {
        return toString();
    }



}

