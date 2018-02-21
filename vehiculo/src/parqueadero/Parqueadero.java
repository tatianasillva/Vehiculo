/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import vehiculo.Moto;

/**
 *
 * @author Estudiantes
 */
public class Parqueadero {
    
    public static void main (String[] args ){
       
       
        Fichavehiculo miFicha;
       miFicha=new Fichavehiculo();
      miFicha.setVisible(true);
       
       Moto miMoto=new Moto();
       
       
      miFicha.miMotoEnFichavehiculo=miMoto; 
       
       
    }
    
    
    
    
}
