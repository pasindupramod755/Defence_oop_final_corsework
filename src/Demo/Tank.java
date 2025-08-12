package Demo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Tank extends javax.swing.JFrame implements Contraller {

    private ControallerRoom controallerRoom;
    private int energyLevel = 100;

    public Tank(ControallerRoom controallerRoom) {
        this.controallerRoom = controallerRoom;
        initComponents();
        setVisible(true);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
        energy();
    }

    public void message(String sms) {
        jTextArea1.append(sms + "\n");
    }

    public void areaClean() {
        jTextField1.setText("Area is cleaned");
        jTextField1.setForeground(Color.black);
        jTextField1.setBackground(Color.green);
    }

    public void areaNotClean() {
        jTextField1.setText("Area is Not cleaned");
        jTextField1.setForeground(Color.white);
        jTextField1.setBackground(Color.red);

    }

    public void privateMessage(String sms) {
        if (jCheckBox1.isSelected()) {
            jTextArea1.append(sms + "\n");
        }
    }

    public void sliderController(int level) {
        if (jCheckBox1.isSelected()) {
            if (level > 30) {
                jButton3.setEnabled(true);
            } else {
                jButton3.setEnabled(false);
            }
            if (level > 50) {
                jButton2.setEnabled(true);
            } else {
                jButton2.setEnabled(false);
            }
            if (level > 70) {
                jButton1.setEnabled(true);
            } else {
                jButton1.setEnabled(false);
            }
            if (level > 90) {
                jButton5.setEnabled(true);
            } else {
                jButton5.setEnabled(false);
            }
        }
    }

    public void mainMessage(String sms) {

    }

    public void fuleCount(int soldier) {

    }

    public void buttonMessage(String massage) {

    }

    public void energy() {
        new Thread(() -> {
            while (true) {
                jSlider1.setValue(energyLevel--);
                jTextField2.setText(energyLevel + "%");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                }
                if (energyLevel == 0) {
//             JOptionPane.showMessageDialog(null, "Submarine has Not avalbel Oxegen", "Error", JOptionPane.ERROR_MESSAGE);
                    int choice = JOptionPane.showConfirmDialog(
                            null,
                            "Helicopter has no Energy left!\nDo you want to refill?",
                            "Energy Depleted",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE
                    );
                    if (choice == JOptionPane.YES_OPTION) {
                        energyLevel = 100;
                    } else {
                        JOptionPane.showMessageDialog(null, "Helecopter has Left 😐❌", "Left", JOptionPane.ERROR_MESSAGE);
                        dispose();
                    }
                }
            }
        }).start();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 71, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 144, 506, 154));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 316, 369, -1));

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(2);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 71, 290));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 316, 119, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Area is Not cleaned");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 260, 40));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 106, -1));

        jButton1.setText("Radar Oparation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, -1));

        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 106, -1));

        jButton2.setText("Missile Oparater");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, -1));

        jLabel1.setText("Ammo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 50, 20));

        jButton3.setText("Shoot");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, -1));

        jLabel2.setText("Fule");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 40, 10));

        jButton5.setText("Rotarte Shooting");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 110, 148, -1));

        jCheckBox1.setText("Position");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 166, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pasindu Bandara\\Desktop\\final project\\FinalProject\\tank.png")); // NOI18N
        jLabel3.setText("1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -220, 1110, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controallerRoom.buttonMessage("Tank Radar Oparation" + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        controallerRoom.buttonMessage("Tank Rotarte Shooting" + "\n");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!jTextField3.getText().equals("")) {
            controallerRoom.mainMessage("Tank : " + jTextField3.getText() + "\n");
            jTextField3.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "input Your Message", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if (!jTextField3.getText().equals("")) {
            controallerRoom.mainMessage("Tank : " + jTextField3.getText() + "\n");
            jTextField3.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "input Your Message", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controallerRoom.buttonMessage("Tank Shoot" + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controallerRoom.buttonMessage("Tank Missile Oparater" + "\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        controallerRoom.setTankFule((int)jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        controallerRoom.setTankAmmo((int)jSpinner2.getValue());
    }//GEN-LAST:event_jSpinner2StateChanged

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
