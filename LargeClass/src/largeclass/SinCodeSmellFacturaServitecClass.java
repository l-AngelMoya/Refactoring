/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeclass;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Angel Moya
 */

/*
    Aplicando Extract Class tenemos que es mejor separar las funciones en este 
    caso producto es separado de la factura ya que dispone de sus propios atributos.
*/
public class SinCodeSmellFacturaServitecClass {
    private int noFactura;
    private Date fechaEmision;
    private String cedula;
    private double subtotal;
    private double iva;
    private double total;
    private ArrayList productos;

     public SinCodeSmellFacturaServitecClass(){
        this(0, null, null, 0, 0, 0,null);
    }
    
    public SinCodeSmellFacturaServitecClass(int noFactura, Date fechaEmision, String cedula, double subtotal, double iva, double total,ArrayList productos) {
        this.noFactura = noFactura;
        this.fechaEmision = fechaEmision;
        this.cedula = cedula;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.productos=productos;
    }
    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    
    
    
}
