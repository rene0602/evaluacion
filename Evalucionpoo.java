
package evalucionpoo;

import java.util.Scanner;


public class Evalucionpoo {

    
    public static void main(String[] args) {
       
        Numeros nu = new Numeros();
        Scanner ent= new Scanner(System.in);
        int guardar;
        int arreglo[];
        int a,b=1;
        while(b==1){
            System.out.println("ingrese el tamaño del arreglo");
            a=ent.nextInt();
            arreglo=new int[a];
            for(int i=0;i<a;i++){
                System.out.println("ingrese un numero; ");
                guardar=ent.nextInt();
                arreglo[i]=guardar;
            }
            nu.numeropar_impar();
            nu.numeromay();
            nu.numeromen();
        }
    }
    
}
