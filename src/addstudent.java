
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class addstudent extends javax.swing.JFrame {

    /**
     * Creates new form addstudent
     */
    public addstudent() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        se = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        phn = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT'S REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 105, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setText("Phone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 222, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setText("Course:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 282, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setText("Roll:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 334, 290, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setText("Address:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 393, -1, -1));

        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 54, 208, -1));
        getContentPane().add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 104, 208, -1));
        getContentPane().add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 160, 208, -1));
        getContentPane().add(cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 281, 208, -1));

        phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnActionPerformed(evt);
            }
        });
        getContentPane().add(phn, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 221, 208, -1));
        getContentPane().add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 333, 208, -1));
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 392, 208, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 445, -1, -1));

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 16)); // NOI18N
        jLabel9.setText("BACK");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\OneDrive\\Pictures\\SimpleBG_picForProject\\reg.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
            String sql= "insert into stureg values(?,?,?,?,?,?,?)";
            
            PreparedStatement ptstmt= conn.prepareStatement(sql);
            ptstmt.setString(1, sid.getText());
            ptstmt.setString(2, sn.getText());
            ptstmt.setString(3, se.getText());
            ptstmt.setString(4, phn.getText());
            ptstmt.setString(5, cor.getText());
            ptstmt.setString(6, roll.getText());
            ptstmt.setString(7, add.getText());
            
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data stores successfully");
            conn.close();
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         studentinformation obj = new studentinformation();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnActionPerformed

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
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField cor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField phn;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField se;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    // End of variables declaration//GEN-END:variables
}
