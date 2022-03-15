package CLASE_CUENTA_BANCARIA;

import java.util.Scanner;

public class CLASE_CUENTA_BANCARIA {
    
    public static void main(String[] args){
        IFELSE x = new IFELSE();
        Scanner Leer = new Scanner(System.in);
        Cliente miCli = new Cliente();
        miCli.NroCuenta = 00112233;
        miCli.Nombre = "Juan Perez Sanchez";
        miCli.imprimirDatos();
        x.Preguntar_Saldo();
        x.Depositar_Cuenta();
        x.Realizar_retiro();
        
        }
}

class Cliente{
    public float NroCuenta;
    public String Nombre;
 
    public Cliente() {
        NroCuenta = 0;
        Nombre = "";
        
    }

    public Cliente(float NroCuenta,String Nombre, double Saldo ){
        this.NroCuenta = NroCuenta;
        this.Nombre = Nombre;
    }
    

    public float getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(float NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    void imprimirDatos(){
        System.out.println("El Numero de Cuenta es: " + NroCuenta);
        System.out.println("Su Nombre es: " + Nombre);
    }
    
}
