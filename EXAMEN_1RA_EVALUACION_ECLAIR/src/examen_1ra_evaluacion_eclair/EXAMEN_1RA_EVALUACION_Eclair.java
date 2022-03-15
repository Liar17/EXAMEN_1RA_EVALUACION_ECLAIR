/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_1ra_evaluacion_eclair;

/**
 *
 * @author liar4
 */
public class EXAMEN_1RA_EVALUACION_Eclair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Implementacion

        Datosintegrantes estudiante = new Datosintegrantes();
        estudiante.Equipo = "Ecleir";
        estudiante.Nombres = "juan yahir";
        estudiante.Apellidos = "rodriguez pasos";
        estudiante.Carrera = "Sistemas computacionales";
        estudiante.Ncontrol = "21550315";
        estudiante.imprimirDatosEquipo();

        Datosintegrantes estudiante2 = new Datosintegrantes();
        estudiante2.Nombres = "cristian axel";
        estudiante2.Apellidos = "caballero gamboa";
        estudiante2.Carrera = "sistemas computacionales";
        estudiante2.Ncontrol = "21550893";
        estudiante2.imprimirDatosEquipo();

        Datosintegrantes estudiante3 = new Datosintegrantes();
        estudiante3.Nombres = "azul siret";
        estudiante3.Apellidos = "cordero gonzales";
        estudiante3.Carrera = "sistemas computacionales";
        estudiante3.Ncontrol = "21550381";
        estudiante3.imprimirDatosEquipo();

    }

}

class Datosintegrantes {

    //Atributos de la clase
    String Nombres;
    String Apellidos;
    String Carrera;
    String Ncontrol;
    String Equipo;

    void imprimirDatosEquipo() {
        System.out.println("el nombre del Equipo es: " + Equipo);
        System.out.println("sus Nombres es: " + Nombres);
        System.out.println("Sus Apellidos son " + Apellidos);
        System.out.println("Su Carrera es " + Carrera);
        System.out.println("Su Ncontrol es  " + Ncontrol);

    }

}
