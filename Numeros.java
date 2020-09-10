
package evalucionpoo;

import java.util.Scanner;



public class Numeros {
    int numero[];
    public void numeropar_impar(){
        
        int par, impar;
        for(int i=0;i<numero.length;i++)
            if (numero[i]%2==1){
                System.out.println("El numero ingresdo es par; "+numero[i]);
            }else{
                System.out.println("El numero ingresado es impar; "+ numero[i]);
            }
    }
    public void numeromen(){
         int mayor = 0;
         for(int i=0;i<numero.length+1;i++){
             if(numero[i]>numero[i-1]){
                 mayor= numero[i];
            }
             
        }       
         System.out.println(mayor);
    }
    public void numeromay(){
        int menor = 0;
         for( int j=0;j<numero.length-1;j++){
             if(numero[j]>numero[j+1]){
                 menor=numero[j];
             }
                 
                 
         }
         System.out.println(menor);
    }
}
