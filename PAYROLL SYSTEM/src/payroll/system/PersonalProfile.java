/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static payroll.system.db.Database.viewp;

/**
 *
 * @author admin
 */
public class PersonalProfile extends javax.swing.JFrame {
String s2="";
 
    public PersonalProfile(String s1) {
        initComponents();
        this.setLocationRelativeTo(null);
        s2=s1;
        userid.setText(s2);
      try
      {
        viewp.setString(1,s2);
        ResultSet rs=viewp.executeQuery();
        while(rs.next()){
        name.setText(rs.getString(2));
        dept.setText(rs.getString(3));
        gen.setText(rs.getString(4));
        bg.setText(rs.getString(5));
        cn.setText(String.valueOf(rs.getLong(6)));
        eid.setText(rs.getString(7));
        adds.setText(rs.getString(10));}
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,e);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        eid = new javax.swing.JTextField();
        adds = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        gen = new javax.swing.JTextField();
        bg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personal Profile");
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 95, 140, 30));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 135, 140, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DEPARTMENT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 175, 110, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENDER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 215, 120, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BLOOD GROUP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 255, 130, 30));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CONTACT NO.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 295, 130, 30));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EMAIL ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 335, 110, 30));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 375, 110, 30));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PERSONAL PROFILE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 240, 50));

        cn.setEditable(false);
        cn.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 190, 25));

        name.setEditable(false);
        name.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 95, 190, 25));

        userid.setEditable(false);
        userid.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 190, 25));

        eid.setEditable(false);
        eid.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(eid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 335, 190, 25));

        adds.setEditable(false);
        adds.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 375, 190, 50));

        dept.setEditable(false);
        dept.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });
        getContentPane().add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 175, 190, 25));

        jButton3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 375, 90, -1));

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.setPreferredSize(new java.awt.Dimension(65, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 135, 90, -1));

        gen.setEditable(false);
        gen.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 190, -1));

        bg.setEditable(false);
        bg.setFont(new java.awt.Font("Arial for oup 97", 1, 12)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 190, -1));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/system/33870hd.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, 390));

        jPanel2.setBackground(new java.awt.Color(26, 26, 31));

        jButton5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(509, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton5)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new UpdatePassword().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       userid.setText(s2); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(userid.getText().charAt(0)=='M')
        {        
        new ManagerPanel(userid.getText()).setVisible(true);
        dispose();
        }
        else
        {
            new EmployeePanel(userid.getText()).setVisible(true);
            dispose();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adds;
    private javax.swing.JTextField bg;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField gen;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
