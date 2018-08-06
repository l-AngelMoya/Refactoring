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
public class ConCodeSmell {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan=new Scanner(System.in);

        System.out.print("\033[32mIngrese su péso: ");
        double peso=scan.nextDouble(); 
        System.out.print("\033[35mIngrese su altura:  ");
        double altura=scan.nextDouble();

        double icm= peso/(altura*altura);

        System.out.println("\033[31mSu indice de masa corporal es : " + icm);

        if(icm<18.5){
            System.out.println("\033[31mbajo peso");     
        } else if(icm>= 18.5 && icm<24.99){
            System.out.println("\033[31mNormal");
        }else{
            System.out.println("\033[31mSobrepeso");
        }
    }
}
