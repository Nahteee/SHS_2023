/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.SHS.UI;

import javax.swing.JOptionPane;
import main.java.SHS.Application;
import main.java.SHS.Room;
import main.java.SHS.Services.ApplicationService;
import main.java.SHS.Services.PaymentService;
import main.java.SHS.Services.RoomService;
import main.java.SHS.Student_Hostel_System;

/**
 *
 * @author User
 */
public class UI_Applications extends javax.swing.JFrame {
    


    public UI_Applications() {
        initComponents();
        
        ApplicationService applicationService = new ApplicationService();
        Application application = applicationService.getApplication(Student_Hostel_System.current_user.getUsername());

        
        RoomService roomservice = new RoomService();
        Room room = roomservice.getRoom(application.getRoomId());
        
        RoomLbl.setText("Room No : " + room.getRoomNumber());
        TypeLbl.setText("Room Type : " + room.getRoomType());
        FurnishingLbl.setText("Furnishing : " + room.getFurnish());
        RentLbl.setText("Monthly Rent : " + room.getPrice());
        CDateLbl.setText("Check-in Date : " + application.getStartDate());
        CODateLbl.setText("Check-out Date : " + application.getEndDate());
        StatusLbl.setText("Status : " + application.getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RoomLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PaymentBtn = new javax.swing.JButton();
        TypeLbl = new javax.swing.JLabel();
        FurnishingLbl = new javax.swing.JLabel();
        RentLbl = new javax.swing.JLabel();
        CDateLbl = new javax.swing.JLabel();
        CODateLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        StatusLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 225, 228));

        RoomLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        RoomLbl.setForeground(new java.awt.Color(92, 128, 188));
        RoomLbl.setText("Room No : ");

        jPanel2.setBackground(new java.awt.Color(92, 128, 188));

        jLabel1.setBackground(new java.awt.Color(92, 128, 188));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 225, 228));
        jLabel1.setText("BOOKING");

        jLabel5.setBackground(new java.awt.Color(92, 128, 188));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(217, 225, 228));
        jLabel5.setText("YOUR");

        BackBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(217, 225, 228));
        BackBtn.setText("< Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(92, 128, 188));
        DeleteBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(217, 225, 228));
        DeleteBtn.setText("Delete Application");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(92, 128, 188));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(217, 225, 228));
        jLabel6.setText("APPLICATION");

        PaymentBtn.setBackground(new java.awt.Color(92, 128, 188));
        PaymentBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        PaymentBtn.setForeground(new java.awt.Color(217, 225, 228));
        PaymentBtn.setText("Make Payment");
        PaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(PaymentBtn)))
                        .addGap(12, 12, 12)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BackBtn)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addComponent(PaymentBtn)
                .addGap(18, 18, 18)
                .addComponent(DeleteBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TypeLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        TypeLbl.setForeground(new java.awt.Color(92, 128, 188));
        TypeLbl.setText("Room Type : ");

        FurnishingLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FurnishingLbl.setForeground(new java.awt.Color(92, 128, 188));
        FurnishingLbl.setText("Furnishing : ");

        RentLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        RentLbl.setForeground(new java.awt.Color(92, 128, 188));
        RentLbl.setText("Monthly Rent : ");

        CDateLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        CDateLbl.setForeground(new java.awt.Color(92, 128, 188));
        CDateLbl.setText("Check-in Date : ");

        CODateLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        CODateLbl.setForeground(new java.awt.Color(92, 128, 188));
        CODateLbl.setText("Check-out Date : ");

        StatusLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        StatusLbl.setForeground(new java.awt.Color(92, 128, 188));
        StatusLbl.setText("Status : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(StatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(StatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RoomLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RentLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CODateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FurnishingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(RoomLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FurnishingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RentLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CODateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // Hide the current window
        this.setVisible(false);

    // ...
    UI_Rooms s = new UI_Rooms();
    s.refreshTable(); // Refresh the table data
    s.setVisible(true);
    // ...
    }//GEN-LAST:event_BackBtnMouseClicked

    private void PaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentBtnActionPerformed
        ApplicationService applicationService = new ApplicationService();
        Application application = applicationService.getApplication(Student_Hostel_System.current_user.getUsername());

        RoomService roomservice = new RoomService();
        Room room = roomservice.getRoom(application.getRoomId());

        ApplicationService appservice = new ApplicationService();
        boolean hasPendingPayment = appservice.checkAwaitingPaymentApplication(application.getStudentId());

        if (hasPendingPayment) {
            this.setVisible(false);
            UI_Payment UP = new UI_Payment();
            UP.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You have no pending payment.", "Pending Payment", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_PaymentBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        ApplicationService applicationService = new ApplicationService();
        Application application = applicationService.getApplication(Student_Hostel_System.current_user.getUsername());
        int applicationID = application.getApplicationID();
        String applicationStatus = application.getStatus();

        if (applicationStatus.equals("Paid")) {
            // Display a message informing the user that the application cannot be deleted
            JOptionPane.showMessageDialog(null, "The application cannot be deleted because it is already paid.", "Deletion Not Allowed", JOptionPane.WARNING_MESSAGE);
        } else {
            int confirmDialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this application?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmDialogResult == JOptionPane.YES_OPTION) { // User confirmed
                // Update the application status to "Deleted"
                applicationService.updateApplication(applicationID, "Deleted");

                // Show a success message or perform any additional operations
                JOptionPane.showMessageDialog(null, "Application deleted. Status changed to Deleted.");
                this.setVisible(false);
                UI_Student_Main s = new UI_Student_Main();
                s.setVisible(true);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Applications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackBtn;
    private javax.swing.JLabel CDateLbl;
    private javax.swing.JLabel CODateLbl;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel FurnishingLbl;
    private javax.swing.JButton PaymentBtn;
    private javax.swing.JLabel RentLbl;
    private javax.swing.JLabel RoomLbl;
    private javax.swing.JLabel StatusLbl;
    private javax.swing.JLabel TypeLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
