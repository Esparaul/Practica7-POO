/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Profesor utilizada en la practica 7
 * @author Raul Cruz, Carlos Mendoza
 */
public class Profesor extends Trabajador {
    private int numEmpleado;
    private String materia;
/**
 * Sin Parametros
 */
    public Profesor() {
    }
/**
 * 
 * @param nombre Es el nombre del profesor, es de tipo String.
 * @param edad Es la edad del profesor, es de tipo int.
 * @param sueldo Es el sueldo que gana el profesor, es de tipo int.
 * @param antiguedad Es el tiempo que llevaba trabajando, es de tipo int.
 * @param numEmpleado Es el numero de empleado, es de tipo int.
 * @param materia  Es la materia que imparte el profesor, es de tipo String.
 */
    public Profesor(String nombre, int edad, int sueldo, int antiguedad, int numEmpleado, String materia) {
        super(nombre, edad, sueldo, antiguedad);
        this.numEmpleado = numEmpleado;
        this.materia = materia;
    }
/**
 * 
 * @return Devuelve el numero de empleado del profesor, es de tipo int.
 */
    public int getNumEmpleado() {
        return numEmpleado;
    }
/**
 * 
 * @return  Devuelve la materia que imparte el profesor, es de tipo String.
 */
    public String getMateria() {
        return materia;
    }
/**
 * 
 * @param numEmpleado El numero de empleado del profesor.
 */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
/**
 * 
 * @param materia  La materia que imparte el profesor.
 */
    public void setMateria(String materia) {
        this.materia = materia;
    }
/**
 * 
 * @return Devuelve la informacion del profesor, su nombre, edad, sueldo, antiguedad, numero de empleado y la materia.
 */
    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "numEmpleado=" + numEmpleado + ", materia=" + materia + '}';
    }
}