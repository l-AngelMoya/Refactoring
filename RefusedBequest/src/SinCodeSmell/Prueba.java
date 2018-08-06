/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinCodeSmell;

/**
 *
 * @author Angel Moya
 */
public class Prueba {
    public static void main(String args[]) {
        Animal gato=new Animal();
        //Error
        //System.out.println(gato.Ladrar());
        
        Perro perro=new Perro();
        System.out.println(perro.Ladrar());
        
    }
}
