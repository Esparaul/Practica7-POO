/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Trabajadaor usada en la practica 7
 * @author Rául Cruz,Carlos Mendoza
 */
public class Trabajador extends Persona{
    private int sueldo, antiguedad;
/**
 * Sin Parametros.
 */
    public Trabajador() {
    }
/**
 * Constructor con parametros para trabajador
 * @param nombre Es el nombre del trabajador, es de tipo String.
 * @param edad Es la edad del trabajador, es de tipo int.
 * @param sueldo Es el sueldo que gana el trabajador, es tipo int.
 * @param antiguedad Es el tiempo que lleva en trabajando, es de tipo int.
 */
    public Trabajador(String nombre, int edad, int sueldo, int antiguedad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }
/**
 * Devuelve el sueldo que percibe el trabajor
 * @return sueldo, es de tipo int.
 */
    public int getSueldo() {
        return sueldo;
    }
/**
 * Devuelve el tiempo que lleva trabajando el trabajador
 * @return antiguedad, es de tipo int.
 */
    public int getAntiguedad() {
        return antiguedad;
    }
/**
 * Setter para modificar el sueldo que gana el trabajador
 * @param sueldo , es de tipo int.
 */
    public void setSueldo(int sueldo) {
        if (sueldo>=0)
            this.sueldo = sueldo;
    }
    /**
     * Metodo aumentoSueldo
     * @param sueldoNuevo Es el aumento y genera mas ingreso el trabajador, es de tipo int.
     * @param porcentaje Es el porcentaje de aumento que se le da al trabajor con respecto al sueldo, es de tipo int.
     * @return Nos retorna el nuevo sueldo del trabajador, es de tipo int.
     */
     public int aumentoSueldo(int sueldoNuevo,int porcentaje) {
        if(antiguedad>=5)
            sueldo += (int)(sueldo*porcentaje/100);
            return sueldo;
    }
/**
 * Setter para modificar la antiguedad del trabajador
 * @param antiguedad Es el tiempo de estancia en el trabajo, es de tipo int.
 */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * Metodo toString de Trabajador
     * @return Retorna la informacion del trabajador, es el nombre, edad, sueldo y antiguedad.
     */
    @Override
    public String toString() {
        return super.toString()+" Trabajador{" + "sueldo=" + sueldo + ", antiguedad=" + antiguedad + '}';
    }
}
