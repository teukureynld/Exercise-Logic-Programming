import java.util.Scanner;
public class celciusFahrenheit {
    public static void main(String[] args) {
        
        // float untuk membagi , hasilnya akan menjadi pecahan.
        // memakai switch 
        double fahrenheit;
        double celcius;

        Scanner input = new Scanner (System.in);

        System.out.print("Input Fahrenheit= " );
        fahrenheit = input.nextDouble();

        System.out.print("Input Celcius = ");
        celcius = input.nextDouble();

        

        input.close();
    }    
}
