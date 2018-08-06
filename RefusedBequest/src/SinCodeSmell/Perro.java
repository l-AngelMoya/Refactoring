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
/*
    Para corregir el Refused Bequest se tiene que crear el metodo ladrar unicamente 
    para el Animal perro ya que esta mal que los otros animales puedan ladrar.
*/
public class Perro extends Animal {

    public Perro() {
        super();
        setNombre("Perro");
       
    }

    public String Ladrar(){
        return ("Woof");
    }

    
}
