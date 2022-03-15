package CLASE_CUENTA_BANCARIA;

import java.util.Scanner;

public class IFELSE {
    
    private double Deposito;
    private double Saldo;
    private double Retiro;
    Scanner  Leer = new Scanner(System.in);
    
    public IFELSE() {

   }
   public void Preguntar_Saldo(){
        System.out.println("Cual es su saldo");
        Saldo = Leer.nextInt();         
    }
   
    public void Depositar_Cuenta(){
        System.out.println("Cuanto va depositar en la cuenta");
        Deposito = Leer.nextDouble();
        
        Realizar_deposito();     
    }
    public void Realizar_deposito(){
        Saldo = Saldo + Deposito;
        
        System.out.println("Deposito Realizado con exito");
    
    }
    public void Realizar_retiro(){
        System.out.println("Cuanto va retirar de su cuenta");
        Retiro = Leer.nextDouble();
        
        condicionDeposito();
    
    }
    public void condicionDeposito(){
        
        Saldo = Saldo - Retiro;
        if(Saldo >= 0){
            System.out.println("Retiro con exito");
        }else{
            Saldo = Saldo + Retiro;
            System.out.println("Su retiro excede el saldo en su cuenta");
        }
    
    }

}
