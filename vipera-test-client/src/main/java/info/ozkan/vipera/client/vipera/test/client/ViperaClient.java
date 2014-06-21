/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.ozkan.vipera.client.vipera.test.client;

import info.ozkan.vipera.api.healthdata.HealthDataModel;
import info.ozkan.vipera.api.healthdata.HealthDataValueModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author omer
 */
public class ViperaClient extends javax.swing.JFrame {

    HealthDataAddClient client;

    /**
     * Creates new form ViperaClient
     */
    public ViperaClient()  {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        fieldId1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        fieldValue1 = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        apiKey = new javax.swing.JTextField();
        apiPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldValue2 = new javax.swing.JTextField();
        fieldId2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        url = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Api Anahtarı:");

        jLabel2.setText("Api Parolası:");

        jLabel4.setText("Alan Id:");

        fieldId1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pulse", "systolic", "diastolic", "respirations", "pulseOximetry", "bodyTemp", "bmi", "glucoseLevel", "notificationTest" }));

        jLabel5.setText("Alan Değeri:");

        fieldValue1.setText("50.65");

        button.setText("Gönder");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        apiKey.setText("UuIpbdV3W9a1IZny");

        apiPassword.setText("34e3TnPyRC3WLhOt");

        jLabel12.setText("Alan Id:");

        jLabel13.setText("Alan Değeri:");

        fieldValue2.setText("125.48");

        fieldId2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pulse", "systolic", "diastolic", "respirations", "pulseOximetry", "bodyTemp", "bmi", "glucoseLevel", "notificationTest" }));
        fieldId2.setSelectedIndex(8);

        jLabel3.setText("Vipera Adresi:");

        url.setText("http://localhost:8080/vipera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldId1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldValue1)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fieldId2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldValue2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(apiKey)
                                .addComponent(apiPassword)
                                .addComponent(url)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(apiKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apiPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldValue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fieldId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fieldValue2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(button)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        try {
            client = new HealthDataAddClient(url.getText());
            final HealthDataModel model = createHealthDataModel();
            final String result = client.add(model);
            String message = "";
            if (result.equals(HealthDataAddClient.SUCCESS)) {
                message = "Başarılı ile eklendi!";
            } else if (result.equals(HealthDataAddClient.BAD_REQUEST)) {
                message = "İstenilen formatta veri göndermediniz!";
            } else if (result.equals(HealthDataAddClient.FORBIDDEN)) {
                message = "Yetkilendirme hatası!";
            } else if (result.equals(HealthDataAddClient.NOT_FOUND)) {
                message = "Sayfa bulunamadı. Lütfen internet bağlantınızı kontrol ediniz!";
            } else if (result.equals(HealthDataAddClient.SERVER_ERROR)) {
                message = "Sunucu taraflı bir hata oluştu. Lütfen logları inceleyiniz!";
            } else {
                message = "Başarisiz!";
            }
            JOptionPane.showMessageDialog(this, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lütfen double değer giriniz!");
        }

    }// GEN-LAST:event_buttonActionPerformed

    private HealthDataModel createHealthDataModel() {
        final List<HealthDataValueModel> values
                = new ArrayList<HealthDataValueModel>();

        final HealthDataValueModel value1 = new HealthDataValueModel();
        value1.setKey(fieldId1.getSelectedItem().toString());
        value1.setValue(Double.parseDouble(fieldValue1.getText()));
        values.add(value1);

        final HealthDataValueModel value2 = new HealthDataValueModel();
        value2.setKey(fieldId2.getSelectedItem().toString());
        value2.setValue(Double.parseDouble(fieldValue2.getText()));
        values.add(value2);

        final HealthDataModel model = new HealthDataModel();
        model.setApiKey(apiKey.getText());
        model.setApiPassword(apiPassword.getText());
        model.setValues(values);

        return model;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed"
        // desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase
         * /tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViperaClient.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViperaClient.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViperaClient.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViperaClient.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViperaClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apiKey;
    private javax.swing.JTextField apiPassword;
    private javax.swing.JButton button;
    private javax.swing.JComboBox fieldId1;
    private javax.swing.JComboBox fieldId2;
    private javax.swing.JTextField fieldValue1;
    private javax.swing.JTextField fieldValue2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables

}
