/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.io.IOException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaassignment.Login.Search;
import static javaassignment.MemberReg.Updater;
import javax.swing.JOptionPane;

/**
 *
 * @author Prasanga Fernando
 */
public class BookReturnold extends javax.swing.JFrame {

    /**
     * Creates new form BookBorrow
     */
    public BookReturnold() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFine = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        txtMemberID = new javax.swing.JTextField();
        dtpDate = new org.jdesktop.swingx.JXDatePicker();
        btngetData = new javax.swing.JButton();
        lblFineDisplay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBookTitleDisplay = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 430));
        getContentPane().setLayout(null);

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("press enter to get data. Temporrary it's in jbutton");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 80, 267, 23);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Member ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 60, 14);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Current Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 150, 80, 14);

        lblFine.setForeground(new java.awt.Color(240, 240, 240));
        lblFine.setText("Fine");
        getContentPane().add(lblFine);
        lblFine.setBounds(70, 260, 40, 14);

        btnReturn.setText("Return the Book");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(461, 290, 120, 40);

        txtMemberID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemberIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtMemberID);
        txtMemberID.setBounds(220, 110, 150, 20);
        getContentPane().add(dtpDate);
        dtpDate.setBounds(220, 150, 150, 22);

        btngetData.setText("Get Data");
        btngetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetDataActionPerformed(evt);
            }
        });
        getContentPane().add(btngetData);
        btngetData.setBounds(225, 290, 90, 30);

        lblFineDisplay.setBackground(new java.awt.Color(204, 255, 255));
        lblFineDisplay.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(lblFineDisplay);
        lblFineDisplay.setBounds(220, 230, 160, 40);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Book Title");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 200, 60, 14);

        lblBookTitleDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBookTitleDisplay.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(lblBookTitleDisplay);
        lblBookTitleDisplay.setBounds(220, 190, 180, 30);

        jPanel1.setBackground(new java.awt.Color(128, 93, 23));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Book Return");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prasanga Fernando\\Documents\\ESOFT\\Java\\Java System\\JavaAssignment\\Book-Return.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 50, 600, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetDataActionPerformed
      //Had to use a seperate button to calculate fine and display it before adding to database
        
        lblFineDisplay.setText(calculateFine());//working
        String BookTitle;
        
         try{               
            String sql = "SELECT BookTitle FROM `borrowedbooks` WHERE ISBN ='"+getISBN()+"'";
            ResultSet rs = Search(sql);
    
            rs.first();
            BookTitle = rs.getString("BookTitle");
             lblBookTitleDisplay.setText(BookTitle);

        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_btngetDataActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed

        try{
            String sql = "INSERT INTO BookReturn (MemberID,BorrowID, currentDate, Fine) values('"+ txtMemberID.getText() +"', '"+ getBorrowID() +"', '"+getcurrentDate()+"','"+calculateFine()+"')";
           Updater(sql);
           recoverBook();
            deleteBorrow();     
        }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Book returned successfully");
            }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtMemberIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemberIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemberIDActionPerformed
   
    private String getcurrentDate(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        dtpDate.setFormats(df);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String Date = sysDate.format(dtpDate.getDate());
        return Date;
     }
    
    private String getdatabaseDate(){//Getting the date from the database. But it's in an unsupported format. 
        String databaseDate = "";
         try{               
            String sqlUsername = "SELECT ReturnDate FROM `bookborrowing` WHERE borrowID ='"+getBorrowID()+"'";
            ResultSet rs = Search(sqlUsername);
    
            rs.first();
            databaseDate = rs.getString("ReturnDate");
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        return databaseDate;
    }//Working
 
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
            java.util.logging.Logger.getLogger(BookReturnold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookReturnold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookReturnold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookReturnold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookReturnold().setVisible(true);
            }
        });
    }
    
    private String getISBN(){
        String ISBN = "";
         try{               
            String sqlUsername = "SELECT ISBN FROM `bookborrowing` WHERE MemberID ='"+txtMemberID.getText()+"'";
            ResultSet rs = Search(sqlUsername);
    
            rs.first();
            ISBN = rs.getString("ISBN");
            // System.out.println(ISBN);
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        return ISBN;
    }
    
  private String getBorrowID(){
        String BorrowID = "";
         try{               
            String sql = "SELECT BorrowID FROM `bookborrowing` WHERE MemberID ='"+txtMemberID.getText()+"'";
            ResultSet rs = Search(sql);
    
            rs.first();
            BorrowID = rs.getString("BorrowID");
    
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
        return BorrowID;
    }
    
    private Date getReturnDate(String databaseDate){//This is for converting the database date type to dateTime format
      
           SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd")  ;
    Date date = null;
    try {
        date = inputDateFormat.parse(databaseDate);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return date;
    }
   
    private long getdateDifference(){
              Date d =  getReturnDate(getdatabaseDate());  
           SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy/MM/dd") ;
           
           String databasedate = outputDateFormat.format(d);
           BookBorrow bb = new BookBorrow();
           long difference =0;
           
        try {
           difference =  bb.getdateDifference(databasedate,getcurrentDate());
           
        } catch (IOException ex) {
            Logger.getLogger(BookReturnold.class.getName()).log(Level.SEVERE, null, ex);
        }
        return difference;
    }
    
    private int getFines(int Books){
        int fine = Books*5;
        return fine;
      }
    
    private int getNumofBooks(String MID){//This will count the number of books that have been borrowed
        int count = 0;
         try {
            String sql = "SELECT COUNT(*) FROM `bookborrowing` WHERE MemberID = '"+MID+"'";

            ResultSet rs = Search(sql);
    
            rs.first();
             count = rs.getInt(1);//Read the count

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return count;
    }
    
    private String calculateFine(){
    String finalFine = "";
     try {
        long diff = getdateDifference();//Here, we get the difference. Now need to calculate the fines
        int difference = (int)diff;//this is the fine for a single book
      
        int fine = getFines(difference)*getNumofBooks(txtMemberID.getText());//Multiplying by number of books that member borrowed
           if(fine<1){//Removing minus values in fines if an early return
               fine = 0;
              finalFine = Integer.toString(fine);
           }
           else{
                    finalFine = Integer.toString(fine);
           }
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     return finalFine;
}
    
    private void deleteBorrow(){
        try{
           String sql1 = "DELETE * from `borrowedbooks` WHERE ISBN ='"+getISBN()+"'";
          Updater(sql1);
            String sql = "DELETE * from `bookborrowing` WHERE `ISBN` = '"+getISBN()+"'";
          Updater(sql);
          JOptionPane.showMessageDialog(null, "Book deleted successfully");
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
         }
    }
        
    private void recoverBook(){//working
        String BookTitle = "";
        String Author = "";
        String Publisher = "";
        String Edition = "";
        String Category = "";
        String Year = "";
        
         try{               
            String sql = "SELECT BookTitle,Author,Publisher,Edition,Category,Year FROM `borrowedbooks` WHERE ISBN ='"+getISBN()+"'";
            ResultSet rs = Search(sql);
    
            rs.first();
            BookTitle = rs.getString("BookTitle");
            Author = rs.getString("Author");
            Publisher = rs.getString("Publisher");
            Edition = rs.getString("Edition");
            Category = rs.getString("Category");
            Year = rs.getString("Year");
            
            lblBookTitleDisplay.setText(BookTitle); 
             System.out.println(BookTitle+" "+Author+" "+Publisher+" "+Edition+" "+Category+" "+Year);
             
             //String sql1 = "INSERT INTO Bookreg (ISBN,TITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) values('"+getISBN()+"', '"+BookTitle+"', '"+Author+"', '"+Publisher+"', '"+Edition+"', '"+Category+"', '"+Year+"')";
            
             // String sql1 = "INSERT INTO Bookreg (ISBN,TITLE, AUTHOR, PUBLISHER, EDITION, CATEGORY, YEAR) values('"+getISBN()+"', '"+BookTitle+"', '"+Author+"', '"+Publisher+"', '"+Edition+"', '"+Category+"', '"+Year+"')";
             
           //  Updater(sql1);
        }
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    
    } 

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btngetData;
    private org.jdesktop.swingx.JXDatePicker dtpDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBookTitleDisplay;
    private javax.swing.JLabel lblFine;
    private javax.swing.JLabel lblFineDisplay;
    private javax.swing.JTextField txtMemberID;
    // End of variables declaration//GEN-END:variables
}
