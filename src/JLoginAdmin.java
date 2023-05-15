
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class JLoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JLoginAdmin
     */
    public JLoginAdmin() {
        initComponents();
        setSize(770, 522);
        setLocation(200,100);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwrdLabel = new javax.swing.JLabel();
        whosEspace = new javax.swing.JLabel();
        usernameAdmin = new javax.swing.JTextField();
        passwordAdmin = new javax.swing.JPasswordField();
        resetAdmin = new javax.swing.JButton();
        signInAdmin = new javax.swing.JButton();
        usernameLabel1 = new javax.swing.JLabel();
        who = new javax.swing.JButton();
        um51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        passwrdLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        passwrdLabel.setForeground(new java.awt.Color(0, 0, 102));
        passwrdLabel.setText("password:");
        getContentPane().add(passwrdLabel);
        passwrdLabel.setBounds(400, 270, 130, 32);

        whosEspace.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        whosEspace.setForeground(new java.awt.Color(0, 0, 102));
        whosEspace.setText("espace admin");
        getContentPane().add(whosEspace);
        whosEspace.setBounds(430, 90, 170, 32);

        usernameAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameAdminActionPerformed(evt);
            }
        });
        getContentPane().add(usernameAdmin);
        usernameAdmin.setBounds(400, 220, 240, 40);
        getContentPane().add(passwordAdmin);
        passwordAdmin.setBounds(400, 310, 240, 40);

        resetAdmin.setBackground(new java.awt.Color(102, 51, 255));
        resetAdmin.setForeground(new java.awt.Color(255, 255, 255));
        resetAdmin.setText("Reset");
        getContentPane().add(resetAdmin);
        resetAdmin.setBounds(400, 420, 72, 23);

        signInAdmin.setBackground(new java.awt.Color(102, 51, 255));
        signInAdmin.setForeground(new java.awt.Color(255, 255, 255));
        signInAdmin.setText("Sign in");
        signInAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInAdminActionPerformed(evt);
            }
        });
        getContentPane().add(signInAdmin);
        signInAdmin.setBounds(400, 370, 72, 23);

        usernameLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(0, 0, 102));
        usernameLabel1.setText("username :");
        getContentPane().add(usernameLabel1);
        usernameLabel1.setBounds(400, 180, 130, 32);

        who.setText("user ?");
        who.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoActionPerformed(evt);
            }
        });
        getContentPane().add(who);
        who.setBounds(530, 370, 110, 40);

        um51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.png"))); // NOI18N
        getContentPane().add(um51);
        um51.setBounds(0, 0, 760, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameAdminActionPerformed

    private void signInAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInAdminActionPerformed
        // sign in
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL","root","000000");
            String sql ="select * from admininfo where identifiant=? and psswrd=? ";// need fixing
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1,usernameAdmin.getText());
            pst.setString(2,passwordAdmin.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "matched");

                espaceAdmin f1 = new espaceAdmin();
                f1.setVisible(true);
                this.setVisible(false);

            }else{
                JOptionPane.showMessageDialog(null, "not matchin");
                usernameAdmin.setText("");
                passwordAdmin.setText("");
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_signInAdminActionPerformed

    private void whoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoActionPerformed
        // TODO add your handling code here:
        LoginUser f2 = new LoginUser();
        f2.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_whoActionPerformed

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
            java.util.logging.Logger.getLogger(JLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField passwordAdmin;
    private javax.swing.JLabel passwrdLabel;
    private javax.swing.JButton resetAdmin;
    private javax.swing.JButton signInAdmin;
    private javax.swing.JLabel um51;
    private javax.swing.JTextField usernameAdmin;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JButton who;
    private javax.swing.JLabel whosEspace;
    // End of variables declaration//GEN-END:variables
}
