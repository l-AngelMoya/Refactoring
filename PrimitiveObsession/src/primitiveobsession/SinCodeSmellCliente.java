/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitiveobsession;

/**
 *
 * @author Angel Moya
 */
public class SinCodeSmellCliente {
    private String nombre;  
    private  String apellido; 
    private long idCliente; 
    private SinCodeSmellDireccion direccion;

    public SinCodeSmellCliente(String nombre, String apellido, long idCliente,SinCodeSmellDireccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
        this.direccion=direccion;
    }
     
}
