package TEST_COVID;

import java.util.Scanner;

public class IFELSE {
    
    private int enfermedad;
    private int edad;
    private double peso;
    private double estatura;
    private double IMC;
    Scanner  Leer = new Scanner(System.in);
    
    public IFELSE() {

   }
   public void calcularPersonaRiesgo(){
        System.out.println("Usted tiene alguna enfermedad cronica SI=1 NO=0");
        enfermedad = Leer.nextInt();
        
        condicionEnf();     
    }
    public void condicionEnf(){
        
        if(enfermedad == 1){
            System.out.println("PERSONA DE RIESGO");
        }else{
            System.out.println("PERSONA SIN RIESGO");
        }
    
    }
    public void calcularPersonaRiesgoEdad(){
        System.out.println("Cual es su edad");
        edad = Leer.nextInt();
        
        condicionEdad();     
    }
    public void condicionEdad(){
        
        if(edad >= 65){
            System.out.println("PERSONA DE RIESGO");
        }else{
            System.out.println("PERSONA SIN RIESGO");
        }
    
    }
     public void calcularPersonaestatura(){
        System.out.println("Cual es su Estatura en metros");
        estatura = Leer.nextDouble();
            
    }
     public void calcularPersonaRiesgoPeso(){
        System.out.println("Cual es su peso");
        peso = Leer.nextDouble();
        
        condicionIMC();     
    }
    public void condicionIMC(){
        
        IMC = peso/Math.pow(estatura, 2);
        if(IMC > 30){
            System.out.println("PERSONA DE RIESGO");
        }else{
            System.out.println("PERSONA SIN RIESGO");
        }
    
    }

}
