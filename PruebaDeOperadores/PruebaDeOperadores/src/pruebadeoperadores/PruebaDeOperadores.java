package pruebadeoperadores;
//Pedi datos:)
import java.util.Scanner;
/**
 *

public class PruebaDeOperadores {
    
    
            int x;
        int y ;
        double z ;
        Scanner in = new Scanner(System.in);
        
        public void calculo(){
        System.out.println("Dame el valor de x");
        x = in.nextInt();
        
        System.out.println("Dame el valor de y");
        y = in.nextInt();
        
        System.out.println("Dame el valor de z");
        z = in.nextInt();
        
        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        y++;
        z--;
        z *= x;
        System.out.println("x + y + z = " + (x + y + z));
            
        }

    public static void main(String[] args) {
        
        PruebaDeOperadores Calculo = new PruebaDeOperadores();
        Calculo . calculo ();


    }

}
