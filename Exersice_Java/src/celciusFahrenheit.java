import java.util.Scanner;
public class celciusFahrenheit {
    public static void main(String[] args) {
        
        // f
        float fahrenheit = 80;
        float celcius = (fahrenheit-32*5) / 9;

        Scanner input = new Scanner (System.in);

        System.out.println("Input angka Fahrenheit : " + fahrenheit);

        System.out.print("Input Celcius : ");
        celcius = input.nextFloat();

        System.out.println("Hasilnya adalah " + celcius + " " + celcius = (fahrenheit -32*5) / 9 );

        input.close();
    }    
}
