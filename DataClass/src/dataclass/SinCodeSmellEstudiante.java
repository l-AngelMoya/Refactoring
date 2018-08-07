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
public class SinCodeSmellEstudiante {
    private String nombre;
    private String apellido;
    private String carrera;
    private String Universidad;
    private String matricula;
    private String Edad;

    public SinCodeSmellEstudiante(String nombre, String apellido, String carrera, String Universidad, String matricula, String Edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.Universidad = Universidad;
        this.matricula = matricula;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
        
}
