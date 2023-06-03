/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.SHS.Services;

import java.util.Date;
import java.util.List;
import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileName;
import main.java.SHS.FileHandlers.FileRecord;
import main.java.SHS.Payment;

/**
 *
 * @author User
 */
public class PaymentService {
    private FileHandler fileHandler; 
    
    
    public PaymentService() {
        fileHandler = new FileHandler(FileName.PAYMENTS);
    }
    
    public void makePayment(Payment payment) {
        int paymentID = payment.getPaymentID();
        int customerID = payment.getCustomerID();
        int applicationID = payment.getApplicationID();
        int paymentAmount = payment.getPaymentAmount();
        String paymentDate = payment.getPaymentDate();
        
        
        String paymentData = paymentID + ";" +
                customerID + ";" +
                applicationID + ";" +
                paymentAmount + ";" +
                paymentDate;
        
        System.out.println(paymentData);
        
        FileRecord paymentRecord = new FileRecord(paymentID, paymentData);
        fileHandler.InsertRecord(paymentRecord);
        
        System.out.println("Payment recorded successfully!");
    }
    
    


    
}

