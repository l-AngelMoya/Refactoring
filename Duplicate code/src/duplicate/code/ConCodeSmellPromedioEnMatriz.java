/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate.code;

/**
 *
 * @author Angel Moya
 */
public class ConCodeSmellPromedioEnMatriz {
    private int array_a[]={1,2,3,4};
    private int array_b[]={2,4,6,8};
 
    public void CalcularPromedio(){
        
        int sum_a = 0;
        for (int i = 0; i < 4; i++){
           sum_a += array_a[i];
        }
        int average_a = sum_a / 4;
        System.out.println("El promedio del primer arreglo es: "+ average_a);
        
        
        int sum_b = 0;
        for (int i = 0; i < 4; i++){
           sum_b += array_b[i];
        }
        int average_b = sum_b / 4;
        System.out.println("El promedio del segundo arreglo es: "+ average_b);

    }
    
        public static void main(String[] args) {
            ConCodeSmellPromedioEnMatriz a=new ConCodeSmellPromedioEnMatriz();
            a.CalcularPromedio();
        }


}
