package Demo;

import javax.swing.JOptionPane;

public class MainContraller extends javax.swing.JFrame implements Contraller {

    private ControallerRoom controallerRoom;

    public MainContraller(ControallerRoom controallerRoom) {
        this.controallerRoom = controallerRoom;
        initComponents();
        setVisible(true);
    }

    public void message(String sms) {

    }

    public void areaClean() {

    }

    public void areaNotClean() {

    }

    public void privateMessage(String sms) {

    }

    public void sliderController(int level) {

    }

    public void mainMessage(String sms) {
        jTextArea1.append(sms);

    }

    public void fuleCount(int soldier) {
        
    }

    public void buttonMessage(String massage) {
        jTextArea2.append(massage);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Collect Imformation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 180, -1));

        jCheckBox1.setBackground(new java.awt.Color(51, 255, 51));
        jCheckBox1.setText("Area Clean");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 130, 34));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 244, 60));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox2.setText("Send Private");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 118, 20));

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 244, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Position");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 106, 28));

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintTrack(false);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 370, 35));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 110));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 290, 110));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, 20));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fule Amount");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ammo Amount");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu Bandara\\Desktop\\final project\\FinalProject\\controll Room.png")); // NOI18N
        jLabel5.setText("1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -120, 1210, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (jComboBox2.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                jTextField3.setText(""+controallerRoom.getHelicopterAmmo());
                jTextField2.setText(""+controallerRoom.getHelicopterFule());
                break;
            case 2:
                jTextField3.setText(""+controallerRoom.getTankAmmo());
                jTextField2.setText(""+controallerRoom.getTankFule());
                break;
            default:
                jTextField3.setText(""+controallerRoom.getSubmarineAmmo());
                jTextField2.setText(""+controallerRoom.getSubmarineFule());
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!jTextField4.getText().equals("")) {
            if (jCheckBox2.isSelected()) {
                controallerRoom.privateMessage("Main Controller :" + jTextField4.getText());
            } else {
                controallerRoom.setMessage("Main Controller :" + jTextField4.getText());
            }
            jTextField4.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "input Your Message", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            controallerRoom.areaClean();
        } else {
            controallerRoom.areaNotClean();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        controallerRoom.sliderController(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        if (!jTextField4.getText().equals("")) {
            if (jCheckBox2.isSelected()) {
                controallerRoom.privateMessage("Main Controller :" + jTextField4.getText());
            } else {
                controallerRoom.setMessage("Main Controller :" + jTextField4.getText());
            }
            jTextField4.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "input Your Message", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
