package UjianUpm;
import java.util.Scanner;
import java.util.Arrays; //method untuk mengubah objek array ke String

public class SoalNomor5 {
    public static void main(String[] args) {

        //ini element array kosong, yang nantinya berfungsi untuk menampilkan output
         int[] DataNilai = new int[5]; 
         Scanner input = new Scanner(System.in);
        
         for(int i =0; i < DataNilai.length; i++) {
            System.out.print("Input bilangan ke-"  + (i+1) + ":" + " ");
            DataNilai[i] = input.nextInt();

         } System.out.println("============================================"); 
         System.out.println("Data yang diinput adalah" + ":" + (Arrays.toString(DataNilai)));

        input.close();
    } 
}
