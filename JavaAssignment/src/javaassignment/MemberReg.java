/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Prasanga Fernando
 */
public class MemberReg extends javax.swing.JFrame {

    /**
     * Creates new form Membermy
     */
    public MemberReg() {
        initComponents();
    }

     static Connection c;
    static Statement s;
    static ResultSet rs;
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtNic = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        btnReg = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DOB = new org.jdesktop.swingx.JXDatePicker();
        txtLname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 400));
        getContentPane().setLayout(null);

        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 100, 70, 14);

        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 140, 70, 14);

        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 210, 60, 14);

        jLabel4.setText("NIC Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 250, 80, 14);

        jLabel5.setText("Gender");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 280, 60, 14);

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFname);
        txtFname.setBounds(150, 90, 130, 30);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress);
        txtAddress.setBounds(150, 200, 130, 30);
        getContentPane().add(txtNic);
        txtNic.setBounds(150, 240, 130, 30);

        radioMale.setText("Male");
        radioMale.setName(""); // NOI18N
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioMale);
        radioMale.setBounds(150, 280, 70, 23);

        radioFemale.setText("Female");
        getContentPane().add(radioFemale);
        radioFemale.setBounds(230, 280, 80, 23);

        btnReg.setText("Register");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnReg);
        btnReg.setBounds(140, 320, 90, 23);

        btnSearch.setText("Search/Update");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(330, 320, 120, 23);

        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 180, 80, 14);

        DOB.setPreferredSize(new java.awt.Dimension(110, 25));
        getContentPane().add(DOB);
        DOB.setBounds(150, 170, 130, 25);

        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLname);
        txtLname.setBounds(150, 130, 130, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Member Registration");
        jPanel1.add(jLabel7);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 70);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prasanga Fernando\\Documents\\ESOFT\\Java\\Java System\\JavaAssignment\\friendsextensionfeaturedimage.png")); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(806, 590));
        Background.setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 560, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_radioMaleActionPerformed

     private String Birthday(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DOB.setFormats(df);
        DateFormat sysDate = new SimpleDateFormat("yyyy/MM/dd");
        String birthday = sysDate.format(DOB.getDate());
        return birthday;
     }
    
    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
          try{
                 String birthday = Birthday();
                 System.out.println(birthday);
        String sql = "INSERT INTO memberreg(FNAME,LNAME,DOB,ADDRESS,NIC,GENDER) values('" + txtFname.getText() + "','"+txtLname.getText()+"', '"+birthday+"' ,'" + txtAddress.getText() + "','" + txtNic.getText() + "','" +getGender()+"')";
        Updater(sql);
        JOptionPane.showMessageDialog(null, "Values are registered");
      
        }
          
        catch( Exception ex){
        JOptionPane.showMessageDialog(null, ex);
              
        
               }
        
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        MemberSearch search = new MemberSearch();
        search.show();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    public static Connection getcon() throws Exception{
        if (c==null) {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassignment","root",null);
           
        }
        
        
      return c;  
    }
    

     public static void Updater(String query) throws Exception {
        
        if (c == null) {
            getcon();
        }
        
        if (s == null) {
            s = c.createStatement();
        }
        s.executeUpdate(query);
    }
    
   

 public static ResultSet Search(String query) throws SQLException, Exception {
        
        getcon();
        
        if (s == null) {
            s = c.createStatement();
        }
        
        rs = s.executeQuery(query);
        return rs;
    
        
    }                
 
 private String getGender(){
     String gender= "Female";
     if(radioMale.isSelected() && (radioFemale.isSelected() == false))
     gender = "Male";
     else if ((radioMale.isSelected()  == false) && radioFemale.isSelected()){
         gender = "Female";
     }
         return gender;
     }
    // }
 
    ////////////
    
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
            java.util.logging.Logger.getLogger(MemberReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private org.jdesktop.swingx.JXDatePicker DOB;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtNic;
    // End of variables declaration//GEN-END:variables
}
