/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladecine;

/**
 *
 * @author Jonathan
 */
public class Silla {
    
    /**
     * atributo que contiene la coordenada del asiento
     */
    private int numero[][];
    /**
     * atributo que contiene los datos del cliente
     */
    private Clientes cliente;
/**
 * constructor de la clase
 * @param numero
 * @param cliente 
 */
    public Silla(int[][] numero, Clientes cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }
/**
 * retorna las coordenadas del asiento
 * @return 
 */
    public int[][] getNumero() {
        return numero;
    }
/**
 * modifica las coordenadas del asiento
 * @param numero 
 */
    public void setNumero(int[][] numero) {
        this.numero = numero;
    }
/**
 * retorna los datos del cliente
 * @return cliente
 */
    public Clientes getCliente() {
        return cliente;
    }
/**
 * modifica los datos del cliente
 * @param cliente 
 */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
}
