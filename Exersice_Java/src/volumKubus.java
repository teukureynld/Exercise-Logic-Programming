import java.Utl.Scanner;
public class volumKubus {
    public static void main(String[] args) {
        
        //N adalah inputan untuk mengisi variable kubus
        int  sisi1 , sisi2 , sisi3;
        int hasil = sisi1*sisi2*sisi3;

        Scanner input = new Scanner(System.in) // salah disini 
        System.out.println("=====Volum kubus by Mystereyn====");
        System.out.println();

        System.out.print("Masukkan angka Variable sisi1 : ");
        sisi1  = input.nextInt();

        System.out.print("Masukkan angka Variable sisi2 : ");
        sisi2 = input.nextInt();

        System.out.print("Masukkan angka variable sisi3 : ");
        sisi3 = input.nextInt();
        
        System.out.println("Hasil keseluruhan = " + hasil);
        
        input.closed(); // untuk menutup terminal secara otomatis

    }
}
