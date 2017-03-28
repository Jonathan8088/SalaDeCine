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
public class Clientes {
    /**
     * atributo que contiene el nombre del cliente
     */
    private String nombre;
    /**
     * atributo que contiene el apellido del cliente
     */
    private String apellido;
    /**
     * atributo que contiene la identificacion del cliente
     */
    private int identificacion;
    /**
     * atributo que contiene el genero del cliente
     */
    private String genero;
/**
 * constructor que inicializa las variables
 * @param nombre
 * @param apellido
 * @param identificacion
 * @param genero 
 */
    public Clientes(String nombre, String apellido, int identificacion, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.genero = genero;
    }//CONSTRUCTOR
/**
 * retorna el valor del nombre
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * modifica el nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * retorna el valor del apellido
 * @return apellido
 */
    public String getApellido() {
        return apellido;
    }
/**
 * modifica el apellido
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * retorna el valor de la identificacion
 * @return identificacion
 */
    public int getIdentificacion() {
        return identificacion;
    }
/**
 * modifica la identificacion
 * @param identificacion 
 */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
/**
 * retorna el valor del genero
 * @return genero
 */
    public String getGenero() {
        return genero;
    }
/**
 * modifica el genero
 * @param genero 
 */
    public void setGenero(String genero) {
        this.genero = genero;
    }
 
    
}//clientes
