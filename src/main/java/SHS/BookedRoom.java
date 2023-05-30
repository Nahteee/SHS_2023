/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class BookedRoom extends Room {
    private Reservation reservation;
    private String occupants;
    private Date checkInDate;
    private Date checkOutDate;
    
    public BookedRoom(int roomNumber,RoomType roomType, String occupants, String availability, double price) {
        super(roomNumber, roomType, availability, price);
        this.occupants = occupants;
    }
    
    // getters and setters for the BookedRoom attributes
    public Reservation getReservation() {
        return reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
     public String getOccupants() {
        return occupants;
    }

    public void setOccupants(String occupants) {
        this.occupants = occupants;
    }
    
    public Date getCheckInDate() {
        return checkInDate;
    }
    
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }
    
    public Date getCheckOutDate() {
        return checkOutDate;
    }
    
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    //Methods

    public boolean isOccupied() {
        return !occupants.isEmpty();
    }
    
    // toString method to display the booked room details
    @Override
    public String toString() {
        return super.toString() + "Occupant: " + occupants + "\n" + ", "
                + "Check-in date: " + checkInDate + "\n" + ", Check-out date: " + checkOutDate + "\n";
    }
    
        public boolean assignRoom(Student student) {
    // Check if the room is already occupied
    if (isOccupied()) {
        return false;
    }
    
    // If all criteria are met, assign the room to the student
//    addOccupant(student);W
    setAvailability(false);
//    student.setAssignedRoom(this);
    return true;
}
}