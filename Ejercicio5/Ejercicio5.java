
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    //Variables
    int num,z = 1,x = 0,y = 1; 
    //Metodos
    public void serie(){
        Scanner leer = new Scanner(System.in);
        //Se guarda en la variable num la cantidad de numeros que se van a imprimir por pantalla
        System.out.println("Digite hasta que numero desea: ");
        num = leer.nextInt();
	System.out.println("1 ");
	for(int i=1;i<num;i++){
            if(num<=num){
                z=x+y;
                System.out.println(z);
                x=y;
                y=z;    
            }      		
	}
    }
}
