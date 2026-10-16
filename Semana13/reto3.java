package Semana13;

import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner (System.in)){

        double edad;
        double promedio = 0;

        for(int i=1; i<=3; i++){
            System.out.println("Ingrese la edad del animal "+ i+" :");
            edad = teclado.nextDouble();

            promedio += edad;
        }
        promedio = promedio/3;
        System.out.println("El promedio de las edades es: "+Math.round(promedio));

        teclado.close();
        }
    }
    
}