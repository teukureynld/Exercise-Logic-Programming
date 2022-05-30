import java.util.Scanner;
public class volumKubus {
    public static void main(String[] args) {
        
        //hasil adalah inputan untuk mengisi variable kubus
        int sisi1;
        int sisi2;
        int sisi3;

        Scanner input = new Scanner (System.in); // salah disini 
        System.out.println("=====Volum kubus by Mystereyn====");
        System.out.println();

        System.out.print("Masukkan angka Variable sisi1 : ");
        sisi1 =  input.nextInt();

        System.out.print("Masukkan angka Variable sisi2 : ");
        sisi2 = input.nextInt();

        System.out.print("Masukkan angka variable sisi3 : ");
        sisi3 = input.nextInt();
        
        System.out.println("Hasil keseluruhan = " +  (sisi1*sisi2*sisi3));
        
    }
}