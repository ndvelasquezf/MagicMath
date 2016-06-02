/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import data.*;
import gui.*;
import ejecucion.*;
import java.util.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextField;
/**
 *
 * @author Nicolás Velásquez
 */
public class Servicio_2 extends javax.swing.JFrame{
    
    private String nombre;
    private String simbolo;
    private int nivel;
    private String señuelo1;
    private String señuelo2;
    private String señuelo3;
    private String factor1;
    private String factor2;
    private boolean verificar;
    private javax.swing.JButton jButtonFactor1;
    private javax.swing.JButton jButtonFactor2;
    private javax.swing.JButton jButtonFactorSeñuelo1;
    private javax.swing.JButton jButtonFactorSeñuelo2;
    private javax.swing.JButton jButtonFactorSeñuelo3;
    private javax.swing.JButton jButtonIntentos;
    private javax.swing.JButton jButtonPuntaje;
    private javax.swing.JButton jButtonResultado;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNomOpera;
    private javax.swing.JLabel jLabelSimbolo;
    
    public Servicio_2(String nombre, int nivel, String simbolo, boolean verificar) {
       
        int t =  0;
          do{ArrayList<Integer> puntajes = new ArrayList<Integer>();
    Collections.sort(puntajes);
    
          }while (t != 0);
        this.verificar = verificar;
        this.nombre = nombre;
        this.nivel = nivel;
        this.simbolo = simbolo;
        numeros();
        this.setLocation(400, 150);
        initComponents();
       
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/icon.png"));
        return retValue;
    }
    
    public void numeros(){
        int azar;
        azar=(int)(1+Math.round(Math.random()*(2)));
        if(this.nivel == 1){
            if(this.nombre.equals("Multiplicacion")){
                Multiplicacion operacion =
                        new Multiplicacion(1,4);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Suma")){
                Suma operacion =
                        new Suma(1,10);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Resta")){
                Resta operacion =
                        new Resta(1,10);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }
        }else if (this.nivel == 2){
            if(this.nombre.equals("Multiplicacion")){
                Multiplicacion operacion =
                        new Multiplicacion(4,10);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Suma")){
                Suma operacion =
                        new Suma(10,100);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Resta")){
                Resta operacion =
                        new Resta(10,100);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }
        }else if (this.nivel == 3){
            if(this.nombre.equals("Multiplicacion")){
                Multiplicacion operacion =
                        new Multiplicacion(10,50);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Suma")){
                Suma operacion =
                        new Suma(100,1000);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }else if (this.nombre.equals("Resta")){
                Resta operacion =
                        new Resta(100,1000);
                operacion.definir();
                if(azar == 1){
                    this.señuelo1 = Integer.toString(operacion.getResultado());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 =  Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==2){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getResultado());
                    this.señuelo3 = Integer.toString(operacion.getSeñuelo2());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }else if(azar ==3){
                    this.señuelo1 = Integer.toString(operacion.getSeñuelo1());
                    this.señuelo2 = Integer.toString(operacion.getSeñuelo2());
                    this.señuelo3 = Integer.toString(operacion.getResultado());
                    this.factor1 = Integer.toString(operacion.getFactor1());
                    this.factor2 = Integer.toString(operacion.getFactor2());
                }
            }
        }
        
        
    }
    
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelNomOpera = new javax.swing.JLabel();
        jButtonFactor1 = new javax.swing.JButton();
        jButtonFactor2 = new javax.swing.JButton();
        jButtonResultado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelSimbolo = new javax.swing.JLabel();
        jButtonFactorSeñuelo1 = new javax.swing.JButton();
        jButtonFactorSeñuelo2 = new javax.swing.JButton();
        jButtonFactorSeñuelo3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonIntentos = new javax.swing.JButton();
        jButtonPuntaje = new javax.swing.JButton();
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

        jLabelNomOpera.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelNomOpera.setText(this.nombre);
        getContentPane().add(jLabelNomOpera, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 120, 30));

        jButtonFactorSeñuelo3.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        jButtonFactorSeñuelo3.setText(this.señuelo3);
        jButtonFactorSeñuelo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactor1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactorSeñuelo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 60, 60));

        jButtonFactor2.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButtonFactor2.setText(this.factor2);
        jButtonFactor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactor2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, 60));

        jButtonResultado.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButtonResultado.setText("?");
        getContentPane().add(jButtonResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 60, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, 30));

        jLabelSimbolo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelSimbolo.setText(this.simbolo);
        getContentPane().add(jLabelSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 40));

        jButtonFactorSeñuelo1.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        jButtonFactorSeñuelo1.setText(this.señuelo1);
        jButtonFactorSeñuelo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactorSeñuelo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactorSeñuelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 60, 60));

        jButtonFactorSeñuelo2.setFont(new java.awt.Font("Comic Sans MS", 1, 10));
        jButtonFactorSeñuelo2.setText(this.señuelo2);
        jButtonFactorSeñuelo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactorSeñuelo2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactorSeñuelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 60, 60));

        jButtonFactor1.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        jButtonFactor1.setText(this.factor1);
        jButtonFactor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFactorSeñuelo3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFactor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, 60));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Escoge la respuesta correcta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Puntaje:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Intentos restantes:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        String op = Pantalla.lifes + "";
        jButtonIntentos.setText(op);
        getContentPane().add(jButtonIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
        String aux = Pantalla.puntaje + "";
        jButtonPuntaje.setText(aux);
        getContentPane().add(jButtonPuntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));
     
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        pack();
    }
    
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }                                            

    private void jButtonFactorSeñuelo3ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }   
                                                            
    private void jButtonFactor2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
         
    }                                              

    private void jButtonFactor1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
         int respuesta = Integer.parseInt(this.jButtonFactorSeñuelo3.getText());
        int validar = 0;
        if (this.nombre.equals("Suma")){
            validar = Integer.parseInt(this.factor1) + Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Resta")){
            validar = Integer.parseInt(this.factor1) - Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Multiplicacion")){
            validar = Integer.parseInt(this.factor1) * Integer.parseInt(this.factor2);
        }
        System.out.println(validar + " " + respuesta);
        if(respuesta == validar){
            if(this.nombre.equals("Suma")){
                Pantalla.puntaje += 1;
                dispose();
                Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                ser.setVisible(true);
                }else if(this.nombre.equals("Resta")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                    ser.setVisible(true);
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                    ser.setVisible(true);
                }
            }else{
                if(this.nombre.equals("Suma")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Resta")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                        ser.setVisible(true);
                    }
                }
        }
    
    }                                              

    private void jButtonFactorSeñuelo2ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        int respuesta = Integer.parseInt(this.jButtonFactorSeñuelo2.getText());
        int validar = 0;
        if (this.nombre.equals("Suma")){
            validar = Integer.parseInt(this.factor1) + Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Resta")){
            validar = Integer.parseInt(this.factor1) - Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Multiplicacion")){
            validar = Integer.parseInt(this.factor1) * Integer.parseInt(this.factor2);
        }
        System.out.println(validar+" "+respuesta);
        if(respuesta == validar){
            if(this.nombre.equals("Suma")){
                Pantalla.puntaje += 1;
                dispose();
                Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                ser.setVisible(true);
                }else if(this.nombre.equals("Resta")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                    ser.setVisible(true);
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                    ser.setVisible(true);
                }
            }else{
                if(this.nombre.equals("Suma")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                         writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Resta")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <= 0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                        writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                         writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                        ser.setVisible(true);
                    }
                }
        }
    }                                                     

    private void jButtonFactorSeñuelo1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        int respuesta = Integer.parseInt(this.jButtonFactorSeñuelo1.getText());
        int validar = 0;
        if (this.nombre.equals("Suma")){
            validar = Integer.parseInt(this.factor1) + Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Resta")){
            validar = Integer.parseInt(this.factor1) - Integer.parseInt(this.factor2);
        }else if (this.nombre.equals("Multiplicacion")){
            validar = Integer.parseInt(this.factor1) * Integer.parseInt(this.factor2);
        }
        System.out.println(validar + " " + respuesta);
        if(respuesta == validar){
            if(this.nombre.equals("Suma")){
                Pantalla.puntaje += 1;
                dispose();
                Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                ser.setVisible(true);
                }else if(this.nombre.equals("Resta")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                    ser.setVisible(true);
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.puntaje += 1;
                    dispose();
                    Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                    ser.setVisible(true);
                }
            }else{
                if(this.nombre.equals("Suma")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                         writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Suma", this.nivel,"+",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Resta")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                         writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Resta", this.nivel,"-",this.verificar);
                        ser.setVisible(true);
                    }
                }else if(this.nombre.equals("Multiplicacion")){
                    Pantalla.lifes -= 1;
                    if(Pantalla.lifes <=0){
                        if(this.verificar){
                            if(Pantalla.puntaje <=10){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 1" );
                            }else if(Pantalla.puntaje <=20){
                                JOptionPane.showMessageDialog(null,"Tu nivel es 2" );
                            }else {
                                JOptionPane.showMessageDialog(null,"Tu nivel es 3" );
                            }
                        }
                        JOptionPane.showMessageDialog(null,"Tu Puntaje es "+Pantalla.puntaje );
                         writeScore(Pantalla.puntaje);
                        dispose();
                        Opciones opc = new Opciones();
                        opc.setVisible(true);
                    }else{
                        dispose();
                        Servicio_2 ser = new Servicio_2("Multiplicacion", this.nivel,"*",this.verificar);
                        ser.setVisible(true);
                    }
                }
        }
    }
    
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //JOptionPane s = new JOptionPane();
        int a = JOptionPane.showConfirmDialog(null, "¿Desea regresar?");
        System.out.println(a);
        if (a == 1){
            
        }else if(a == 0){
            
        }
    } 
    
    public void writeScore(Integer contact){
         FileWriter writer = null;
         try{ 
          writer = new FileWriter("Scores.txt",true);
         writer.write(contact +System.getProperty("line.separator"));
         writer.close();     
         
         } catch (FileNotFoundException ax){
            System.out.println("Archivo no encontrado");
        } catch (IOException ax) {
           //Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ax);
           System.out.print("No se puede escribir en el archivo wCPT");
        } catch (Exception e){
            System.out.print("\nError Diferente");
        }
         finally{
            System.out.print("\nSe ha ejecutado el metodo writeContactPlainText");
         }   
     }
           
     public ArrayList<Integer> getScores(){
         ArrayList<Integer> current = new ArrayList<Integer>();
         current.clear();
         int iteratorRead = 1;
         try{
         File myFile = new File("ContactoPlain.txt");
         
         FileReader fileReader = new FileReader(myFile);
         BufferedReader reader = new BufferedReader(fileReader);
         
         String line = null;
         while((line = reader.readLine()) !=null){
             
             JTextField currentJText = new JTextField();
             //currentJText = assignTextFieldSerializable(iteratorRead);
             currentJText.setText(line);
             current.add(Integer.parseInt(line));
             //Se creo un metodo automatico en esta clase pero se debe
             
             System.out.print("\n"+ line);
              
         }
         
         
         }
          catch (FileNotFoundException ax){
            System.out.println("Archivo no encontrado");
        } catch (IOException ax) {
           
           System.out.print("No se puede leer del archivo");
        }
         finally{
            System.out.print("\nSe ha ejecutado el metodo Plain Text");
         }
         return current;
     }
     
     /* public String readContactPlainString(int f){
         try{
             int k = 0 ;
         File myFile = new File("Scores.txt");
         
         FileReader fileReader = new FileReader(myFile);
         BufferedReader reader = new BufferedReader(fileReader);
         
         String line;
             line = null;
         while((line = reader.readLine()) !=null || f != k){
             
         }
         
         
         }
          catch (FileNotFoundException ax){
            System.out.println("Archivo no encontrado");
        } catch (IOException ax) {
           
           System.out.print("No se puede leer del archivo");
        }
         finally{
            System.out.print("\nSe ha ejecutado el metodo");
         }
         return ("s");
     }

*/
    

}
