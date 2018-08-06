/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinCodeSmell;

import ConCodeSmell.*;
import java.util.ArrayList;

/**
 *
 * @author Angel Moya
 */
public class TDAHeap {

    private int max;
    private int n;
    private Integer[] elementos;
    private boolean orden; // true= ascendete and false = descendente

    /*
     constructor recibir un arreglo y n=-1
     luego verificar que este parcialmente ordenado
     */
    public TDAHeap(Integer[] elementos) {
        this(100, elementos.length - 1, elementos, false);
    }

    public TDAHeap() {
        this.max = 100;
        elementos = new Integer[max];
        this.n = - 1;
        this.orden = false;
    }

    public TDAHeap(int max, int n, Integer[] elementos, boolean orden) {
        this.max = max;
        this.n = n;
        this.elementos = new Integer[this.max];
        this.orden = orden;

        for (int i = 0; i < elementos.length; i++) {
            this.elementos[i] = elementos[i];
        }
    }

    public void intercambiar(int posnodo, int posMayor) {
        int temporal = this.elementos[posnodo];
        this.elementos[posnodo] = this.elementos[posMayor];
        this.elementos[posMayor] = temporal;
    }

    public void ajustar(int posnodo) {
        if (orden) {
            int pos_mayor, izq, der;
            pos_mayor = posnodo;
            izq = posnodo * 2 + 1;
            der = posnodo * 2 + 2;

            final boolean izqMayor0= (izq >= 0);
            final boolean izqMenorN= (izq <= this.n);
            final boolean elementoMayorNodo = (this.elementos[izq].compareTo(this.elementos[posnodo]) > 0);
            
            if ( izqMayor0 && izqMenorN && elementoMayorNodo ) {
                pos_mayor = izq;
            }
            
            final boolean derMayor0= (der >= 0);
            final boolean derMenorN= (der <= this.n);
            final boolean elementoDerMayorNodo = (this.elementos[der].compareTo(this.elementos[pos_mayor]) > 0);
            if ( derMayor0 && derMenorN && elementoDerMayorNodo ) {
                pos_mayor = der;
            }
            if (pos_mayor != posnodo) {
                intercambiar(posnodo, pos_mayor);
                ajustar(pos_mayor);
            }
        } else {
            int pos_mayor, izq, der;
            pos_mayor = posnodo;
            izq = posnodo * 2 + 1;
            der = posnodo * 2 + 2;
            
            final boolean izqMayor0= (izq >= 0);
            final boolean izqMenorN= (izq <= this.n);
            final boolean elementoMenorNodo = (this.elementos[izq].compareTo(this.elementos[posnodo]) < 0);
            if ( izqMayor0 && izqMenorN && elementoMenorNodo ) {
                pos_mayor = izq;
            }
            
            final boolean derMayor0= (der >= 0);
            final boolean derMenorN= (der <= this.n);
            final boolean elementoDerMenorNodo = (this.elementos[der].compareTo(this.elementos[pos_mayor]) < 0);
            if (derMayor0 && derMenorN && elementoDerMenorNodo) {
                pos_mayor = der;
            }
            if (pos_mayor != posnodo) {
                intercambiar(posnodo, pos_mayor);
                ajustar(pos_mayor);
            }
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Integer[] getElementos() {
        return elementos;
    }

    public void setElementos(Integer[] elementos) {
        this.elementos = elementos;
    }

    public boolean isOrden() {
        return orden;
    }

    public void setOrden(boolean orden) {
        this.orden = orden;
    }

}
