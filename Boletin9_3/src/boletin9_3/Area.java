package boletin9_3;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Area {
    int base,altura;
    Scanner teclado=new Scanner(System.in);
    
    public void calcular(){
        System.out.println("Introducir en metros la base");
        base=teclado.nextInt();
        System.out.println("Introducir en metro la altura");
        altura=teclado.nextInt();
        if(altura>0&&base>0){
            int area=altura*base/2;
            System.out.println("El area es = "+area+"m²");
        }
    }

}
