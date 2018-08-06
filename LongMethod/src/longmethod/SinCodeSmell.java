/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longmethod;

import java.util.Scanner;

/**
 *
 * @author Angel Moya
 */
public class SinCodeSmell {
            
    /*
        Se hace mas optimo el codigo ya que se puede reducir sus lineas.
        En el archivo ConCodeSmell tenemos la variable local icm la cual es inecesaria
        ya que podemos crear un metodo para obtenerla.
    */
    public static void main(String[] args) throws InterruptedException {
        double peso;
        Scanner scan=new Scanner(System.in);

        System.out.print("\033[32mIngrese su péso: ");
        peso=scan.nextDouble(); 

        System.out.print("\033[35mIngrese su altura:  ");
        double altura=scan.nextDouble();

        System.out.println("\033[31mSu indice de masa corporal es : " + icm(peso, altura));

        if(icm(peso, altura)<18.5){
            System.out.println("\033[31mbajo peso");     
        } else if(icm(peso, altura)>= 18.5 && icm(peso, altura)<24.99){
            System.out.println("\033[31mNormal");
        }else{
            System.out.println("\033[31mSobrepeso");
        }
    }


    public static double icm(double peso,double altura){
        return peso/(altura*altura);
    }

}
