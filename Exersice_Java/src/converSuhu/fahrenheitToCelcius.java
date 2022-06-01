package converSuhu;
import java.util.Scanner;
public class fahrenheitToCelcius {

    public static void main(String[] args) {
        
        
        double f , c; 

        Scanner input = new Scanner (System.in);

        System.out.println("=== By Mystereyn ===");
        System.out.println();
        
        System.out.print("Input angka untuk di convert : " );
        f = input.nextDouble();

        c = ((f-32) *5 / 9);  
        System.out.println("Hasil dari fahrenheit ke celcius adalah " + c);


        input.close();
    }
       
}
