/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinCodeSmell;

import ConCodeSmell.*;

/**
 *
 * @author Angel Moya
 */
public class Animal {
    private String nombre;
    
    public void dormir(){
    
    }
    
  
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
