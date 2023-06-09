

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
public class LoginUser extends javax.swing.JFrame {

    PreparedStatement ps2;
    ResultSet rs2;
    
    PreparedStatement ps3;
    
    PreparedStatement ps4;
    ResultSet rs4;
    
    int Mle;
    float solde;
    int mdp;
    String nom;
    String prenom;
    int id;
    
    
    
    /**
     * Creates new form login
     */
    public LoginUser() {
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
        usernameLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        aboutUs = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        who = new javax.swing.JButton();
        whosEspace = new javax.swing.JLabel();
        um51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        passwrdLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        passwrdLabel.setForeground(new java.awt.Color(0, 0, 102));
        passwrdLabel.setText("password:");
        getContentPane().add(passwrdLabel);
        passwrdLabel.setBounds(420, 260, 130, 32);

        usernameLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 102));
        usernameLabel.setText("espace user");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(480, 80, 150, 32);

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(420, 190, 240, 40);
        getContentPane().add(password);
        password.setBounds(420, 290, 240, 40);

        aboutUs.setBackground(new java.awt.Color(102, 51, 255));
        aboutUs.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs.setText("About us");
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        getContentPane().add(aboutUs);
        aboutUs.setBounds(30, 420, 140, 20);

        reset.setBackground(new java.awt.Color(102, 51, 255));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        getContentPane().add(reset);
        reset.setBounds(420, 390, 72, 23);

        signIn.setBackground(new java.awt.Color(102, 51, 255));
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setText("Sign in");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        getContentPane().add(signIn);
        signIn.setBounds(420, 350, 72, 23);

        who.setText("admin ?");
        who.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoActionPerformed(evt);
            }
        });
        getContentPane().add(who);
        who.setBounds(550, 350, 110, 40);

        whosEspace.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        whosEspace.setForeground(new java.awt.Color(0, 0, 102));
        whosEspace.setText("username :");
        getContentPane().add(whosEspace);
        whosEspace.setBounds(420, 160, 130, 32);

        um51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.png"))); // NOI18N
        getContentPane().add(um51);
        um51.setBounds(0, -10, 760, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsActionPerformed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        // sign in
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL","root","121139");
            String sql ="select Mle ,Mdp from informations where Mle =? and Mdp=? ";// need fixing
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            ResultSet rs =pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "matched");
                
                Mle = Integer.parseInt(username.getText());
                
                String sql2 = "SELECT Mle,Nom,Prenom,Solde,Mdp From informations WHERE Mle = ?";
                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1,Mle);
                rs2 = ps2.executeQuery();
                
                if (rs2.next()) {
                Mle = rs2.getInt(1);
                nom = rs2.getString(2);
                prenom = rs2.getString(3);
                solde = rs2.getFloat(4);
                mdp = rs2.getInt(5);
                } 
                
                String sql4 = "SELECT max(id) From loginout";
                ps4 = con.prepareStatement(sql4);
                rs4 = ps4.executeQuery();
                                
                if (rs4.next()) {
                    id = rs4.getInt(1) + 1;
                } 
                
                System.out.println(id);
             
                String sql3 = "Insert into loginout values (?,?,?,?,?,?)";
                ps3 = con.prepareStatement(sql3);
                ps3.setInt(1, id);
                ps3.setInt(2, Mle);
                ps3.setString(3, nom);
                ps3.setString(4, prenom);
                ps3.setFloat(5, solde);
                ps3.setInt(6, mdp);

                int rs3 = ps3.executeUpdate();
                
                userMenu f5 = new userMenu();
                f5.setVisible(true);
                this.setVisible(false);
                
           }else{
                JOptionPane.showMessageDialog(null, "not matchin"); 
                username.setText("");
                password.setText("");
            }
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_signInActionPerformed

    private void whoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoActionPerformed
        // TODO add your handling code here:
        JLoginAdmin f4 = new JLoginAdmin();
        f4.setVisible(true);
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
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwrdLabel;
    private javax.swing.JButton reset;
    private javax.swing.JButton signIn;
    private javax.swing.JLabel um51;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton who;
    private javax.swing.JLabel whosEspace;
    // End of variables declaration//GEN-END:variables
}
