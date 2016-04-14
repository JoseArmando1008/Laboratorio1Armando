/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MandoInuzuka
 */
public class Automoviles {
    private String numeroRegistro;
    private String nombreDueno;
    private String cedulaDueno;
    private String placaAutomovil;

    public Automoviles(String numeroRegistro, String nombreDueno, String cedulaDueno, String placaAutomovil) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueno = nombreDueno;
        this.cedulaDueno = cedulaDueno;
        this.placaAutomovil = placaAutomovil;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getPlacaAutomovil() {
        return placaAutomovil;
    }

    public void setPlacaAutomovil(String placaAutomovil) {
        this.placaAutomovil = placaAutomovil;
    }
    
    public String getInformacion(){
        return "El automovil con el numero de registro: "+ getNumeroRegistro()+"\n Con placa: "+getPlacaAutomovil()+"\n Se encuentra registrado bajo el nombre de: "+getNombreDueno()+" con la cédula: "+getCedulaDueno();
    }
}
