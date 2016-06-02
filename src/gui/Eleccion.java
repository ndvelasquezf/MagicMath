/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import servicio.*;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Nicolás Velásquez
 */
public class Eleccion extends javax.swing.JFrame {

    /**
     * Creates new form Eleccion
     */
    private int nivel;
    private boolean verificar;
    public Eleccion(int nivel, boolean verificar) {
        this.verificar = verificar;
        this.nivel = nivel;
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 227, 215));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        jButtonMultiplicacion.setBackground(new java.awt.Color(249, 249, 40));
        jButtonMultiplicacion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButtonMultiplicacion.setText("Multiplicación");
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 153, -1, 40));

        jButtonSuma.setBackground(new java.awt.Color(148, 37, 252));
        jButtonSuma.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButtonSuma.setText("Suma");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 153, -1, 40));

        jButtonResta.setBackground(new java.awt.Color(242, 60, 7));
        jButtonResta.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButtonResta.setText("Resta");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 153, -1, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        dispose();
        Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
       ser.setVisible(true);
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        dispose();
        Servicio_2 ser = new Servicio_2("Multiplicacion",this.nivel,"*",this.verificar);
       ser.setVisible(true);
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        dispose();
        Servicio_2 ser = new Servicio_2("Resta",this.nivel,"-",this.verificar);
       ser.setVisible(true);
    }//GEN-LAST:event_jButtonRestaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
