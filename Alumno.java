/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Alumno utilizada en la practica 7 
 * @author Raul Cruz, Carlos Mendoza
 */
public class Alumno extends Persona{
    private int numCuenta, calificacion;
/**
 * Sin Parametros.
 */
    public Alumno() {
    }
/**
 * Contructor con parametros
 * @param nombre Es el nombre del alumno, es de tipo String.
 * @param edad Es la edad del alumno, es de tipo int.
 * @param numCuenta Es el numero de cuenta del  alumno de la escuela, es de tipo int.
 * @param calificacion Es la calificacion del alumno, es de tipo int.
 */
    public Alumno(String nombre, int edad,int numCuenta, int calificacion) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.calificacion = calificacion;
    }
/**
 * Getter para obtener el numero de cuenta delo alumno 
 * @return numCuenta, de tipo int.
 */
    public int getNumCuenta() {
        return numCuenta;
    }
/**
 * Devuelve La calificacion del alumno
 * @return calificacion, de tipo int. 
 */
    public int getCalificacion() {
        return calificacion;
    }
/**
 * Setter para modificar el numero de cuenta
 * @param numCuenta Es el numero de cuenta del alumno, de tipo int.
 */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
/**
 * Setter para modificar la calificacion de la persona
 * @param calificacion Es la calificacion del alumno, de tipo String.
 */
    public void setCalificacion(int calificacion) {
        if (calificacion>=6){
            System.out.println("Aprobado");
            this.calificacion = calificacion;
        }else{
            System.out.println("Reprobado");
            this.calificacion = calificacion;
        }
    }
/**
 * Método toString que devuelve la informacion del alumno
 * @return nombre, edad, numero de cuenta y calificacion.
 */
    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numCuenta=" + numCuenta + ", calificacion=" + calificacion + '}';
    }  
}