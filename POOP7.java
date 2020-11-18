/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop7;

/**
 * Clase Main para el desarrollo de las actividades de la practica 7
 * @author espar
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("1=========");
        Empleado empleado = new Empleado();
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("2===========");
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("NumEmpleado "+gerente1.getNumEmpleado());
        System.out.println("Sueldo "+gerente1.getSueldo());
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("3=======");
        Gerente gerente2 = new Gerente("Julio", 88, 200000,500000);
        System.out.println("Nombre "+gerente2.getNombre());
        System.out.println("NumEmpleado "+gerente2.getNumEmpleado());
        System.out.println("Sueldo "+gerente2.getSueldo());
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println("4===========");
        //Sobrescritura
        System.out.println(gerente2);
        
        System.out.println("5=======");
        //Sobreescritura
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println("Tarea======");
        System.out.println("6 ****");
        Persona persona1=new Persona();
        persona1.setNombre("Daniela");
        persona1.setEdad(19);
        System.out.println(persona1);
        
        Alumno alumno1=new Alumno();
        System.out.println("*** ALUMNO ***");
        alumno1.setNombre("Carlos");
        alumno1.setEdad(19);
        alumno1.setNumCuenta(317189915);
        alumno1.setCalificacion(9);
        System.out.println("Nombre "+alumno1.getNombre());
        System.out.println("Edad " + alumno1.getEdad());
        System.out.println("Num de cuenta "+ alumno1.getNumCuenta());
        System.out.println("Calificación " + alumno1.getCalificacion());
        System.out.println(alumno1);
        
        Profesor profesor1=new Profesor("Antonio",28,15000,3,12345,"POO");
        System.out.println("*** PROFESOR ***");
        System.out.println("Nombre "+profesor1.getNombre());
        System.out.println("Edad " + profesor1.getEdad());
        System.out.println("Num de empleado " + profesor1.getNumEmpleado());
        System.out.println("Sueldo Actual " + profesor1.getSueldo());
        System.out.println("Antiguedad " +profesor1.getAntiguedad());
        System.out.println("Materia imparte " + profesor1.getMateria());
        profesor1.setAntiguedad(5);
        profesor1.aumentoSueldo(15000, 10);
        System.out.println(profesor1.aumentoSueldo(1500, 10));
        System.out.println(profesor1);
        
        Director director1=new Director();
        System.out.println("*** DIRECTOR 1 *****");
        director1.setNombre("Carlos");
        director1.setEdad(50);
        director1.setAntiguedad(9);
        director1.setAnios(6);
        director1.setSueldo(27500);
        director1.setFacultad("Ingenieria");
        System.out.println("Nombre "+ director1.getNombre());
        System.out.println("Edad " + director1.getEdad());
        System.out.println("Facultad a encargo " + director1.getFacultad());
        System.out.println("Tiempo " + director1.getAnios() + " años en la Facultad");
        
        director1.setAnios(true, 4);
        System.out.println("El tiempo que estara a cargo de la facultad es  "+ director1.getAnios() + " años");
        System.out.println(director1);
        
        System.out.println("*** DIRECTOR 2 *****");
        Director director2=new Director(" Octavia", 39, 25000,4,"Medicina",6);
        System.out.println("Nombre "+ director2.getNombre());
        System.out.println("Edad " + director2.getEdad());
        System.out.println("Facultad a encargo " + director2.getFacultad());
        System.out.println("Tiempo " + director2.getAnios() + " años en la Facultad");
        
        director1.setAnios(true, 4);
        System.out.println("El tiempo que estara a cargo de la facultad es  "+ director2.getAnios() + " años");
        System.out.println(director2);
    }
    
}
