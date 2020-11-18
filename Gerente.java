/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Gerente creada como previo para la prcatica 7
 * @author Raul Criuz, Carlos Mendoza
 */
public class Gerente extends Empleado{
    private int presupuesto;
    /**
     * Sin parametros
     */
    public Gerente() {
    }
    /**
     * Constructor que rtecibe parametros
     * @param nombre Es el onmbre del gerente, de tipo Stringt
     * @param numEmpleado Es el numero de empleado del gerente, de tipo int
     * @param sueldo Es el sueldo del gerente, de tipo int
     * @param presupuesto Es el presupuesto del gerente, es de tipo int
     */
    public Gerente(String nombre, int numEmpleado,int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    /**
     * Getter que da el presupuesto del gerente
     * @return presupuesto, de tipo int
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Setter para modificar el presupuesto del gerente
     * @param presupuesto, de tipo int
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Setter con dos argumentos para modificar el presupuesto
     * @param anio, de tipo int
     * @param tasa, de tipo float
     */
    public void setPresupuesto(int anio, float tasa){
        this.presupuesto += (int)(presupuesto/tasa*anio);
    }
    /**
     * Metodo toString que da la informacion del gerente
     * @return informacion de gerente
     */
    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
