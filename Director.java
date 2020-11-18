/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Director usada en la practica 7
 * @author  Raul Cruz, Carlos Mendoza
 */
public class Director extends Trabajador{
    private String facultad;
    private int anios;
/**
 * Sin Parametros.
 */
    public Director() {
    }
/**
 * Contructor con parametros de la clase Director
 * @param nombre Es el nombre del director, es de tipo String.
 * @param edad Es la edad del director, es de tipo int.
 * @param sueldo Es el sueldo que gana el director, es de tipo int.
 * @param antiguedad Es el tiempo que lleva en la facultad trabajando, es de tipo int.
 * @param facultad Es la facultad que esta a cargo el director, es de tipo String.
 * @param anios  Es el tiempo que lleva como director en la Facultad, es de tipo int.
 */
    public Director(String nombre, int edad, int sueldo, int antiguedad, String facultad, int anios) {
        super(nombre, edad, sueldo, antiguedad);
        this.facultad = facultad;
        this.anios = anios;
    }
/**
 * Devuelve el nombre de la Facultad a cargo.
 * @return facultad, de tipo String
 */
    public String getFacultad() {
        return facultad;
    }
/**
 * Devuelve el tiempo que lleva como director.
 * @return anios, de tipo int
 */
    public int getAnios() {
        return anios;
    }
/**
 * Setter para modificar la Facultad a esta a cargo el director.
 * @param facultad, de tipo String
 */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
/**
 * Setter para modificar el tiempo que lleva como director.
 * @param anios, de tipo int
 */
    public void setAnios(int anios) {
        this.anios = anios;
    }
    /**
     * Setter con dos parametros para modificar el tiempo que lleva como director
     * @param calidad Es el indicar si su estancia como director es bueno o malo.
     * @param calificacion Es la calificacion que se le da al director durante su mandato.
     */
    public void setAnios(boolean calidad,int calificacion) {  //sobrecarga
        if (calidad==true){
            System.out.println("Su estancia de director es buena");
            this.anios = calificacion;}
        else{
            System.out.println("Su estancia de director es mala");
            this.anios=calificacion;}
        }
    /*
     * Metodo toString que devuelve la informacion del director
     * @return nombre, edad, sueldo, antiguedad, facultad a cargo y los años como director.
     */
    @Override
    public String toString(){
        return super.toString()+ " Director{" + "facultad=" + facultad + ", anios=" + anios + '}';
    }
}