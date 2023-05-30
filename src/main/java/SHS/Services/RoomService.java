/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS.Services;

import java.util.ArrayList;
import java.util.List;
import main.java.SHS.FileHandlers.*;
import main.java.SHS.Room;
import main.java.SHS.RoomType;
import main.java.SHS.Student;


/**
 *
 * @author User
 */
public class RoomService {
    private static RoomService room_service;
    
     public static RoomService getRoomService()
    {
        //Not instantiated yet
        if (room_service == null)
        {
            room_service = new RoomService();
        }
        return room_service;
    }
     
    public static void offRoomService(){
         RoomService.room_service = null;
     }
    
    private ArrayList<Room> rooms;
    FileHandler room_file = new FileHandler(FileName.ROOM);
    
    public RoomService(){
         this.rooms = new ArrayList<Room>();
            
           List<FileRecord> room_records = room_file.FetchRecord();
           room_records.forEach((record) -> {
               Room room_object = convertToObject(record);
               this.rooms.add(room_object);
           });
           System.out.println(rooms);
           this.rooms.forEach((record) -> System.out.println(record.getRoomNumber())
           );
    }
    
    private Room convertToObject(FileRecord r) {
    String[] room_data = r.getRecordList();
    if (room_data.length == 0) {
        return null;
    }
    String room_number = room_data[0];
    String room_type = room_data[1];
    String room_capacity = room_data[2];
    String room_availability = room_data[4];
    double room_price = Integer.parseInt(room_data[5]);
    
    
    

    return new Room(Integer.parseInt(room_number),getRoomTypeClass(room_type), room_capacity, room_availability, room_price);
}

    public RoomType getRoomTypeClass(String roomType){
        RoomType rt;    
        switch(roomType){
            case "SingleRoom":
                rt = RoomType.SingleRoom;
                return rt;
            case "TwinRoom":
                rt = RoomType.TwinRoom;
                return rt;
            case "SingleRoomPremium":
                rt = RoomType.SingleRoomPremium;
                return rt;
            case "TwinRoomPremium":
                rt = RoomType.TwinRoomPremium;
                return rt;
            
        }
        return null;
    }
    
   private FileRecord convertToFileRecord(Room room){
         String room_record_string = room.getRoomNumber() + ";" + room.getRoomType()+ ";" + room.getCapacity()+ ";" + ";" + room.isAvailability() + ";" + room.getPrice();
         return new FileRecord(room.getRoomNumber(), room_record_string);
    }
    
    public ArrayList<Room> getRooms(){
        return this.rooms;
    }
    
    public Room getRoom(int id){
        Room response = null;
        for(int i = 0; i < rooms.size(); i ++) {
            if(rooms.get(i).getRoomNumber()== id){
                response = rooms.get(i);
                break;
            }
        }
         if(response == null){
            System.out.println("not such record in this \"room\".  FIND A WAY TO HANDLE**");
        }
        return response;
    }
    
        public void addRoom(Room room){
        this.rooms.add(room);
        FileRecord room_record = convertToFileRecord(room);
        room_file.InsertRecord(room_record);
    }
    
        public void updateRoom(Room room){
        for(int i=0; i < rooms.size(); i++){
            if(rooms.get(i).getRoomNumber()== room.getRoomNumber()){
                rooms.set(i, room);
                FileRecord room_record = convertToFileRecord(room);
                room_file.UpdateRecord(room_record);
                break;
            }
        }
    }
    
    public void deleteRoom(Room room) {
         for(int i=0; i < rooms.size(); i++){
            if(rooms.get(i).getRoomNumber()== room.getRoomNumber()){
                // Remove from room object
                rooms.remove(rooms.get(i));
                // Remove from Room Text file
                FileRecord room_record = convertToFileRecord(room);
                room_file.DeleteRecord(room_record);
                break;
            }
        }
    }
}
