package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Soldo {
    private float soldo,tipoa=0,tipob=0,tipoc=0,porcentaxe;
    private int fin;
    Scanner teclado=new Scanner(System.in);
    public Soldo(){
        
    }
     public void traballadores(){
         System.out.println("Introduce el sueldo de los trabajadores.Para terminar pulsa 0");
            do{
                soldo=teclado.nextFloat(); 
                if(soldo>0){
                    if(soldo>=1000&&soldo<=1750)
                        tipoa=tipoa+1;
                    else if(soldo>0&&soldo<1000)
                        tipob=tipob+1;
                    else 
                        tipoc=tipoc+1;
                    
                }
                else System.out.println("No se permite sueldo negativo");
            }while(soldo!=0);
            porcentaxe=((tipob/(tipoa+tipob+tipoc))*100);
            System.out.println("Traballadores que ganan entre 1000 y 1750"+tipoa);
            System.out.println("Traballadores que ganan menos de 1000€"+porcentaxe+"%");
            System.out.println("Traballadores que gañan mais de 1750€"+tipoc);
           
         }
    
    
}
