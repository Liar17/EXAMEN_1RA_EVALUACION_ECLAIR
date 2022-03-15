package TEST_COVID;

import java.util.Scanner;

public class TEST_COVID {
    
    public static void main(String[] args){
        IFELSE x = new IFELSE();
        x.calcularPersonaRiesgo();
        x.calcularPersonaRiesgoEdad();
        x.calcularPersonaestatura();
        x.calcularPersonaRiesgoPeso();
        
        Scanner Leer = new Scanner(System.in);
        Persona miPer = new Persona();
        }
}
class Persona{
    public int edad;
    public double peso;
    public double estatura;
    public int enfermedad;

    public int getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(int enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
}