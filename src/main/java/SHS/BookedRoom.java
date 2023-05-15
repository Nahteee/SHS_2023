/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

import java.util.Date;

/**
 *
 * @author User
 */
public class BookedRoom extends Room {
    private Reservation reservation;
    private Date checkInDate;
    private Date checkOutDate;
    
    public BookedRoom(int roomNumber, RoomType roomType, int capacity, double price) {
        super(roomNumber, roomType,capacity, price);
    }
    
    // getters and setters for the BookedRoom attributes
    public Reservation getReservation() {
        return reservation;
    }
    
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
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
    
    // toString method to display the booked room details
    @Override
    public String toString() {
        return super.toString() + ", Check-in date: " + checkInDate + ", Check-out date: " + checkOutDate;
    }
}