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
public class SinCodeSmellPromedioEnMatriz {
    private int array_a[]={1,2,3,4};
    private int array_b[]={2,4,6,8};
 
    public void CalcularPromedio(){
                
        int average_a = calc_average_of_four(array_a);
        System.out.println("El promedio del primer arreglo es: "+ average_a);
        
        
        int average_b = calc_average_of_four(array_b);
        System.out.println("El promedio del segundo arreglo es: "+ average_b);

    }
    
    public static int calc_average_of_four(int[] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++){
            sum += array[i];
        }
        return sum / 4;
     }   

        public static void main(String[] args) {
            SinCodeSmellPromedioEnMatriz a=new SinCodeSmellPromedioEnMatriz();
            a.CalcularPromedio();
        }


}
