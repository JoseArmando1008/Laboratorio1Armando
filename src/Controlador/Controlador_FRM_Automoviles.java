/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosAutomoviles;
import Vista.FRM_Automoviles;
import Vista.GUI_InformacionAutomoviles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author MandoInuzuka
 */
public class Controlador_FRM_Automoviles implements ActionListener {

    FRM_Automoviles automoviles;
    MetodosAutomoviles metodos;
    GUI_InformacionAutomoviles gui;
    
    
    public Controlador_FRM_Automoviles(FRM_Automoviles automoviles) {
        this.automoviles = automoviles;
        metodos = new MetodosAutomoviles();
        gui = new GUI_InformacionAutomoviles();
        
    }//Fin del metodo Constructor

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Buscar")) {

            buscar();
            System.out.println("Buscar");

        }
        if (e.getActionCommand().equals("Agregar")) {

            this.metodos.agregarAutomoviles(this.automoviles.devolverInformacion());
            metodos.mostrarInformacionAutomoviles();
            automoviles.limpiar();
            automoviles.estadoInicial();
            this.gui.numeroRegistro();
            JOptionPane.showMessageDialog(null,"Automovil registrado correctamente");
            
        }
        if (e.getActionCommand().equals("Modificar")) {

            this.metodos.modificarAutomovil(this.automoviles.devolverNumeroRegistro(), this.automoviles.devolverNombreDueno(), this.automoviles.devolverCedulaDueno(), this.automoviles.devolverPlacaAutomovil());
            this.automoviles.limpiar();
            this.automoviles.estadoInicial();
            JOptionPane.showMessageDialog(null,"El automovil registrado se modificó correctamente");
            System.out.println("Modificar");
        }
        if (e.getActionCommand().equals("Eliminar")) {
            this.metodos.eliminarAutomoviles(this.automoviles.devolverNumeroRegistro());
            this.automoviles.limpiar();
            this.automoviles.estadoInicial();
            JOptionPane.showMessageDialog(null,"El automovil registrado se eliminó correctamente");

            System.out.println("Eliminar");
        }
    }//Fin del ActionPerformed    

    public void buscar() {
        if (metodos.consultarAutomovil(this.automoviles.devolverNumeroRegistro())) {
            this.automoviles.mostrarInformacion(metodos.getArregloInformacion());
            this.automoviles.habilitarOpciones();
            this.automoviles.deshabilitarNumeroRegistro();
            this.automoviles.mostrarMensaje("El automovil buscado con el numero de registro: " + this.automoviles.devolverNumeroRegistro() + " se encuentra registrado");
        } else {
            this.automoviles.mostrarMensaje("El automovil buscado no se encuentra registrado.");
            this.automoviles.habilitarAgregar();
        }
    }
}//Fin de la clase controlador

