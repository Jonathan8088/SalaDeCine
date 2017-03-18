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
        
    private String nombre="El aro 3";;
    /**
     * atributo que contiene la duracion de la pelicula
     */
    private int duracion=180;;
    /**
     * atributo que contiene la descripcion de la pelicula
     */
    private String descripcion=" ";;
    /**
     * atributo que contiene el precio de la pelicula para adultos
     */
    private byte precioAdulto=(byte)4000;;
    /**
     * atributo que contiene el precio de la pelicula para niños
     */
    private byte precioNiño=(byte)3000;;
    
    private int arr[][] ;
    
    int generales,preferenciales,disponibles;
    
    Scanner datos = new Scanner(System.in);
/**
 * constructor 
 */
    public Asientos() {
        
        bienvenida();
        pregunta();
        llenar();
        seleccion();
        cuadro();
        tipoSilla();
    }//constructor

    
/**
 * metodo que inicializa el programa con los datos de la pelicula
 */   
    private void bienvenida(){
        System.out.println("Bienvenido al cinema");
        System.out.println("La pelicula de hoy es: "+nombre);
        System.out.println("La duracio de la pelicula es: "+duracion+" minutos");
        System.out.println("La descripcion de la pelcula es: "+descripcion);
        
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
        int arreglo[][] = new int[filas][columnas];
    } //pregunta
/**
 * metodo que separa las filas en divide las filas en generales, preferenciales y ejecutivas
 */
    private void llenar(){
        int arreglo[][] = new int [filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                arreglo[i][j]=0;
            }
        }
        
    }//lenar
    private void seleccion(){
       
        disponibles=filas;
        System.out.println("¿cuantas sillas desea que sean generales?");
        generales=datos.nextInt();
        if((generales>disponibles)){
            System.out.println("el numero ingresado es mayor al numero de sillas disponibles");
        }//if
        else{
            disponibles-=generales;
            if(disponibles==0){
                System.out.println("no quedan mas sillas disponibles");
            }else{
            System.out.println("¿cuantas sillas desea que sean preferenciales?");
            preferenciales=datos.nextInt();
            if(preferenciales>disponibles){
                System.out.println("El numero ingresado es mayor al numero de sillas disponibles");
            }//if
            else{
                disponibles-=preferenciales;
            }//else
            
            if(disponibles<=0){
                System.out.println("no se guardaran sillas ejecutivas");
            }//if
            else{
                System.out.println(""+disponibles+" filas se guardaran como ejecutivas");
            }//else
        }//else
        }//else
        
    }//seleccion
    
    
    private void cuadro(){
        for(int i=0;i<columnas;i++){
            System.out.print(" "+(i+1));
        }//for
        for(int i=0;i<filas;i++){
            System.out.print("\n"+(i+1));
            for(int j=0;j<columnas;j++){
                System.out.print(" 0"); 
            }//forj
        }//fori
    }//cuadro
    
    private void tipoSilla(){
        int opcion=1;
        while(opcion==1){
        byte x,y,silla;
        System.out.println("\n ¿Que tipo de silla desea reservar?");
        System.out.println("1. General \n 2.Preferencial \n 3. Ejecutiva");
        silla=datos.nextByte();
        switch(silla){
            case 1:{
                pintaGeneral();
                break;
            }//case1
            case 2:{
                pintaPreferencial();
                break;
            }//case2
            case 3:{
                pintaEjecutiva();
                break;
            }//case3
            default:{
                System.out.println("Ingrese una opcion valida");
            }//default
        }//switch
            System.out.println("¿Desea registrar otra silla? \n 1.Si \n 2.No");
            opcion=datos.nextInt();
        }//while
        
        
    }//tipoSilla
    
    private void pintaGeneral(){
       
        for(int i=0;i<columnas;i++){
            System.out.print(" "+(i+1));
        }//for
        for(int i=0;i<generales;i++){
            System.out.print("\n"+(i+1));
            for(int j=0;j<columnas;j++){
                System.out.print(" 0"); 
            }//forj
        }//fori
        reserva();
    }//pintaGeneral
    
    private void pintaPreferencial(){
        
        for(int i=0;i<columnas;i++){
            System.out.print(" "+(i+1));
        }//for
        int a=generales;
        for(int i=0;i<preferenciales;i++){
            System.out.print("\n"+(a+=1));
            for(int j=0;j<columnas;j++){
                System.out.print(" 0");
            }//forj
        }//fori
        reserva();
    }//pintaPreferencial
    
    private void pintaEjecutiva(){
        for(int i=0;i<columnas;i++){
            System.out.print(" "+(i+1));
        }//for
        int m= generales+preferenciales;
        for(int i=0;i<disponibles;i++){
            System.out.print("\n"+(m+1));
            for(int j=0;j<columnas;j++){
                System.out.print(" 0");
            }//forj
        }//for
        reserva();
    }//pintaEjecutiva
    
    private void reserva(){
        int x,y;
        System.out.println("\n Acontinuacion ingrese las coordenadas de la silla que desea resrvar ");
        System.out.println("Ingrese la coordenada en x: ");
        x=datos.nextByte();
        System.out.println("Ingrese la coordenada en y: ");
        y=datos.nextByte();
        int arreglo[][] = new int [x-1][y-1];
        informacion();
    }//reserva
    
    private void informacion(){
        String nombre,apellido;
        int identificacion;
        byte edad;
        String genero;
        System.out.println("Digite la edad de la persona: ");
        edad= datos.nextByte();
        System.out.println("Escriba el nombre del cliente:");
        nombre=datos.next();
        System.out.println("Escriba el apellido: ");
        apellido=datos.next();
        System.out.println("Escriba la identificacion del cliente: ");
        identificacion=datos.nextInt();
        System.out.println("Escriba el genero del cliente: ");
        genero=datos.next();
        Clientes cliente1 = new Clientes(nombre, apellido, identificacion, genero);
        Silla silla = new Silla(arreglo, cliente1);
    }//informacion
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
 * retorna el valor de la duracion
 * @return 
 */
    public int getDuracion() {
        return duracion;
    }
/**
 * modifica la duracion
 * @param duracion 
 */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
/**
 * retorna la descripcion
 * @return descripcion
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * modifica la desripcion
 * @param descripcion 
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * retorna el valor del precio
 * @return precio
 */
    public byte getPrecio() {
        return precioAdulto;
    }
/**
 * modifica el precio
 * @param precioAdulto
 */
    public void setPrecio(Byte precioAdulto) {
        this.precioAdulto = precioAdulto;
    }
/**
 * retorna el valor del precio para niños
 * @return precioNiño
 */
    public byte getPrecioNiño() {
        return precioNiño;
    }
/**
 * modifica el valor del precio para niños
 * @param precioNiño 
 */
    public void setPrecioNiño(byte precioNiño) {
        this.precioNiño = precioNiño;
    }

   
    
    
}//Asientos
