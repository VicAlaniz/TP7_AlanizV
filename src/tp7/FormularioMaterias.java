/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class FormularioMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioMaterias
     */
    public FormularioMaterias() {
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

        jlCodigo = new javax.swing.JLabel();
        jlNombreMat = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNomMat = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);

        jlCodigo.setFont(new java.awt.Font("Modern No. 20", 1, 11)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(51, 0, 51));
        jlCodigo.setText("Código de Materia");

        jlNombreMat.setFont(new java.awt.Font("Modern No. 20", 1, 11)); // NOI18N
        jlNombreMat.setForeground(new java.awt.Color(51, 0, 51));
        jlNombreMat.setText("Nombre de la Materia");

        jlAnio.setFont(new java.awt.Font("Modern No. 20", 1, 11)); // NOI18N
        jlAnio.setForeground(new java.awt.Color(51, 0, 51));
        jlAnio.setText("Año al que pertenece");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jtNomMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomMatActionPerformed(evt);
            }
        });

        jtAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnioActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(102, 0, 102));
        jlTitulo.setText("FORMULARIO DE MATERIAS");

        jbGuardar.setForeground(new java.awt.Color(51, 0, 51));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setForeground(new java.awt.Color(51, 0, 51));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setForeground(new java.awt.Color(51, 0, 51));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreMat)
                            .addComponent(jlCodigo)
                            .addComponent(jlAnio))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNomMat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jlTitulo)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreMat)
                    .addComponent(jtNomMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnio)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtNomMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomMatActionPerformed

    private void jtAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAnioActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int idMateria = Integer.parseInt(jtCodigo.getText());
        String nombre = jtNomMat.getText();
        int anio = Integer.parseInt(jtAnio.getText());
        
        Materia m = new Materia(idMateria, nombre, anio);
        HashSet<Materia> mat = MenuPrincipal.getMaterias();
        
        if (mat.add(m)){
        JOptionPane.showMessageDialog(this, "Materia Agregada");}
    }//GEN-LAST:event_jbGuardarActionPerformed

     private void limpiar() {
        jtCodigo.setText("");
        jtNomMat.setText("");
        jtAnio.setText("");        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNombreMat;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNomMat;
    // End of variables declaration//GEN-END:variables
}