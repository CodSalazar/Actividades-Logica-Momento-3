package Semana13;

import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {

        try(Scanner teclado =new Scanner (System.in)){
        String clave = "";
        
        while(!clave.equals("JAVA2026")){

            System.out.println("Ingrese su contraseña: ");
            clave = teclado.nextLine();

            if(!clave.equals("JAVA2026")){
                System.out.println("Contraseña incorrecta.");
            }
            else{
                System.out.println("Contraseña correcta.");
                System.out.println("Bienvenido!");
            }

        }
    
        teclado.close();
        }
    }
    
}