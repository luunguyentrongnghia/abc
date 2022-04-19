/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Component;
import static java.lang.System.exit;

/**
 *
 * @author NGUYEN HAI LUAN
 */
public class MainFrame_Chu extends javax.swing.JFrame {
    private ViewFrame_Chu viewFrame_Chu;
    /**
     * Creates new form GioiThieu
     */
    public MainFrame_Chu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        trangChuButton227 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        traCuuButton227 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        TCTabbedPane227 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý linh kiện điện tử - Người quản lý");

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setForeground(new java.awt.Color(51, 0, 51));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        trangChuButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon/Home-icon-16.png"))); // NOI18N
        trangChuButton227.setText("Trang Chủ");
        trangChuButton227.setFocusable(false);
        trangChuButton227.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        trangChuButton227.setMaximumSize(new java.awt.Dimension(100, 60));
        trangChuButton227.setMinimumSize(new java.awt.Dimension(65, 60));
        trangChuButton227.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(trangChuButton227);
        jToolBar1.add(jSeparator5);

        traCuuButton227.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon/search-icon-32.png"))); // NOI18N
        traCuuButton227.setText("Tra cứu");
        traCuuButton227.setFocusable(false);
        traCuuButton227.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        traCuuButton227.setMaximumSize(new java.awt.Dimension(100, 60));
        traCuuButton227.setMinimumSize(new java.awt.Dimension(65, 60));
        traCuuButton227.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        traCuuButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traCuuButton227ActionPerformed(evt);
            }
        });
        jToolBar1.add(traCuuButton227);
        jToolBar1.add(jSeparator6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCTabbedPane227, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TCTabbedPane227, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void traCuuButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traCuuButton227ActionPerformed
        viewFrame_Chu = new ViewFrame_Chu();
        viewFrame_Chu.setVisible(true);
    }//GEN-LAST:event_traCuuButton227ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame_Chu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame_Chu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TCTabbedPane227;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton traCuuButton227;
    private javax.swing.JButton trangChuButton227;
    // End of variables declaration//GEN-END:variables
}
