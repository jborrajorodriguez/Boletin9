package boletin9_4;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Multi {
    private int num;
    Scanner teclado=new Scanner(System.in);
    public void tabla(){
        do{
            System.out.println("introduzca número");
            num=teclado.nextInt();
            double x1=num*1;
            double x2=num*2;
            double x3=num*3;
            double x4=num*4;
            double x5=num*5;
            double x6=num*6;
            double x7=num*7;
            double x8=num*8;
            double x9=num*9;
            double x10=num*10;
            System.out.println("Tabla de multiplicar de "+num+"\nx1 ="+x1+"\nx2 ="+x2+"\nx3 ="+x3+"\nx4 ="+x4+"\nx5 ="+x5+"\nx6 ="+x6+"\nx7 ="+x7+"\nx8 ="+x8+"\nx9 ="+x9+"\nx10 ="+x10);
            
        }while(num!=0);
        
        
    }

}
