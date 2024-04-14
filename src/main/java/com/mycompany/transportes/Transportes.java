/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author DELL
 */
public class Transportes {

    public static void main(String[] args) {
        
        VehiculoTerrestre vehiculoTerrestre= new VehiculoTerrestre("Toyota","Corolla",4);
        VehiculoAcuatico vehiculoAcuatico= new VehiculoAcuatico("Lancha","Yahama","Motor");
        VehiculoAereo vehiculoAereo= new VehiculoAereo("aereoMexico", "boing101", "Pato");
        
        VehiculoEspacial vehiculoEspacial= new VehiculoEspacial ("Nasa","sus991","Titanio");
        
        
        System.out.println("Informacion del vehiculo Terrestre");
        vehiculoTerrestre.mostrarinfo();
        
        System.out.println("Informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostrarinfo();
        
        System.out.println("Informacion del vehiculo Aereo");
        vehiculoAereo.mostrarinfo();
        
        System.out.println("Informacion del vehiculo Espacial");
        vehiculoEspacial.mostrarinfo();
    }
}
