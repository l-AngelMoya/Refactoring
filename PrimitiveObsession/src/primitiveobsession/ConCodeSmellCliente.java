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
public class ConCodeSmellCliente {
//public class ClienteFibertel { 
private String nombre;  
private  String apellido; 
//private MedioPago medioPago; 
private long idCliente; 
 
 
private String nombreCalle; 
private String numero; 
private String piso; 
private String Depto; 
private String codigoPostal; 
private String ciudad; 
 
//Metodos propios de clase Cliente 

    public ConCodeSmellCliente(String nombre, String apellido, long idCliente, String nombreCalle, String numero, String piso, String Depto, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
        this.nombreCalle = nombreCalle;
        this.numero = numero;
        this.piso = piso;
        this.Depto = Depto;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
 
    
//Metodos que piden a grito una clase Direccion 
 
    public boolean esCodigoPostalRural() { 
     //codigo
        return false;
    }
    
    public String direccionFormateadaParaEnvioPostal() {
           //codigo
           return null;
    } 
 
    public boolean esEdificio() {
        //codigo
                return false;

    }
 
} 

