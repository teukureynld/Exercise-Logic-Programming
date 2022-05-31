import java.util.Scanner;
public class celciusFahrenheit {
    public static void main(String[] args) {
        
        // f
        float fahrenheit = 0; 
        float celcius = (fahrenheit-32*5) / 9;

        Scanner input = new Scanner (System.in);

        System.out.print("Input angka Fahrenheit : " );
        fahrenheit = input.nextFloat();

        System.out.print("Input Celcius : ");
        celcius = input.nextFloat();

        System.out.println("Hasilnya adalah " + (fahrenheit - 32*5) /9 );

        input.close();
    }    
}
