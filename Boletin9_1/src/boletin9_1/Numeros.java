package boletin9_1;

import java.util.Scanner;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Numeros {
    int i,num;
    Scanner teclado=new Scanner(System.in);
    public void Separar(){
        num=teclado.nextInt();
    for(i=0;i<10;i++){
        if (num>0){
            System.out.println("Positivo");
        }
        else if(num==0){
            System.out.println("0");
        }
        else{
        System.out.println("Negativo");
    }
        
    }
        
        }

}

    


