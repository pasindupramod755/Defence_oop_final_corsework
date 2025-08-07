package Demo;

public class Submarine extends javax.swing.JFrame implements Contraller {

    public Submarine() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 80, -1, -1));

        jButton2.setText("Sonar Oparater");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 71, -1));

        jLabel1.setText("Ammo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 144, 506, 154));

        jButton3.setText("Shoot");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        jLabel2.setText("Soldiers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 55, -1, -1));

        jTextField3.setText("Type Message");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 369, -1));

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 80, 71, 290));

        jButton5.setText("Trident-2 Missile");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 110, 148, -1));

        jButton4.setText("Send");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 316, 119, -1));

        jCheckBox1.setText("Position");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 114, 97, -1));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 330, 40));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 52, -1, -1));

        jButton1.setText("Toahawk Missile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        jSlider2.setMajorTickSpacing(10);
        jSlider2.setMinorTickSpacing(2);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        getContentPane().add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 80, 71, 290));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 52, 71, -1));

        jLabel3.setText("Oxygen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 50, -1));

        jLabel4.setText("Energy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
