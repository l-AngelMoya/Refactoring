/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataclass;

/**
 *
 * @author Angel Moya
 */
public class ConCodeSmellEstudiante {
    public String nombre;
    public String apellido;
    public String carrera;
    public String Universidad;
    public String matricula;
    public String Edad;

    public ConCodeSmellEstudiante(String nombre, String apellido, String carrera, String Universidad, String matricula, String Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.Universidad = Universidad;
        this.matricula = matricula;
        this.Edad = Edad;
    }
    
    
}
