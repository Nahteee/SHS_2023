/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.SHS.UI;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileName;
import main.java.SHS.FileHandlers.FileRecord;
import main.java.SHS.Payment;
import main.java.SHS.Services.ApplicationService;
import main.java.SHS.Services.BookedRoomService;
import main.java.SHS.Services.PaymentService;
import main.java.SHS.Student;
import main.java.SHS.Student_Hostel_System;
import main.java.SHS.User;
/**
 *
 * @author User
 */
public class UI_Record_Payments extends javax.swing.JFrame {

    /**
     * Creates new form UI_Record_Payments
     */
    public UI_Record_Payments() {
        initComponents();
        
        
        ArrayList<Payment> payments = PaymentService.getPaymentService().getPayments();

        DefaultTableModel model = (DefaultTableModel) roomtab.getModel();
        for (Payment payment : payments) {
            if (payment.getStudentID()==Student_Hostel_System.current_user.getUserId()) { // Only add available rooms
                model.addRow(new Object[] {
                    payment.getPaymentID(),
                    payment.getApplicationID(),
                    payment.getPaymentAmount(),
                    payment.getPaymentDate()
                });
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomtab = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RoomsBtn = new javax.swing.JButton();
        RecBtn = new javax.swing.JButton();
        AppsBtn = new javax.swing.JButton();
        LogOut = new javax.swing.JLabel();
        BookedRoomsBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SearchTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        GetReceiptBtn = new javax.swing.JButton();
        LogsBtn = new javax.swing.JButton();
        RBtn = new javax.swing.JButton();
        PBtn = new javax.swing.JButton();
        AppBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(217, 225, 228));

        roomtab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Application ID", "Amount Paid", "Payment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roomtab);

        jPanel3.setBackground(new java.awt.Color(92, 128, 188));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/SHS Logo Header.png"))); // NOI18N

        RoomsBtn.setBackground(new java.awt.Color(92, 128, 188));
        RoomsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RoomsBtn.setForeground(new java.awt.Color(217, 225, 228));
        RoomsBtn.setText("Book Rooms");
        RoomsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsBtnActionPerformed(evt);
            }
        });

        RecBtn.setBackground(new java.awt.Color(92, 128, 188));
        RecBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        RecBtn.setForeground(new java.awt.Color(217, 225, 228));
        RecBtn.setText("Records");
        RecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecBtnActionPerformed(evt);
            }
        });

        AppsBtn.setBackground(new java.awt.Color(92, 128, 188));
        AppsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        AppsBtn.setForeground(new java.awt.Color(217, 225, 228));
        AppsBtn.setText("Applications");
        AppsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppsBtnActionPerformed(evt);
            }
        });

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Logout button.png"))); // NOI18N
        LogOut.setText("jLabel1");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });

        BookedRoomsBtn.setBackground(new java.awt.Color(92, 128, 188));
        BookedRoomsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BookedRoomsBtn.setForeground(new java.awt.Color(217, 225, 228));
        BookedRoomsBtn.setText("Your Room");
        BookedRoomsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookedRoomsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookedRoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AppsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LogOut))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookedRoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AppsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 128, 188));
        jLabel4.setText("Payment History");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(92, 128, 188));
        jPanel4.setForeground(new java.awt.Color(92, 128, 188));
        jPanel4.setPreferredSize(new java.awt.Dimension(403, 3));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        SearchTxt.setText("Search...");
        SearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTxtKeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/SHS/UI/Imgs/Search Icon.png"))); // NOI18N

        GetReceiptBtn.setText("View Receipt");
        GetReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetReceiptBtnActionPerformed(evt);
            }
        });

        LogsBtn.setText("Login Logs");
        LogsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogsBtnActionPerformed(evt);
            }
        });

        RBtn.setText("Rooms");
        RBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtnActionPerformed(evt);
            }
        });

        PBtn.setText("Payment");
        PBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBtnActionPerformed(evt);
            }
        });

        AppBtn.setText("Applications");
        AppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(208, 208, 208))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GetReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AppBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(GetReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RoomsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsBtnActionPerformed
        UI_Rooms ur = new UI_Rooms();
        ur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RoomsBtnActionPerformed

    private void RecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecBtnActionPerformed
        UI_Record_Rooms ur = new UI_Record_Rooms();
        ur.setVisible(true);
        ur.pack();
        ur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RecBtnActionPerformed

    private void AppsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppsBtnActionPerformed
        ApplicationService applicationService = new ApplicationService();
        if (!applicationService.checkExistingApplication(Student_Hostel_System.current_user.getUsername())) {
            JOptionPane.showMessageDialog(null,"No existing booking. Make a booking first!" , "Error",JOptionPane.ERROR_MESSAGE,null);
            return; // Stop further processing
        }
        this.dispose();
        UI_Applications UIA = new UI_Applications();
        UIA.setVisible(true);
    }//GEN-LAST:event_AppsBtnActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        UI_Login ul = new UI_Login();
        ul.setVisible(true);
        ul.pack();
        ul.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void BookedRoomsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookedRoomsBtnActionPerformed
        BookedRoomService  bookedRoomService = new BookedRoomService();

        if (!bookedRoomService.checkBookingExist(Student_Hostel_System.current_user.getUsername())) {
            JOptionPane.showMessageDialog(null, "No Existing booking.", "Error", JOptionPane.ERROR_MESSAGE, null);
            return; // Stop further processing
        }

        UI_BookedRoom ubr = new UI_BookedRoom();
        ubr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookedRoomsBtnActionPerformed

    private void SearchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTxtKeyReleased
        DefaultTableModel table  = (DefaultTableModel)roomtab.getModel();
        String search = SearchTxt.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        roomtab.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchTxtKeyReleased

    private void GetReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetReceiptBtnActionPerformed
        if(roomtab.getSelectedRowCount()==1) {
            DefaultTableModel model = (DefaultTableModel) roomtab.getModel();         
            int PaymentID = parseInt(model.getValueAt(roomtab.getSelectedRow(), 0).toString());
            this.setVisible(false);
            UI_Receipt UI = new UI_Receipt(PaymentID);
            UI.setVisible(true);
        }
        else {
            if(roomtab.getRowCount()==0) {
                JOptionPane.showMessageDialog(this, "Table is empty...");
            }
            else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row to view...");
            }
        }
    }//GEN-LAST:event_GetReceiptBtnActionPerformed

    private void LogsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsBtnActionPerformed
        UI_Record_Logs ur = new UI_Record_Logs();
        ur.setVisible(true);
        ur.pack();
        ur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogsBtnActionPerformed

    private void RBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtnActionPerformed
        UI_Record_Rooms ur = new UI_Record_Rooms();
        ur.setVisible(true);
        ur.pack();
        ur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RBtnActionPerformed

    private void PBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBtnActionPerformed
        UI_Record_Payments ur = new UI_Record_Payments();
        ur.setVisible(true);
        ur.pack();
        ur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PBtnActionPerformed

    private void AppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppBtnActionPerformed
        UI_Record_Applications ur = new UI_Record_Applications();
        ur.setVisible(true);
        ur.pack();
        ur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_AppBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Record_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Record_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Record_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Record_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Record_Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppBtn;
    private javax.swing.JButton AppsBtn;
    private javax.swing.JButton BookedRoomsBtn;
    private javax.swing.JButton GetReceiptBtn;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton LogsBtn;
    private javax.swing.JButton PBtn;
    private javax.swing.JButton RBtn;
    private javax.swing.JButton RecBtn;
    private javax.swing.JButton RoomsBtn;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomtab;
    // End of variables declaration//GEN-END:variables
}