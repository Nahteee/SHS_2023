/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.SHS.UI;

import javax.swing.JOptionPane;
import main.java.SHS.FileHandlers.FileHandler;
import main.java.SHS.FileHandlers.FileName;
import main.java.SHS.FileHandlers.FileRecord;
import main.java.SHS.Student_Hostel_System;
import main.java.SHS.UI.UI_Student_Main;
import main.java.SHS.Student;
import main.java.SHS.StudentDetails;
import main.java.SHS.User;

/**
 *
 * @author User
 */
public class UI_Payment extends javax.swing.JFrame {
    public static String price;
    public static String type;
    public static String email;
    public static String phone;
    public static String los;
    public static String cid;
    public static String no;
    /**
     * Creates new form payment
     */
    public UI_Payment(String roomID,String type,String price,String email,String phone,String los,String cdate) {
        initComponents();
        UI_Payment.no = roomID;
        UI_Payment.type = type;
        UI_Payment.price = price;
        UI_Payment.email = email;
        UI_Payment.phone = phone;
        UI_Payment.los = los;
        UI_Payment.cid = cdate;
        plbl.setText(price);
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
        bbut = new javax.swing.JButton();
        CFBUT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        plbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cardtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 229, 182));

        bbut.setText("CANCEL");
        bbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbutActionPerformed(evt);
            }
        });

        CFBUT.setText("SUBMIT");
        CFBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFBUTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel5.setText("PAYMENT");

        plbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        plbl.setForeground(new java.awt.Color(0, 51, 255));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("TOTAL PRICE :");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("CARD NUMBER");

        cardtxt.setText("XXXX-XXXX-XXXX-XXXX");
        cardtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardtxtFocusLost(evt);
            }
        });
        cardtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardtxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("EXP DATE");

        datetxt.setText("XX/XX");
        datetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                datetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                datetxtFocusLost(evt);
            }
        });
        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("CVV / CVC");

        codetxt.setText("XXX");
        codetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codetxtFocusLost(evt);
            }
        });
        codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codetxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(plbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bbut)
                .addGap(101, 101, 101)
                .addComponent(CFBUT)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(plbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CFBUT)
                            .addComponent(bbut))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbutActionPerformed
        UI_Student_Main s = new UI_Student_Main();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bbutActionPerformed
    private boolean cardvalidation(String card, String date, String code){
        if(!card.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")){
            JOptionPane.showMessageDialog(this,"Invalid card Number!","Wrong Format",JOptionPane.ERROR_MESSAGE,null);
            return false;
        }
        if(!date.matches("\\d{2}/\\d{2}")){
            JOptionPane.showMessageDialog(this,"Invalid expiry date!","Wrong Format",JOptionPane.ERROR_MESSAGE,null);
            return false;
        }
        if(!code.matches("\\d{3}")){
            JOptionPane.showMessageDialog(this,"Invalid CVV/CVC code!","Wrong Format",JOptionPane.ERROR_MESSAGE,null);
            return false;
        }
        return true;
    }
    
    private void saveBooking(){
        FileHandler fHandler = new FileHandler(FileName.BOOKING);
        int newBookingID = fHandler.GenerateID();
        User current_user = Student_Hostel_System.current_user;
        Student s = (Student) Student_Hostel_System.current_user;
        current_user = StudentDetails.getStudentDetails().getStudent(s.getUserId()); 
        //String kkk = String.valueOf(current_user.getUsername());
        String bookingDetails = newBookingID+";"+current_user+";"+no+";"+type+";"+price+";"+email+";"+phone+";"+los+";"+cid+";";
        FileRecord newBookingDetails = new FileRecord(newBookingID, bookingDetails);
        fHandler.InsertRecord(newBookingDetails);
    }
    
    private void CFBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFBUTActionPerformed
    String card = cardtxt.getText();
    String date = datetxt.getText();
    String code = codetxt.getText();
    if(cardvalidation (card,date,code)){
        JOptionPane.showMessageDialog(this,"Card Number is :"+ card +"\n"+"Price is :"+ price +"\n"+ "Choosen Room is :"+ type );
        JOptionPane.showMessageDialog(null,"Payment Successful" , "Payment",JOptionPane.PLAIN_MESSAGE,null);
        saveBooking();
        UI_Student_Main s = new UI_Student_Main();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);
        this.dispose();
    }
          
   
    }//GEN-LAST:event_CFBUTActionPerformed

    private void cardtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardtxtActionPerformed

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetxtActionPerformed

    private void codetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codetxtActionPerformed

    private void cardtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardtxtFocusGained
    cardtxt.setText("");
    }//GEN-LAST:event_cardtxtFocusGained

    private void cardtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardtxtFocusLost
    if (cardtxt.getText().isEmpty()){
        cardtxt.setText("XXXX-XXXX-XXXX-XXXX");
    }
    }//GEN-LAST:event_cardtxtFocusLost

    private void datetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datetxtFocusGained
    datetxt.setText("");
    }//GEN-LAST:event_datetxtFocusGained

    private void datetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datetxtFocusLost
    if (datetxt.getText().isEmpty()){
        datetxt.setText("XX-XX");
    }
    }//GEN-LAST:event_datetxtFocusLost

    private void codetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codetxtFocusGained
    codetxt.setText("");
    }//GEN-LAST:event_codetxtFocusGained

    private void codetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codetxtFocusLost
    if (codetxt.getText().isEmpty()){
        codetxt.setText("XXX");
    }
 
    }//GEN-LAST:event_codetxtFocusLost

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
            java.util.logging.Logger.getLogger(UI_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Payment(no,type,price, email, phone, los, cid).setVisible(true);
            }
        });}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CFBUT;
    private javax.swing.JButton bbut;
    private javax.swing.JTextField cardtxt;
    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField datetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel plbl;
    // End of variables declaration//GEN-END:variables
}
