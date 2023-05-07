/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS;

import java.util.ArrayList;
import java.util.List;
import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileName;
import main.java.SHS.FileHandlers.FileRecord;

/**
 *
 * @author User
 */
public class StudentDetails {
    private static StudentDetails student_details;
    
    public static StudentDetails getMemberService()
    {
        //Not instantiated yet
        if (student_details == null)
        {
            student_details = new StudentDetails();
        }
        return student_details;
    }
     
    public static void endStudentDetails(){
         StudentDetails.student_details = null;
     }
    
    String file = "src\\main\\java\\SHS\\Txtfiles\\student.txt";
    private ArrayList<Student> students;
    FileHandler student_file = new FileHandler(file);
    
    public StudentDetails(){
         this.students = new ArrayList<Student>();

           List<FileRecord> student_records = student_file.FetchRecord();
           student_records.forEach((record) -> {
               Student student_object = convertToObject(record);
               this.students.add(student_object);
           });
    }
    
    private Student convertToObject(FileRecord s){
        String[] student_data = s.getRecordList();
        if(student_data.length == 0){
            return null;
        }
        int student_id = s.getID();
        String student_name = student_data[1];
        String student_email = student_data[2];
        String student_password = student_data[3];
        int student_age = Integer.parseInt(student_data[4]);
        Gender student_gender = Gender.valueOf(student_data[5]);
        String student_phone = student_data[6];
        String student_picture = student_data[7];
        
        return new Student(student_id);
    }
    //    return new Student(student_id, student_name, student_email, student_password, student_age, student_gender, student_phone, student_picture, UserRole.STUDENT);
    
    private FileRecord convertToFileRecord(Student student){
         String student_record_string = student.getUserId() + ";" + student.getUsername()+ ";" + student.getUserEmail() + ";" + student.getPassword()+ ";" + student.getAge() + ";" +student.getGender() + ";" + student.getContact() + ";" + student.getPicturePath();
         return new FileRecord(student.getUserId(), student_record_string);
    }
    
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    
    public Student getStudent(int id){
        Student response = null;
        for(int i = 0; i < students.size(); i ++) {
            if(students.get(i).getUserId()== id){
                response = students.get(i);
                break;
            }
        }
         if(response == null){
            System.out.println("not such record in this \"student\".  FIND A WAY TO HANDLE**");
        }
        return response;
    }
    
    public ArrayList<String> getStudentEmail(){
        ArrayList<String> student_emails = new ArrayList<String>();
         for(Student s : students){
             student_emails.add(s.getUserEmail());
         }
         return student_emails;
    }
    
    public void addStudent(Student student){
        this.students.add(student);
        FileRecord member_record = convertToFileRecord(student);
        student_file.InsertRecord(member_record);
    }
    
    public void updateStudent(Student student){
        for(int i=0; i < students.size(); i++){
            if(students.get(i).getUserId()== student.getUserId()){
                students.set(i, student);
                FileRecord student_record = convertToFileRecord(student);
                student_file.UpdateRecord(student_record);
                break;
            }
        }
    }
    
    public void deleteStudent(Student student) {
         for(int i=0; i < students.size(); i++){
            if(students.get(i).getUserId()== student.getUserId()){
                students.remove(students.get(i));
                FileRecord member_record = convertToFileRecord(student);
                student_file.DeleteRecord(member_record);
                break;
            }
        }
    }
}
