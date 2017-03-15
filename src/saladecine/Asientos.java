/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saladecine;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class Asientos {
    /**
     * atributo que contiene la cantidad de filas
     */
    private int filas;
    /**
     * attributo que contiene la cantidad de columnas
     */
    private int columnas;
    /**
     * atributo que contiene el arreglo con los valores ingresados por el usuairo.
     */
    private int arreglo[][];
    /**
     * atributo que contiene el nombre de la pelicula
     */
    private Pelicula nombre;
    /**
     * atributo que contiene la duracion de la pelicula
     */
    private Pelicula duracion;
    /**
     * atributo que contiene la descripcion de la pelicula
     */
    private Pelicula descripcion;
    /**
     * atributo que contiene el precio de la pelicula
     */
    private Pelicula precio;
    
    Scanner datos = new Scanner(System.in);
/**
 * constructor 
 */
    public Asientos() {
        bienvenida();
        pregunta();
        seleccion();
    }//constructor

   
    public void bienvenida(){
        System.out.println("Bienvenido al cinema");
        System.out.println("La pelicula de hoy es: "+nombre);
        System.out.println("La duracio de la pelicula es: "+duracion);
        System.out.println("La descripcion de la pelcula es: "+descripcion);
        System.out.println("El precio de la entrada es: "+precio);
        
    }//bienvenida
    /**
     * metodo que recibe el valor de las filas y las columnas
     * @return filas
     */
    private void pregunta() {
        System.out.println("Ingrese el numero de filas que desea: ");
        filas=datos.nextInt();
        System.out.println("Ingrese el numero de columnas que desea: ");
        columnas=datos.nextInt();
        int[][] arreglo = new int [filas][columnas];
    } //pregunta
/**
 * metodo que separa las filas en divide las filas en generales, preferenciales y ejecutivas
 */
    private void seleccion(){
        int generales,preferenciales,disponibles=filas;
        System.out.println("¿cuantas sillas desea que sean generales?");
        generales=datos.nextInt();
        if((generales>=disponibles)){
            System.out.println("el numero ingresado es mayor al numero de sillas disponibles");
        }//if
        else{
            disponibles-=generales;
            System.out.println("¿cuantas sillas desea que sean preferenciales?");
            preferenciales=datos.nextInt();
            if(preferenciales>=disponibles){
                System.out.println("El numero ingresado es mayor al numero de sillas disponibles");
            }//if
            else{
                
            }//else
            disponibles-=preferenciales;
            if(disponibles<=0){
                System.out.println("no se guardaran sillas ejecutivas");
            }//if
            else{
                System.out.println(""+disponibles+" filas se guardaran como ejecutivas");
            }//else
        }//else
    }//seleccion
    
/**
 * retorna el valor de las filas
 * @return filas
 */
    public int getFilas() {
        return filas;
    }//getfilas
/**
 * modifica el valor de filas
 * @param filas 
 */
    public void setFilas(int filas) {
        this.filas = filas;
    }//setfilas
/**
 * retorna el valor de las colomnas
 * @return columnas
 */
    public int getColumnas() {
        return columnas;
    }//getcolumnas
/**
 * modifica el valor de las columnas
 * @param columnas 
 */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }//setcolumnas
/**
 * retorna el valor del arreglo
 * @return arreglo
 */
    public int[][] getArreglo() {
        return arreglo;
    }
/**
 * modifica el areglo
 * @param arreglo 
 */
    public void setArreglo(int[][] arreglo) {
        this.arreglo = arreglo;
    }
/**
 * retorna el valor del nombre
 * @return nombre
 */
    public Pelicula getNombre() {
        return nombre;
    }
/**
 * modifica el nombre
 * @param nombre 
 */
    public void setNombre(Pelicula nombre) {
        this.nombre = nombre;
    }
/**
 * retorna el valor de la duracion
 * @return 
 */
    public Pelicula getDuracion() {
        return duracion;
    }
/**
 * modifica la duracion
 * @param duracion 
 */
    public void setDuracion(Pelicula duracion) {
        this.duracion = duracion;
    }
/**
 * retorna la descripcion
 * @return descripcion
 */
    public Pelicula getDescripcion() {
        return descripcion;
    }
/**
 * modifica la desripcion
 * @param descripcion 
 */
    public void setDescripcion(Pelicula descripcion) {
        this.descripcion = descripcion;
    }
/**
 * retorna el valor del precio
 * @return precio
 */
    public Pelicula getPrecio() {
        return precio;
    }
/**
 * modifica el precio
 * @param precio 
 */
    public void setPrecio(Pelicula precio) {
        this.precio = precio;
    }
    
}//Asientos
