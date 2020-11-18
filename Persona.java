/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 *Clase persona utilizada en la practica 7
 * @author Rául Cruz,Carlos Mendoza 
 */
public class Persona {
    private String nombre;
    private int edad;
/**
 * Sin Parametros
 */
    public Persona() {
    }
/**
 * Constructor con argumentos para la clase Persona
 * @param nombre Es el nombre de la persona, es de tipo String.
 * @param edad  Es la edad de la persona, es de tipo int.
 */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
/**
 * Getter para obtener el nombre
 * @return nombre, tipo String.
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Getter para obtener la edad de la persona
 * @return edad, tipo int.
 */
    public int getEdad() {
        return edad;
    }
/**
 * Setter para modificar el nombre de la persona
 * @param nombre Es el nombre de la persona, es de tipo String
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Setter para modificar la edad de la persona
 * @param edad Es la edad de la persona, es de tipo int.
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * Metdo toString para obtener la informacion de la persona
 * @return Devuelve la informacion de la persona con su nombre y edad.
 */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}