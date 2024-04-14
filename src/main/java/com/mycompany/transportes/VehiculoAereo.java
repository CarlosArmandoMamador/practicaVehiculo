/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author DELL
 */
public class VehiculoAereo extends Vehiculo {
    private String tipoAlas;
    
    public VehiculoAereo(String marca,String modelo, String tipoAlas){
        super(marca,modelo);
        this.tipoAlas=tipoAlas;
    
}
    public void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("Tipo de Alas: "+tipoAlas);
    }
}