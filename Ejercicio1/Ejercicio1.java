/*
Crear un software por consola que ingrese el nombre del alumno y n cantidad 
de notas y al final que me indique el promedio o nota final del alumno
*/


package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    
    //Variables
    String nombre;
    int notas,notaFinal,i;
    double promedio=0,nota;
    
    //Metodos
    public void notas(){
        Scanner leer = new Scanner(System.in);
  
        //Se guarda en la variable nombre el nombre del estudiante
        System.out.println("digite el nombre del estudiante: ");
        nombre = leer.nextLine();
        //Se guarda en la varibale notas la cantidad de notas a digitar
        System.out.println("digite cantidad de notas del estudiante: ");
        notas = leer.nextInt();
        //Se crea el for para la cantidad de notas que se desea ingresar
        for(i=0;i<notas;i++){
            System.out.println("digite nota: ");
            nota = leer.nextInt();
            promedio += nota;
        }
        //Se realiza los calculos y se imprime el resultado
        promedio = promedio/notas; 
        System.out.println("su promedio de notas es de: "+promedio);
        System.out.println("su nota final es de: "+promedio);
    }
    
}
