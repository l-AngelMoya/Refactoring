/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConCodeSmell;

/**
 *
 * @author Angel Moya
 */
public class Prueba {
    
    public static void main(String args[]) {
        TestMethod("perro");
    }
   
    public static void TestMethod(String animal){
        if(animal.equalsIgnoreCase("perro")){
            System.out.println("perro");
        }else if(animal.equalsIgnoreCase("Gato")){
            System.out.println("gato");
        }else if(animal.equalsIgnoreCase("tortuga")){
            System.out.println("tortuga");
        }
     
    }
}


