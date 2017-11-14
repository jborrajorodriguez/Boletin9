package boletin9_5;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Bucle {
    private int opcion;
    Scanner teclado=new Scanner(System.in);
    public void serie(){
        System.out.println("Introduce el número 5 para secuencia a \nIntroduce el número 6 para secuencia b\nIntroduce el número 9 para secuencia c");
        opcion=teclado.nextInt();
        switch(opcion){
            case 5:System.out.println("2 + 4 + 6 + 8 + 10");
            break;
            case 6:System.out.println("- 1 + 2 – 3 + 4 – 5 + 6 ");
            break;
            case 9:System.out.println("0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21");
            break;
            default:System.out.println("Introduce un numero correcto de secuencia");
            
        }
        
    }

}
