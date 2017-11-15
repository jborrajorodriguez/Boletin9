package boletin9_5;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Bucle {
    private int opcion,num,total=0,z=0,x,n=0,n1=0,n2,fib1=0;
    Scanner teclado=new Scanner(System.in);
    public void serie(){
        System.out.println("Introduce el número 1 para secuencia a \nIntroduce el número 2 para secuencia b\nIntroduce el número 3 para secuencia c");
        opcion=teclado.nextInt();
        switch(opcion){
            case 1:System.out.println("Introduce número de elementos:");
                int a=teclado.nextInt();
                    for(z=0;z!=a;z++){
                        total=total+2;
                        System.out.print("+"+total);
                    }
            break;
            case 2:System.out.println("Introduce número de elementos");
                    int b=teclado.nextInt();
                    for(z=0;z!=b;z++){
                        total=total+1;
                        if(total%2!=0){
                        System.out.print("-"+total);}
                        else{System.out.print("+"+total);
                        }
                    }
            break;
            case 3:System.out.println("Introduce número de elementos");
                     int c=teclado.nextInt();
                     for(z=0;z!=c;z++){
                        
                        System.out.println("1");
                     }   
            break;
            default:System.out.println("Introduce un numero correcto de secuencia");
            
        }
        
    }

}
