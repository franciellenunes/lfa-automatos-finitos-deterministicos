/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iftm.lfa.view;

import br.com.iftm.lfa.controller.A;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        btnC = new javax.swing.JRadioButton();
        btnD = new javax.swing.JRadioButton();
        btnE = new javax.swing.JRadioButton();
        btnF = new javax.swing.JRadioButton();
        btnG = new javax.swing.JRadioButton();
        btnH = new javax.swing.JRadioButton();
        btnI = new javax.swing.JRadioButton();
        btnJ = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Autômatos de Estado Finito");

        jLabel2.setText("Selecione abaixo o autômato que deseja simular");

        buttonGroup1.add(btnA);
        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnB);
        btnB.setText("B");

        buttonGroup1.add(btnC);
        btnC.setText("C");

        buttonGroup1.add(btnD);
        btnD.setText("D");

        buttonGroup1.add(btnE);
        btnE.setText("E");

        buttonGroup1.add(btnF);
        btnF.setText("F");

        buttonGroup1.add(btnG);
        btnG.setText("G");

        buttonGroup1.add(btnH);
        btnH.setText("H");

        buttonGroup1.add(btnI);
        btnI.setText("I");

        buttonGroup1.add(btnJ);
        btnJ.setText("J");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnE)
                            .addComponent(btnD)
                            .addComponent(btnC)
                            .addComponent(btnB)
                            .addComponent(btnA))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJ)
                            .addComponent(btnI)
                            .addComponent(btnH)
                            .addComponent(btnG)
                            .addComponent(btnF))
                        .addGap(91, 91, 91)))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnA)
                        .addGap(18, 18, 18)
                        .addComponent(btnB)
                        .addGap(18, 18, 18)
                        .addComponent(btnC)
                        .addGap(18, 18, 18)
                        .addComponent(btnD)
                        .addGap(18, 18, 18)
                        .addComponent(btnE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnF)
                        .addGap(18, 18, 18)
                        .addComponent(btnG)
                        .addGap(18, 18, 18)
                        .addComponent(btnH)
                        .addGap(18, 18, 18)
                        .addComponent(btnI)
                        .addGap(18, 18, 18)
                        .addComponent(btnJ)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
       this.recebeSentenca();
        
    }//GEN-LAST:event_btnAActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    private void recebeSentenca(){
         String cadeia = null;
        while (cadeia == null || cadeia.isEmpty()) {
            cadeia = JOptionPane.showInputDialog("Entre com a sentença que deseja simular");
            if(cadeia == null) {
                break;
            }
            if(!cadeia.isEmpty()){
                new A(cadeia);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnA;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JRadioButton btnC;
    private javax.swing.JRadioButton btnD;
    private javax.swing.JRadioButton btnE;
    private javax.swing.JRadioButton btnF;
    private javax.swing.JRadioButton btnG;
    private javax.swing.JRadioButton btnH;
    private javax.swing.JRadioButton btnI;
    private javax.swing.JRadioButton btnJ;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
