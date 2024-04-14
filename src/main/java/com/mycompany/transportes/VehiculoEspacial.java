/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author DELL
 */
public class VehiculoEspacial extends Vehiculo{
    private String tipoTurbina;
     
    public VehiculoEspacial(String marca,String modelo, String tipoTurbina){
        super(marca,modelo);
        this.tipoTurbina=tipoTurbina;
    
}
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Tipo de Turbinas: "+tipoTurbina);
    }

}
