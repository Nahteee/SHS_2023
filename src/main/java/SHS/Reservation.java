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
public class Reservation {
    private Student student;
    private BookedRoom bookedRoom;
    private Date reservationDate;
    private int durationInDays;
    private boolean isApproved;

    public Reservation(Student student, BookedRoom bookedRoom, Date reservationDate, int durationInDays) {
        this.student = student;
        this.bookedRoom = bookedRoom;
        this.reservationDate = reservationDate;
        this.durationInDays = durationInDays;
        this.isApproved = false;
    }

    // getters and setters for Reservation attributes
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public BookedRoom getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(BookedRoom bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    // toString method to display the reservation details
    @Override
    public String toString() {
        return "Reservation: Student name: " + student.getFullname() + ", Room number: " + bookedRoom.getRoomNumber() 
            + ", Check-in date: " + bookedRoom.getCheckInDate() + ", Check-out date: " + bookedRoom.getCheckOutDate()
            + ", Reservation date: " + reservationDate + ", Duration in days: " + durationInDays 
            + ", Is approved: " + isApproved;
    }
}
