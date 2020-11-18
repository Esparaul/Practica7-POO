/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Empleado creada como previo de practica 7
 * @author Raul Criuz, Carlos Mendoza
 */
public class Empleado {
    private String nombre;
    private int numEmpleado, sueldo;
    /**
     * Sin parametros.
     */
    public Empleado() {
    }
    /**
     * Es el constructor que recibe parametros
     * @param nombre Es el nombre del empleado
     * @param numEmpleado Es el numero de trabajador del empleado
     * @param sueldo Es el sueldo del empleado
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * Getter que nos da el nombre del empleado
     * @return nombre, es de tipo String
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter que da el nombre del empleado
     * @param nombre, es de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter que regresa el numero de empleado
     * @return numEmpleado, de tipo int
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * Setter para asignbar un numero de empleado
     * @param numEmpleado, de tipo int
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * Getter que nos informa el sueldo
     * @return sueldo, de tipo int
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Setter para modificar el sueldo del empleado
     * @param sueldo, de tipo int
     */
    public void setSueldo(int sueldo) {
        if (sueldo >= 0)
            this.sueldo = sueldo;
    }
    /**
     * Método toString que nos da la informacion del empleado
     * @return informacion del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    public int aumentarSueldo(int porcentaje){
        sueldo += (int)(sueldo*porcentaje/1000);
        return sueldo;
    }
}
