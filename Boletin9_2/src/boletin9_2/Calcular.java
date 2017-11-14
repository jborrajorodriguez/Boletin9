package boletin9_2;



/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Calcular {
    double num;
    private double suma,producto=1;
    
    public void calculo(){ 
        for(num=10;num<91;num++){
            suma=suma+num;
            System.out.println("Suma = "+suma);
            producto=producto*num;
            System.out.println("Multiplicacion = "+producto);
            
        }
    }

}
