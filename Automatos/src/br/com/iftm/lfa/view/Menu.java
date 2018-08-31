package br.com.iftm.lfa.view;

import br.com.iftm.lfa.controller.A;
import br.com.iftm.lfa.controller.B;
import br.com.iftm.lfa.controller.C;
import br.com.iftm.lfa.controller.D;
import br.com.iftm.lfa.controller.E;
import br.com.iftm.lfa.controller.F;
import br.com.iftm.lfa.controller.G;
import br.com.iftm.lfa.controller.H;
import br.com.iftm.lfa.controller.I;
import br.com.iftm.lfa.controller.J;
import javax.swing.JOptionPane;

/**
 * Jframe responsável por apresentar as opções de autômatos para simulação
 *
 * @author Francielle da Silva Nunes
 * @author Luís Fernando de Ávila
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

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Autômatos de Estado Finito");

        jLabel2.setText("Selecione abaixo o autômato que deseja simular");

        buttonGroup1.add(btnA);
        btnA.setText("A - ω começa com a e termina com b");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnB);
        btnB.setText("B - ω possui aaa como subcadeia");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnC);
        btnC.setText("C - ω possui baba como prefixo e abab como sufixo");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnD);
        btnD.setText("D - ω possui no máximo uma ocorrência de cadeia baba");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnE);
        btnE.setText("E - ω não possui ocorrência da cadeia baba");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnF);
        btnF.setText("F - ω possui ocorrência de par de a's seguida por ocorrência impar de b's");
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnG);
        btnG.setText("G - ω começa com a e possui ocorrência par de a's ou começa com b e possui ocorrencia impar de b's");
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnH);
        btnH.setText("H - ω inicia-se com 0 e a soma de todos os seus dígitos é par, ou inicia-se com 1 e a soma de todos os seus digitos é impar");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnI);
        btnI.setText("I - ω inicia-se com uma letra, possuindo a seguir qualquer combinação ed letras e dígitos");
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnJ);
        btnJ.setText(" J - ω é um número inteiro, um número decimal ou um número representado em notação científica");
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJ)
                            .addComponent(btnF)
                            .addComponent(btnG)
                            .addComponent(btnH)
                            .addComponent(btnI)
                            .addComponent(btnB)
                            .addComponent(btnC)
                            .addComponent(btnE)
                            .addComponent(btnA)
                            .addComponent(btnD))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(btnA)
                .addGap(18, 18, 18)
                .addComponent(btnB)
                .addGap(18, 18, 18)
                .addComponent(btnC)
                .addGap(18, 18, 18)
                .addComponent(btnD)
                .addGap(18, 18, 18)
                .addComponent(btnE)
                .addGap(18, 18, 18)
                .addComponent(btnF)
                .addGap(18, 18, 18)
                .addComponent(btnG)
                .addGap(18, 18, 18)
                .addComponent(btnH)
                .addGap(18, 18, 18)
                .addComponent(btnI)
                .addGap(18, 18, 18)
                .addComponent(btnJ)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        this.recebeCadeia('A');
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        this.recebeCadeia('B');
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        this.recebeCadeia('C');
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        this.recebeCadeia('D');
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        this.recebeCadeia('E');
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        this.recebeCadeia('F');
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        this.recebeCadeia('G');
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        this.recebeCadeia('H');
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        this.recebeCadeia('I');
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        this.recebeCadeia('J');
    }//GEN-LAST:event_btnJActionPerformed

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

     /**
     * Método que transforma uma String em uma cadeia de caracteres e a envia
     * para classe escolhida. 
     * @param classe recebe o nome da classe que será instanciada 
     */
    private void recebeCadeia(char classe) {
        String cadeia = null;
        while (cadeia == null) {
            cadeia = JOptionPane.showInputDialog("Entre com a sentença que deseja simular");
            if (cadeia == null) {
                break;
            } else {
                char[] listaCaracteres = cadeia.toCharArray();
                switch (classe) {
                    case 'A':
                        new A(listaCaracteres);
                        break;
                    case 'B':
                        new B(listaCaracteres);
                        break;
                    case 'C':
                        new C(listaCaracteres);
                        break;
                    case 'D':
                        new D(listaCaracteres);
                        break;
                    case 'E':
                        new E(listaCaracteres);
                        break;
                    case 'F':
                        new F(listaCaracteres);
                        break;
                    case 'G':
                        new G(listaCaracteres);
                        break;
                    case 'H':
                        new H(listaCaracteres);
                        break;
                    case 'I':
                        new I(listaCaracteres);
                        break;
                    case 'J':
                        new J(listaCaracteres);
                        break;
                }
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
