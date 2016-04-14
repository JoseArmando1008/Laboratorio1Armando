/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author MandoInuzuka
 */
public class MetodosAutomoviles {
    ArrayList <Automoviles> arrayAutomoviles;
    String arregloInformacion[];
    
    public MetodosAutomoviles(){
        arrayAutomoviles=new ArrayList<Automoviles>();
        arregloInformacion=new String[4];
    }
    
    public void agregarAutomoviles(String informacion[]){
        Automoviles temporal = new Automoviles(informacion[0], informacion[1], informacion[2],informacion[3]);
        this.arrayAutomoviles.add(temporal);
    }
    
    public void mostrarInformacionAutomoviles(){
        Automoviles temporal;
        temporal = this.arrayAutomoviles.get(0);
        System.out.println(temporal.getInformacion());
    }
    public boolean consultarAutomovil(String numeroRegistro){
       boolean autoEncontrado=false;
       for(int i=0;i<arrayAutomoviles.size();i++)
        {
           if(arrayAutomoviles.get(i).getNumeroRegistro().equals(numeroRegistro))
                {
                    arregloInformacion[0]=arrayAutomoviles.get(i).getNombreDueno();
                    arregloInformacion[1]=arrayAutomoviles.get(i).getCedulaDueno();
                    this.arregloInformacion[2]=arrayAutomoviles.get(i).getPlacaAutomovil();
                    autoEncontrado=true;
                }
        }
       return autoEncontrado;
    }
    
    public void modificarAutomovil(String numeroRegistro, String nombreDueno, String cedulaDueno, String placaAutomovil){
    for(int i=0;i<arrayAutomoviles.size();i++)
        {
           if(arrayAutomoviles.get(i).getNumeroRegistro().equals(numeroRegistro))
            {
                this.arrayAutomoviles.get(i).setNombreDueno(nombreDueno);
                this.arrayAutomoviles.get(i).setCedulaDueno(cedulaDueno);
                this.arrayAutomoviles.get(i).setPlacaAutomovil(placaAutomovil);
            }
        }
    }
    
    public void eliminarAutomoviles (String numeroRegistro)
    {
        for(int i=0;i<arrayAutomoviles.size();i++)
        {
           if(arrayAutomoviles.get(i).getNumeroRegistro().equals(numeroRegistro))
            {
               this.arrayAutomoviles.remove(i);
            }
        }
    }
    public String[] getArregloInformacion(){
        return arregloInformacion;
    }
            
}




