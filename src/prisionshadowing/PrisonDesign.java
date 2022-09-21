/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisionshadowing;

/**
 *
 * @author hecto
 */
public class PrisonDesign extends javax.swing.JFrame {

    /**
     * Creates new form PrisonDesign
     */
    public PrisonDesign() {
        initComponents();
        showPrison();
    }
    public void showPrison(){
    
     PrisionShadowing Prison = new PrisionShadowing();
     Prison.diplayPrison();
     String txt="";
     for(int x = 0; x<Prison.PrisionMatrixHigh ; x++){
         txt = txt+"    ";
        for(int y = 0; y<Prison.PrisionMatrixWidth ; y++){

            txt = txt + Prison.Matrix[x][y]+"\t";

        }
        txt = txt+"\n";
     }
     prisonArea.setText(txt);
     this.numerGuardstxt.setText(String.valueOf(Prison.numberGuards));
     this.prisonerResistancetxt.setText(String.valueOf(Prison.prisonerResistance));
     this.scapeResolutiontxt.setText(Prison.canEscapeMsg);
     this.shortesPathtxt.setText(String.valueOf(Prison.shortestPath));
     this.givenStepstxt.setText(String.valueOf(Prison.givenSteps));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        prisonArea = new javax.swing.JTextArea();
        numerGuardstxt = new javax.swing.JTextField();
        numberGuardslbl = new javax.swing.JLabel();
        prisonerResistancetxt = new javax.swing.JTextField();
        prisonerResistancelbl = new javax.swing.JLabel();
        scapeResolutionlbl = new javax.swing.JLabel();
        shortestPathlbl = new javax.swing.JLabel();
        shortesPathtxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        scapeResolutiontxt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        givenStepslbl = new javax.swing.JLabel();
        givenStepstxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        prisonArea.setEditable(false);
        prisonArea.setColumns(20);
        prisonArea.setRows(5);
        jScrollPane1.setViewportView(prisonArea);

        numerGuardstxt.setEditable(false);
        numerGuardstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerGuardstxtActionPerformed(evt);
            }
        });

        numberGuardslbl.setText("Cantidad de Guardias");

        prisonerResistancetxt.setEditable(false);

        prisonerResistancelbl.setText("Resistencia del Prisionero");

        scapeResolutionlbl.setText("Resolucion");

        shortestPathlbl.setText("Ruta de Escape mas Corta");

        shortesPathtxt.setEditable(false);

        scapeResolutiontxt.setEditable(false);
        scapeResolutiontxt.setColumns(20);
        scapeResolutiontxt.setLineWrap(true);
        scapeResolutiontxt.setRows(5);
        jScrollPane2.setViewportView(scapeResolutiontxt);

        jButton1.setText("Jugar de Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        givenStepslbl.setText("Pasos Dados");

        givenStepstxt.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(shortestPathlbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(shortesPathtxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(givenStepslbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(givenStepstxt, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numerGuardstxt)
                                            .addComponent(numberGuardslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(prisonerResistancelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(prisonerResistancetxt))))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scapeResolutionlbl)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberGuardslbl)
                    .addComponent(prisonerResistancelbl)
                    .addComponent(scapeResolutionlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numerGuardstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prisonerResistancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(givenStepslbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(givenStepstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(shortestPathlbl)
                .addGap(18, 18, 18)
                .addComponent(shortesPathtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numerGuardstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerGuardstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerGuardstxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showPrison();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrisonDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrisonDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrisonDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrisonDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrisonDesign().setVisible(true);
            }
        });
        
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel givenStepslbl;
    private javax.swing.JTextField givenStepstxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numberGuardslbl;
    private javax.swing.JTextField numerGuardstxt;
    private javax.swing.JTextArea prisonArea;
    private javax.swing.JLabel prisonerResistancelbl;
    private javax.swing.JTextField prisonerResistancetxt;
    private javax.swing.JLabel scapeResolutionlbl;
    private javax.swing.JTextArea scapeResolutiontxt;
    private javax.swing.JTextField shortesPathtxt;
    private javax.swing.JLabel shortestPathlbl;
    // End of variables declaration//GEN-END:variables
}