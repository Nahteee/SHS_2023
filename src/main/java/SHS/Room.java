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
    private int capacity;
    private ArrayList<String> occupants;
    private boolean availability;
    private double price;

    // Constructor
public Room(int roomNumber,RoomType roomType, String capacity, String occupants, String availability, double price) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.capacity = Integer.parseInt(capacity);
    this.occupants = new ArrayList<>();
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<String> getOccupants() {
        return occupants;
    }

    public void setOccupants(ArrayList<String> occupants) {
        this.occupants = occupants;
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
    public void addOccupant(String occupant) {
        occupants.add(occupant);
    }

    public void removeOccupant(String occupant) {
        occupants.remove(occupant);
    }

    public boolean isOccupied() {
        return !occupants.isEmpty();
    }

    public String toString() {
        return  "Room Number: " + roomNumber + "\n"
                + "Room Type: " + roomType + "\n"
                + "Capacity: " + capacity + "\n"
                + "Occupants: " + occupants.toString() + "\n"
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

    public boolean assignRoom(Student student) {
    // Check if the room is already occupied
    if (isOccupied()) {
        return false;
    }
    
    // If all criteria are met, assign the room to the student
//    addOccupant(student);
    setAvailability(false);
//    student.setAssignedRoom(this);
    return true;
}

}

