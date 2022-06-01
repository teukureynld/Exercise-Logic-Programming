package converSuhu;
import java.util.Scanner;

public class SuhuCase {
    public static void main(String[] args) {
        
        /*  Celcius to Reamur      R : (c) * 4/5
        *   Celcius to Fahrenheit  [°F] = [°C] × 9/5 + 32
            Celcius to Kelvin      K : C + 273

            Using Switch Lambda.

        */
        int suhu;
        double c, r, f , k;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("==== By Mystereyn ====");
        System.out.println();
        
        //untuk memilih beberapa case yang akan ingin di inputkan 
        System.out.print("Pilih case yang keberapa : " );
        suhu = input.nextInt();

        switch(suhu) {
            
            //Celcius ke Reamur
            case 1 :
                System.out.print("Input nilai Celcius : ");
                c = input.nextFloat();
                
                r =  ((c) * 4/5); //convert widening
                System.out.println("Hasil konversinya adalah : " + r);
                break;
            
            // Celcius ke Fahrenheit
            case 2 : 
                System.out.print("Input nilai celcius : " );
                c = input.nextFloat();

                f =  ((c)) *  9/5 + 32;
                System.out.println("Hasilnya konversinya adalah : " + f);
                break;

            case 3 : 
                

            }
            input.close();
    }
}

