/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;
import gui.*;
import servicio.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Nicolás Velásquez
 */
public class Pantalla extends javax.swing.JFrame{
    public static int puntaje = 0;
    public static int lifes = 3;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    
    public Pantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/icon.png"));
        return retValue;
    }
    
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
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

        jButtonInicio.setBackground(new java.awt.Color(101, 255, 111));
        jButtonInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButtonInicio.setText("Inicio");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 90, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }
    
    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {    
        
        //new Pantalla().setVisible(false);
        dispose();
        Opciones opc = new Opciones();
        opc.setVisible(true);
        
        
    } 
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
 
}
