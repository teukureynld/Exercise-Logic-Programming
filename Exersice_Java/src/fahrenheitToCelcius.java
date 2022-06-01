import java.util.Scanner;
public class fahrenheitToCelcius {

    public static void main(String[] args) {
        
        
        float f; // fahrenheit 
        float c;
        int hasil = (int) (f = - 32) *5/9; //convert float ke integer

        Scanner input = new Scanner (System.in);

        System.out.print("Input angka Fahrenheit : " );
        f = input.nextFloat();

        System.out.print("Input Celcius : ");
        c = input.nextFloat();

        System.out.println("Hasilnya adalah " + hasil); //celcius 

        input.close();
    }
       
}
