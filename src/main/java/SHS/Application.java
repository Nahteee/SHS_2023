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
public class Application {
    private String studentName;
    private String studentId;
    private RoomType preferredRoomType;
    private int numberOfOccupants;
    private Date startDate;
    private Date endDate;
    private boolean approved;

    public Application(String studentName, String studentId, RoomType preferredRoomType, int numberOfOccupants, Date startDate, Date endDate) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.preferredRoomType = preferredRoomType;
        this.numberOfOccupants = numberOfOccupants;
        this.startDate = startDate;
        this.endDate = endDate;
        this.approved = false;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public RoomType getPreferredRoomType() {
        return preferredRoomType;
    }

    public void setPreferredRoomType(RoomType preferredRoomType) {
        this.preferredRoomType = preferredRoomType;
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}

