/*
Desarrolar un programa que idenifique en que categoria debo registrame segun
estos datos.
*/


package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    //Variables
    int edad;
    //Metodos
    public void categoria(){
        Scanner leer = new Scanner(System.in);
        System.out.println("digite su edad: ");
        edad = leer.nextInt();
        if(edad<=6){
            System.out.println("su categoria es Pre-infantil");
        }
        if(edad>=7 && edad<=17){
        System.out.println("su categoria es infantil");
        }
        if(edad>=18 && edad<=25){
        System.out.println("su categoria es juvenil");
        }
        if(edad>=26 && edad<=45){
        System.out.println("su categoria es mayores");
        }
        if(edad>=60){
        System.out.println("su categoria es veteranos");
        }
    }
}
