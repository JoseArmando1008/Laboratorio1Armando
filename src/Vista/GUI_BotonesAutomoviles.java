/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Automoviles;

/**
 *
 * @author MandoInuzuka
 */
public class GUI_BotonesAutomoviles extends javax.swing.JPanel {

    Controlador_FRM_Automoviles controlador;
    public GUI_BotonesAutomoviles() {
        initComponents();
        
    }

    public void agregarEventos(Controlador_FRM_Automoviles controlador){
        this.controlador=controlador;
        this.BTN_Buscar.addActionListener(controlador);
        this.BTN_Agregar.addActionListener(controlador);
        this.BTN_Modificar.addActionListener(controlador);
        this.BTN_Eliminar.addActionListener(controlador);
    }
    public void estadoInicial(){
        this.BTN_Buscar.setEnabled(true);
        this.BTN_Agregar.setEnabled(false);
        this.BTN_Eliminar.setEnabled(false);
        this.BTN_Modificar.setEnabled(false);
    }
    public void habilitarOpciones(){
        this.BTN_Buscar.setEnabled(false);
        this.BTN_Agregar.setEnabled(false);
        this.BTN_Eliminar.setEnabled(true);
        this.BTN_Modificar.setEnabled(true);
    }
    public void habilitarAgregar(){
        this.BTN_Buscar.setEnabled(true);
        this.BTN_Agregar.setEnabled(true);
        this.BTN_Eliminar.setEnabled(false);
        this.BTN_Modificar.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Buscar = new javax.swing.JButton();
        BTN_Agregar = new javax.swing.JButton();
        BTN_Modificar = new javax.swing.JButton();
        BTN_Eliminar = new javax.swing.JButton();

        BTN_Buscar.setText("Buscar");

        BTN_Agregar.setText("Agregar");

        BTN_Modificar.setText("Modificar");

        BTN_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BTN_Buscar)
                .addGap(18, 18, 18)
                .addComponent(BTN_Agregar)
                .addGap(18, 18, 18)
                .addComponent(BTN_Modificar)
                .addGap(18, 18, 18)
                .addComponent(BTN_Eliminar)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Buscar)
                    .addComponent(BTN_Agregar)
                    .addComponent(BTN_Modificar)
                    .addComponent(BTN_Eliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Agregar;
    private javax.swing.JButton BTN_Buscar;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_Modificar;
    // End of variables declaration//GEN-END:variables
}
