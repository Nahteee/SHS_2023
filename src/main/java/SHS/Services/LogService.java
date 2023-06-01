package main.java.SHS.Services;

import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileName;
import main.java.SHS.FileHandlers.FileRecord;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogService {
    private static final String LOG_FILE = FileName.LOGS;
    private static LogService instance;

    private LogService() {
    }

    public static LogService getInstance() {
        if (instance == null) {
            instance = new LogService();
        }
        return instance;
    }

    public void log(String message) {
        FileHandler fileHandler = new FileHandler(LOG_FILE);
        String logEntry = fileHandler.GenerateID()+ ";" + getCurrentDate() + ";" + getCurrentTime() + ";" + message;
        fileHandler.InsertRecord(new FileRecord(fileHandler.GenerateID(), logEntry));
    }

    private String getCurrentDate() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(now);
    }
    
    private String getCurrentTime() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(now);
    }
    
    
}
