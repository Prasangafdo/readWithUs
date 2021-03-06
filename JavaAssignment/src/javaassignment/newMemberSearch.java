/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaassignment.MemberReg.Updater;
import static javaassignment.MemberReg.Search;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Prasanga Fernando
 */
public class newMemberSearch extends javax.swing.JFrame {

    /**
     * Creates new form newMemberSearch
     */
    public newMemberSearch() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMemberdata = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel2)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 690, 120);

        txtSearchBox.setText("Enter member name here");
        txtSearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSearchBoxMouseEntered(evt);
            }
        });
        getContentPane().add(txtSearchBox);
        txtSearchBox.setBounds(120, 140, 177, 30);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(350, 140, 80, 30);

        jScrollPane1.setViewportView(tblMemberdata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(52, 190, 600, 150);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(170, 350, 80, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(350, 350, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBoxMouseClicked
        // TODO add your handling code here:
        //txtSearchBox.selectAll();
        txtSearchBox.setText("");//To make it null on click
    }//GEN-LAST:event_txtSearchBoxMouseClicked

    private void txtSearchBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBoxMouseEntered
        txtSearchBox.selectAll();
    }//GEN-LAST:event_txtSearchBoxMouseEntered

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String sql = "SELECT * FROM memberreg WHERE `Fname` = '"+ txtSearchBox.getText()+"'|| `Lname`= '"+ txtSearchBox.getText()+"'";

        try {
            ResultSet rset=  Search(sql);
            tblMemberdata.setModel(DbUtils.resultSetToTableModel(rset));
        } catch (Exception ex) {
            Logger.getLogger(MemberSearch.class.getName()).log(Level.SEVERE, null, ex);//auto gen one

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String MemberID = tblMemberdata.getValueAt(0, 0).toString();
        int MID = Integer.valueOf((String) MemberID);
        String Fname =    tblMemberdata.getValueAt(0, 1).toString();
        String Lname =   tblMemberdata.getValueAt(0, 2).toString();
        String Birthday = tblMemberdata.getValueAt(0, 3).toString();
        String Address =  tblMemberdata.getValueAt(0, 4).toString();
        String NIC =     tblMemberdata.getValueAt(0, 5).toString();
        String Gender =   tblMemberdata.getValueAt(0, 6).toString();

        String sql = "UPDATE `memberreg` SET `Fname`='"+Fname+"', `Lname`='"+Lname+"', `dob` = '"+Birthday+"',  `Address` = '"+Address+"', `NIC` = '"+NIC+"', `Gender` = '"+Gender+"' where MemberID = '"+MID+"'";

        try{
            Updater(sql);
            JOptionPane.showMessageDialog(null, "Values are updated");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String MemberID = tblMemberdata.getValueAt(0, 0).toString();
        int MID = Integer.valueOf((String) MemberID);
        String sql = "DELETE from `memberreg` WHERE `MemberID` = '"+MID+"'";
        try{
            Updater(sql);
            JOptionPane.showMessageDialog(null, "Value deleted successfully");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(newMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newMemberSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newMemberSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMemberdata;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
