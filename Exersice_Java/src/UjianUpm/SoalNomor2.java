package UjianUpm;

import java.util.Scanner;
public class SoalNomor2 {
     public static void main (String[] args) {
        int data;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input Sebuah Angka : "); 
        data = scanner.nextInt();
        if(data>0) {
            int i=1;
            System.out.println("Angka yang dapat membagi " + data + " tanpa sisa adalah:");
            do {
               if (data%i==0) {
                  System.out.print(i + " ");
               }
               i++;
            } while (i<=data);
        }
     }
}
