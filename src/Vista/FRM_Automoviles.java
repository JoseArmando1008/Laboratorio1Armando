/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Automoviles;
import javax.swing.JOptionPane;

/**
 *
 * @author MandoInuzuka
 */
public class FRM_Automoviles extends javax.swing.JFrame {

    Controlador_FRM_Automoviles controlador;

    public FRM_Automoviles() {
        initComponents();
        controlador = new Controlador_FRM_Automoviles(this);
        this.gUI_BotonesAutomoviles1.agregarEventos(controlador);
        this.gUI_InformacionAutomoviles1.agregarEventos(controlador);
        this.gUI_InformacionAutomoviles1.numeroRegistro();
        estadoInicial();
    }

    public String devolverNumeroRegistro(){
        return this.gUI_InformacionAutomoviles1.devolverNumeroRegistro();
    }
    public String devolverNombreDueno(){
        return this.gUI_InformacionAutomoviles1.devolverNombreDueno();
    }
    public String devolverCedulaDueno(){
        return this.gUI_InformacionAutomoviles1.devolverCedulaDueno();
    }
    public String devolverPlacaAutomovil(){
        return this.gUI_InformacionAutomoviles1.devolverPlacaAutomovil();
    }
    
    public void limpiar(){
        this.gUI_InformacionAutomoviles1.limpiar();
    }
    public void estadoInicial(){
        this.gUI_BotonesAutomoviles1.estadoInicial();
        this.gUI_InformacionAutomoviles1.estadoInicial();
    }
    public void deshabilitarNumeroRegistro(){
        this.gUI_InformacionAutomoviles1.deshabilitarNumeroRegistro();
    }
    public void habilitarOpciones(){
        this.gUI_BotonesAutomoviles1.habilitarOpciones();
        this.gUI_InformacionAutomoviles1.habilitarOpciones();
    }
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void habilitarAgregar(){
        this.gUI_BotonesAutomoviles1.habilitarAgregar();
        this.gUI_InformacionAutomoviles1.habilitarAgregar();
    }
    public void mostrarInformacion(String[] arreglo){
        this.gUI_InformacionAutomoviles1.mostrarInformacion(arreglo);
    }
    public String[] devolverInformacion(){
        return this.gUI_InformacionAutomoviles1.devolverInformacion();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_BotonesAutomoviles1 = new Vista.GUI_BotonesAutomoviles();
        gUI_InformacionAutomoviles1 = new Vista.GUI_InformacionAutomoviles();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gUI_BotonesAutomoviles1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gUI_InformacionAutomoviles1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(gUI_InformacionAutomoviles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gUI_BotonesAutomoviles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_Automoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Automoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Automoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Automoviles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Automoviles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_BotonesAutomoviles gUI_BotonesAutomoviles1;
    private Vista.GUI_InformacionAutomoviles gUI_InformacionAutomoviles1;
    // End of variables declaration//GEN-END:variables
}
