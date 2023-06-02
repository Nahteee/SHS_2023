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
    private int studentId;
    private String checkInDate;
    private String checkOutDate;
    private String RoomStatus;

    public BookedRoom(int studentId, String checkInDate, String checkOutDate, String RoomStatus, int roomNumber, String roomType, String furnish, String availability, int price) {
        super(roomNumber, roomType, furnish, availability, price);
        this.studentId = studentId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.RoomStatus = RoomStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getRoomStatus() {
        return RoomStatus;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setRoomStatus(String RoomStatus) {
        this.RoomStatus = RoomStatus;
    }

    @Override
    public String toString() {
        return "BookedRoom{" + "studentId=" + studentId + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", RoomStatus=" + RoomStatus + '}';
    }
    
    
    
    
}