/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class espaceAdmin extends javax.swing.JFrame {

    /**
     * Creates new form espaceAdmin
     */
    public espaceAdmin() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        nbReservations = new javax.swing.JButton();
        ajouter = new javax.swing.JButton();
        listeEleves = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        modifier.setBackground(new java.awt.Color(153, 102, 255));
        modifier.setText("Modifier Solde");
        modifier.setToolTipText("");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        getContentPane().add(modifier);
        modifier.setBounds(290, 330, 180, 70);

        supprimer.setBackground(new java.awt.Color(153, 102, 255));
        supprimer.setText("supprimer éleve");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        getContentPane().add(supprimer);
        supprimer.setBounds(510, 240, 180, 70);

        nbReservations.setBackground(new java.awt.Color(153, 102, 255));
        nbReservations.setText("les Reservations");
        nbReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbReservationsActionPerformed(evt);
            }
        });
        getContentPane().add(nbReservations);
        nbReservations.setBounds(510, 330, 180, 70);

        ajouter.setBackground(new java.awt.Color(153, 102, 255));
        ajouter.setLabel("Ajouter éleve");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        getContentPane().add(ajouter);
        ajouter.setBounds(290, 240, 180, 70);

        listeEleves.setBackground(new java.awt.Color(204, 204, 255));
        listeEleves.setText("Liste des étudiants");
        listeEleves.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listeEleves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeElevesActionPerformed(evt);
            }
        });
        getContentPane().add(listeEleves);
        listeEleves.setBounds(500, 170, 220, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Déconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 20, 120, 23);

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/espaceAdmin1.png"))); // NOI18N
        adminLabel.setText("csczvzv");
        getContentPane().add(adminLabel);
        adminLabel.setBounds(0, 0, 760, 468);
        adminLabel.getAccessibleContext().setAccessibleName("admin1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        DeleteFrame f1 = new DeleteFrame();
        f1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        DeleteFrame f2 = new DeleteFrame();
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_supprimerActionPerformed

    private void nbReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbReservationsActionPerformed
        // TODO add your handling code here:
        NbReservations f5 = new NbReservations();
        f5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nbReservationsActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
        ajouterFrame f4 = new ajouterFrame();
        f4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ajouterActionPerformed

    private void listeElevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeElevesActionPerformed
        // TODO add your handling code here:
        liste f3 = new liste();
        f3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listeElevesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JLoginAdmin f6 = new JLoginAdmin();
        f6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(espaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(espaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(espaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(espaceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new espaceAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JButton listeEleves;
    private javax.swing.JButton modifier;
    private javax.swing.JButton nbReservations;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
