package org.tsp.gui;

import javax.swing.JFileChooser;

/**
 * Front-end para los algoritmos genéticos
 */
public class FraMain extends 
    javax.swing.JFrame 
{
    String rutaFileCiudades;

    /**
     * Creates new form FraMain
     */
    public FraMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgTipoAlgoritmo = new javax.swing.ButtonGroup();
        txtProbCruza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumGeneraciones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTamPoblacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        txtProbMutacion = new javax.swing.JTextField();
        lblFilename = new javax.swing.JLabel();
        rbAGE = new javax.swing.JRadioButton();
        rbAGS = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProbCruza.setText("0.8");
        txtProbCruza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProbCruzaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de algoritmo:");

        txtNumGeneraciones.setText("100");
        txtNumGeneraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumGeneracionesActionPerformed(evt);
            }
        });

        jLabel4.setText("Número de Generaciones:");

        txtTamPoblacion.setText("100");

        jLabel1.setText("Prob. de Cruzamiento:");

        jLabel2.setText("Prob. de Mutación:");

        jLabel3.setText("Tamaño de la Población:");

        btnCargar.setText("Cargar archivo de ciudades...");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnRun.setText("Correr");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        txtProbMutacion.setText("0.01");

        rbgTipoAlgoritmo.add(rbAGE);
        rbAGE.setText("AGE - Modificado");
        rbAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAGEActionPerformed(evt);
            }
        });

        rbgTipoAlgoritmo.add(rbAGS);
        rbAGS.setSelected(true);
        rbAGS.setText("AGS - Simple");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbAGE)
                            .addComponent(rbAGS)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtProbCruza, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProbMutacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addComponent(txtTamPoblacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumGeneraciones, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnCargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFilename))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnRun)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProbCruza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProbMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTamPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumGeneraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAGS)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbAGE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblFilename))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargar)))
                .addGap(18, 18, 18)
                .addComponent(btnRun)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProbCruzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProbCruzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProbCruzaActionPerformed

    private void rbAGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAGEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAGEActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        int res = jfc.showOpenDialog(this);
        if(res == JFileChooser.APPROVE_OPTION) {
            this.rutaFileCiudades = jfc.getSelectedFile().getAbsolutePath();
            this.lblFilename.setText(jfc.getSelectedFile().getName());
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        int numgen = Integer.parseInt(this.txtNumGeneraciones.getText());
        int tampob = Integer.parseInt(this.txtTamPoblacion.getText());
        double pc = Double.parseDouble(this.txtProbCruza.getText());
        double pm = Double.parseDouble(this.txtProbMutacion.getText());
        
        if(this.rbAGE.isSelected()) {
            org.tsp.age.Algoritmo.tamPoblacion = tampob;
            org.tsp.age.Algoritmo.numGeneraciones = numgen;
            org.tsp.age.Algoritmo.tasaMutacion = pm;
            org.tsp.age.Algoritmo.tasaCruzamiento = pc;
            org.tsp.age.Algoritmo.rutaArchivoCiudades = rutaFileCiudades;
            org.tsp.age.AGETSP.run();
        }
        else {
            org.tsp.ags.Algoritmo.tamPoblacion = tampob;
            org.tsp.ags.Algoritmo.numGeneraciones = numgen;
            org.tsp.ags.Algoritmo.tasaMutacion = pm;
            org.tsp.ags.Algoritmo.tasaCruzamiento = pc;
            org.tsp.ags.Algoritmo.rutaArchivoCiudades = rutaFileCiudades;
            org.tsp.ags.AGSTSP.run();
        }
    }//GEN-LAST:event_btnRunActionPerformed

    private void txtNumGeneracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumGeneracionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumGeneracionesActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFilename;
    private javax.swing.JRadioButton rbAGE;
    private javax.swing.JRadioButton rbAGS;
    private javax.swing.ButtonGroup rbgTipoAlgoritmo;
    private javax.swing.JTextField txtNumGeneraciones;
    private javax.swing.JTextField txtProbCruza;
    private javax.swing.JTextField txtProbMutacion;
    private javax.swing.JTextField txtTamPoblacion;
    // End of variables declaration//GEN-END:variables
}
