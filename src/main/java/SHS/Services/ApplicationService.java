/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS.Services;

/**
 *
 * @author User
 */
import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileRecord;
import main.java.SHS.FileHandlers.FileName;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import main.java.SHS.Application;


public class ApplicationService {
    private static final String APPLICATIONS_FILE_NAME = FileName.APPLICATIONS;
    private FileHandler fileHandler;

    public ApplicationService() {
        fileHandler = new FileHandler(APPLICATIONS_FILE_NAME);
    }

    public void sendApplication(Application application) {
        int applicationId = application.getApplicationID();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String startDateString = application.getStartDate();
        String endDateString = application.getEndDate();
        String applicationData = applicationId + ";" +
                application.getStudentName() + ";" +
                application.getStudentId() + ";" +
                application.getRoomId() + ";" +
                startDateString + ";" +
                endDateString + ";" +
                application.getStatus();
        FileRecord applicationRecord = new FileRecord(applicationId, applicationData);
        fileHandler.InsertRecord(applicationRecord);
        System.out.println("Application sent successfully!");
    }
    
    
    public boolean checkExistingApplication(String studentName) {
    List<FileRecord> records = fileHandler.FetchRecord();

    for (FileRecord record : records) {
        String[] data = record.getRecord().split(";");

        if (data[1].equals(studentName) && (data[6].equals("Pending") || data[6].equals("Awaiting Payment") || data[6].equals("Rejected"))) {
            return true; // Existing application found with matching username and false approval status
        }
    }

    return false; // No existing application found
}
    

public Application displayOwnApplication(String studentName) {
    List<FileRecord> records = fileHandler.FetchRecord();

    for (FileRecord record : records) {
        String[] data = record.getRecord().split(";");

        if (data[1].equals(studentName)) {
            int applicationID = Integer.parseInt(data[0]);
            int studentId = Integer.parseInt(data[2]);
            String roomId = data[3];
            String startDate = data[4];
            String endDate = data[5];
            String status = data[6];

            Application application = new Application(applicationID, studentName, studentId, roomId, startDate, endDate, status);
            return application;
        }
    }

    return null; // Return null if no matching application is found
}


public ArrayList<Application> getAllApplications() {
    ArrayList<Application> applications = new ArrayList<>();
    List<FileRecord> records = fileHandler.FetchRecord();

    for (FileRecord record : records) {
        String[] data = record.getRecord().split(";");

        int applicationID = Integer.parseInt(data[0]);
        String studentName = data[1];
        int studentId = Integer.parseInt(data[2]);
        String roomId = data[3];
        String startDate = data[4];
        String endDate = data[5];
        String status = data[6];

        Application application = new Application(applicationID, studentName, studentId, roomId, startDate, endDate, status);
        applications.add(application);
    }

    return applications;
}

public void updateApplication(Application application) {
    List<FileRecord> records = fileHandler.FetchRecord();

    for (int i = 0; i < records.size(); i++) {
        String[] data = records.get(i).getRecord().split(";");

        if (Integer.parseInt(data[0]) == application.getApplicationID()) {
            // Update the application in the records list
            records.set(i, convertToFileRecord(application));
            
            // Update the record in the file
            fileHandler.UpdateRecord(records.get(i));
            
            // Exit the loop as the application has been found and updated
            break;
        }
    }
}

private FileRecord convertToFileRecord(Application application) {
    String applicationRecordString = application.getApplicationID() + ";" +
            application.getStudentName() + ";" +
            application.getStudentId() + ";" +
            application.getRoomId() + ";" +
            application.getStartDate() + ";" +
            application.getEndDate() + ";" +
            application.getStatus();

    return new FileRecord(application.getApplicationID(), applicationRecordString);
}

public void updateApplication(int applicationID, String newStatus) {
    List<FileRecord> records = fileHandler.FetchRecord();

    for (FileRecord record : records) {
        String[] data = record.getRecord().split(";");

        if (Integer.parseInt(data[0]) == applicationID) {
            // Update the status of the matching application
            data[6] = newStatus;

            // Reconstruct the updated application record
            String updatedRecord = String.join(";", data);

            // Create a new FileRecord with the updated record
            FileRecord updatedApplicationRecord = new FileRecord(applicationID, updatedRecord);

            // Update the application record in the file
            fileHandler.UpdateRecord(updatedApplicationRecord);

            // Exit the loop since the application is found and updated
            break;
        }
    }
}


}

