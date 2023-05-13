import java.awt.Color;
import java.awt.Font;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class liste extends javax.swing.JFrame {
    
    
    //private static final String url="jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL";
    //private static final String user="root";
    //private static final String pass="190219";
    
    Connection con =null;
    PreparedStatement pst=null;
    ResultSet rs =null;
    
    
    public liste() {
        initComponents();
        
        //window size
        setSize(770, 522);
        setLocation(200,100);
        //mise en page
        tableInfo.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        tableInfo.getTableHeader().setOpaque(false);
        //jTable1.getTableHeader().setBackground(new Color(255,102,255));
        tableInfo.getTableHeader().setForeground(new Color(0,0,0));
        tableInfo.getRowHeight(25);
        
        //data display
        upDateDB();
    }
        
//===============================fuction=================================
    
    public void upDateDB(){
        
            try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/resum5?zeroDateTimeBehavior=CONVERT_TO_NULL","root","190219");
            String sql ="select * from informations  ";
            PreparedStatement pst =con.prepareStatement(sql);
            rs=pst.executeQuery();
            ResultSetMetaData rsmd =rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel) tableInfo.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector columnData=new Vector();
                for(int i=1;i<=n;i++){
                    columnData.add(rs.getString("Mle"));
                    columnData.add(rs.getString("Nom"));
                    columnData.add(rs.getString("Prenom"));
                    columnData.add(rs.getString("Solde"));
                    columnData.add(rs.getString("Mdp"));
                }
                //System.out.println(v);
                dtm.addRow(columnData);
                
            }
        }   catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }   
    }
        
//========================================================================
        
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        backgroud3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("resum5 réservations");
        getContentPane().setLayout(null);

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mle", "Nom", "Prenom", "Solde", "Mdp"
            }
        ));
        tableInfo.setFocusable(false);
        tableInfo.setSelectionBackground(new java.awt.Color(153, 102, 255));
        tableInfo.setShowHorizontalLines(true);
        tableInfo.getTableHeader().setReorderingAllowed(false);
        tableInfo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableInfoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableInfo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tableInfoMouseDragged(evt);
            }
        });
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableInfoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 640, 300);

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Retour Au menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 450, 150, 23);

        backgroud3.setBackground(new java.awt.Color(255, 255, 255));
        backgroud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/functionsAdmin1.png"))); // NOI18N
        getContentPane().add(backgroud3);
        backgroud3.setBounds(10, 0, 810, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableInfoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableInfoAncestorAdded
         
    }//GEN-LAST:event_tableInfoAncestorAdded

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        // TODO add your handling code here:
        boolean a=tableInfo.isEditing();
        
        if (a==false){
            JOptionPane.showMessageDialog(null,"pour ajouter DATA cliquer ajouter");
        }
    }//GEN-LAST:event_tableInfoMouseClicked

    private void tableInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tableInfoMouseEntered

    private void tableInfoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_tableInfoMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        espaceAdmin f = new espaceAdmin();
        f.setVisible(true);
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
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(liste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new liste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud3;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}